package com.hdy.restful.service;

import com.hdy.restful.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface ResourceService {
    public List<Order> findAll();}
