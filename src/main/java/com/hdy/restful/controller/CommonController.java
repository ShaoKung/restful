package com.hdy.restful.controller;

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

    @RequestMapping(value="/{resource}", method= RequestMethod.DELETE)
    public List<Object> getResourceALL(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        if(resource.equals("")){
            throw new RuntimeException("请传入资源名称");
        }
        return re;
    }

    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.GET)
    public Object getResourceByID(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        Map reMap=new HashMap<>(16);
        //数据库查询resource对应的配置，配置信息包含，【配置唯一ID，资源名，需要返回的字段，查询的SQL，是否只支持查询【0：只支持查询，1：支持更新】，描述】
        Map<String,String> config=null;
        //如果没配置则抛出异常，否则继续进行
        if(resource.equals("")){
            reMap.put("code","9999");
            reMap.put("desc","执行异常");
            reMap.put("data",re);
        }else{
            reMap.put("code","0000");
            reMap.put("desc","执行成功");
            reMap.put("data",re);
        }
        return reMap;
    }

    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.DELETE)
    public List<Object> delResource(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        if(resource.equals("")){
            throw new RuntimeException("请传入资源名称");
        }
        return re;
    }


    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.PUT)
    public List<Object> saveResource(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        if(resource.equals("")){
            throw new RuntimeException("请传入资源名称");
        }
        return re;
    }

    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.POST)
    public List<Object> updateResource(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        if(resource.equals("")){
            throw new RuntimeException("请传入资源名称");
        }
        return re;
    }
}
