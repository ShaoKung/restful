package com.hdy.restful.dao;

import com.hdy.restful.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
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
        String rSql = "SELECT * FROM T_COMMON_RESOURCE where resName=:resource";
        String sql="";
        List<Map<String,Object>> sqlConfig= namedParameterJdbcTemplate.queryForList(rSql,param);
        if(sqlConfig.size()>0){
            Map<String,Object> mapConfig=sqlConfig.get(0);
            sql=(String)mapConfig.get("RESV1");
        }
        List<Map<String,Object>> reList= namedParameterJdbcTemplate.queryForList(sql,param);
        return reList;
    }

    public Map<String,Object> findOneById(Map param) {
        String rSql = "SELECT * FROM T_COMMON_RESOURCE where resName=:resource";
        String sql="";
        List<Map<String,Object>> sqlConfig= namedParameterJdbcTemplate.queryForList(rSql,param);
        if(sqlConfig.size()>0){
            Map<String,Object> mapConfig=sqlConfig.get(0);
            sql=(String)mapConfig.get("RESV1");
        }
        Map<String,Object> reMap= namedParameterJdbcTemplate.queryForMap(sql,param);
        return reMap;
    }
}
