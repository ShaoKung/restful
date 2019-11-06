package com.hdy.restful.dao.impl;

import com.hdy.restful.dao.CommonDAO;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @program: restful
 * @description: 通用查询实现类
 * @author: Andy
 * @create: 2019-10-30 00:02
 **/


public abstract class CommonDAOImpl implements CommonDAO {

    private final Logger logger = Logger.getLogger(this.getClass());

    protected abstract NamedParameterJdbcTemplate getNameJdbcTemplate();

    public CommonDAOImpl(){

    }

    @Override
    public List<Map<String, Object>> queryListBySql(String sql, Map<String, Object> param) {
        this.logger.debug("sql===>" + sql + ";" + "paramMap===>" + param);
        return this.getNameJdbcTemplate().queryForList(sql, param);
    }

    @Override
    public List<Map<String, Object>> queryListBySqlId(String sqlId, Map<String, Object> param) {
        //String sql = this.sqlCache.getSql(sqlId);
        this.logger.debug("sql===>" + sqlId + ";" + "paramMap===>" + param);
        return this.getNameJdbcTemplate().queryForList(sqlId, param);    }
}
