package com.hdy.restful.service.impl;

import com.hdy.restful.dao.CommonDAO;
import com.hdy.restful.entity.Resource;
import com.hdy.restful.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: restful
 * @description: 资源服务实现类
 * @author: Andy
 * @create: 2019-10-29 17:55
 **/

@Component
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private CommonDAO commonDAO;

    @Override
    public List<Map<String,Object>> findAll(Map param) {
        return commonDAO.findAll(param);
    }

    @Override
    public Map<String,Object> findOneById(Map param){
        return commonDAO.findOneById(param);
    }
}
