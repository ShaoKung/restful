package com.hdy.restful.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: restful
 * @description: restful api入口控制器
 * @author: Andy
 * @create: 2019-10-29 14:58
 **/


@RestController
@RequestMapping(value="/common")
public class CommonController {

    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.GET)
    public List<Object> getResourceByID(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        if(resource.equals("")){
            throw new RuntimeException("请传入资源名称");
        }
        return re;
    }

    @RequestMapping(value="/{resource}/{id}", method= RequestMethod.DELETE)
    public List<Object> delResource(@PathVariable String resource,@PathVariable Long id) {
        List<Object> re = new ArrayList<Object>();
        if(resource.equals("")){
            throw new RuntimeException("请传入资源名称");
        }
        return re;
    }

    @RequestMapping(value="/{resource}", method= RequestMethod.DELETE)
    public List<Object> getResourceALL(@PathVariable String resource,@PathVariable Long id) {
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
