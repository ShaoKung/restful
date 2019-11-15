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
import java.util.logging.Logger;

/**
 * @program: restful
 * @description: restful api入口控制器
 * @author: Andy
 * @create: 2019-10-29 14:58
 **/


@RestController
@RequestMapping(value="/common")
public class CommonController {
    protected static Logger logger;

    @Autowired
    private ResourceService resourceService;

    @Autowired
    private CommonDAO commonDAO;


    @RequestMapping(value="/{resource}/{pSize}/{sPage}/{ePage}", method= RequestMethod.GET)
    public List<Map<String,Object>> getResourceALL(@PathVariable String resource,@PathVariable Long pSize,@PathVariable Long sPage,@PathVariable Long ePage) {
        List<Map<String,Object>> re = new ArrayList<>();
        if(resource.equals("")||resource.isEmpty()||pSize==0||sPage==null||ePage==null){
            logger.info("必传参数为空");
            return re;
        }
        Map param=new HashMap();
        param.put("resource",resource);
        param.put("pSize",pSize);
        param.put("sPage",sPage);
        param.put("ePage",ePage);
        re=resourceService.findAll(param);
        return re;
    }

    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.GET)
    public Map<String,Object> getResourceOneById(@PathVariable String resource,@PathVariable Long id) {
        Map<String,Object> re = new HashMap<>(16);
        if(resource.equals("")||resource.isEmpty()||id==null){
            logger.info("必传参数为空");
            return re;
        }
        Map param=new HashMap();
        param.put("resource",resource);
        param.put("id",id);
        return resourceService.findOneById(param);
    }

}
