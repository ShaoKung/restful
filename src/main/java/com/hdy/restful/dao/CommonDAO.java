package com.hdy.restful.dao;

import com.hdy.restful.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<Order> findAll() {
        String sql = "select * from sys_user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Order.class));
    }
}
