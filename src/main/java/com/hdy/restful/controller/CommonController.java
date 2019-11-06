package com.hdy.restful.controller;

import com.hdy.restful.dao.CommonDAO;
import com.hdy.restful.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: restful
 * @description: restful api入口控制器
 * @author: Andy
 * @create: 2019-10-29 14:58
 **/


@RestController
@RequestMapping(value="/common")
public class CommonController {

    @Autowired
    private ResourceService resourceService;

    @Autowired
    private CommonDAO commonDAO;


    @RequestMapping(value="/{resource}/{pSize}/{sPage}/{ePage}", method= RequestMethod.GET)
    public List<Map<String,Object>> getResourceALL(@PathVariable String resource,@PathVariable Long pSize,@PathVariable Long sPage,@PathVariable Long ePage) {
        if(resource.equals("")||resource.isEmpty()){
            throw new RuntimeException("请传入资源名称");
        }
        return new ArrayList<>();
    }

}
