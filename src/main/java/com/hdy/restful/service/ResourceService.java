package com.hdy.restful.service;

import java.util.List;
import java.util.Map;


public interface ResourceService {
    public List<Map<String,Object>> findAll(Map param);

    public Map<String,Object> findOneById(Map param);
}
