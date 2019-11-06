package com.hdy.restful.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

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
        return createDataSource("spring");
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
        return dataSource;
    }

}
