package com.hdy.restful.common;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @program: restful
 * @description: 数据库生成层
 * @author: Andy
 * @create: 2019-10-29 22:15
 **/

@Component
public class DBConfig {

    @Autowired
    private Environment environment;

    public DataSource paramDatasource() {
        return createDataSource("param");
    }

    @Bean("paramNamedJdbcTemplate")
    public NamedParameterJdbcTemplate paramNamedParameterJdbcTemplate() {
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(paramDatasource());
        return namedParameterJdbcTemplate;
    }

    private BasicDataSource createDataSource(String datasourceKey){

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getProperty(datasourceKey + ".datasource.driverClassName", "com.mysql.jdbc.Driver"));
        dataSource.setUrl(environment.getProperty(datasourceKey + ".datasource.url"));
        dataSource.setUsername(environment.getProperty(datasourceKey + ".datasource.username"));
        dataSource.setPassword(environment.getProperty(datasourceKey + ".datasource.password"));
        dataSource.setMaxActive(Integer.parseInt(environment.getProperty(datasourceKey + ".datasource.maxActive", "8")));
        dataSource.setMaxIdle(Integer.parseInt(environment.getProperty(datasourceKey + ".datasource.maxIdle", "8")));
        dataSource.setMinIdle(Integer.parseInt(environment.getProperty(datasourceKey + ".datasource.minIdle", "0")));
        dataSource.setInitialSize(Integer.parseInt(environment.getProperty(datasourceKey + ".datasource.initialSize", "0")));
        dataSource.setTestOnReturn(Boolean.parseBoolean(environment.getProperty(datasourceKey + ".datasource.testOnReturn", "false")));
        dataSource.setTestWhileIdle(Boolean.parseBoolean(environment.getProperty(datasourceKey + ".datasource.testWhileIdle", "false")));
        dataSource.setTestOnBorrow(Boolean.parseBoolean(environment.getProperty(datasourceKey + ".datasource.testOnBorrow", "true")));
        dataSource.setLogAbandoned(Boolean.parseBoolean(environment.getProperty(datasourceKey + ".datasource.logAbandoned", "false")));
        dataSource.setValidationQuery(environment.getProperty(datasourceKey + ".datasource.validationQuery"));
        dataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(environment.getProperty(datasourceKey + ".datasource.timeBetweenEvictionRunsMillis", "-1")));
        dataSource.setMinEvictableIdleTimeMillis(Long.parseLong(environment.getProperty(datasourceKey + ".datasource.minEvictableIdleTimeMillis", "1800000")));
        dataSource.setRemoveAbandoned(Boolean.parseBoolean(environment.getProperty(datasourceKey + ".datasource.removeAbandoned", "false")));

        return dataSource;
    }

}
