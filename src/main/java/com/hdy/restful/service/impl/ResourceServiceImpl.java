package com.hdy.restful.service.impl;

import com.hdy.restful.dao.CommonDAO;
import com.hdy.restful.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

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
    public List<Map<String, Object>> getResourceALL(String resource,Long pSize,Long sPage, Long ePage) {
        Map param=new HashMap();
        param.put("ID","SEL_CLASSROOM_BASIC_ALL");
        List<Map<String,Object>> config=commonDAO.queryListBySql("SELECT * FROM T_PARAM_SQL_CONFIG",param);
        param.put("ID","3");
        return commonDAO.queryListBySql("SELECT * FROM T_CLASSROOM_BASIC_INFO",param);
    }
}
