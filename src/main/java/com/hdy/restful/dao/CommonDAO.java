package com.hdy.restful.dao;

import com.hdy.restful.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: restful
 * @description: 通用查询类
 * @author: Andy
 * @create: 2019-11-06 18:34
 **/

@Repository
public class CommonDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Map<String,Object>> findAll(Map param) {
        Map paramMap=new HashMap();
        paramMap.put("ID",1);
        String sql = "SELECT * FROM T_COMMON_RESOURCE where ID=:ID";
        //return jdbcTemplate.queryForList(sql, 1);
        //jdbcTemplate.queryForList(sql,new String[]{"",""});
        return namedParameterJdbcTemplate.queryForList(sql,paramMap);
    }
}
