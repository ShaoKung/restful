package com.hdy.restful.common;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @program: restful
 * @description: 数据库生成层
 * @author: Andy
 * @create: 2019-10-29 22:15
 **/

@Component
public class DatabaseConfig {

    @Autowired
    private Environment environment;

    @Bean("reportNamedJdbcTemplate")
    public NamedParameterJdbcTemplate reportNamedParameterJdbcTemplate() {
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(reportDatasource());
        return namedParameterJdbcTemplate;
    }

    private BasicDataSource createDataSource(String datasourceKey){
        return null;
    }

}
