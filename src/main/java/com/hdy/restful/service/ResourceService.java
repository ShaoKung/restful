package com.hdy.restful.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface ResourceService {
    List<Map<String,Object>> getResourceALL(String resource,Long pSize,Long sPage, Long ePage);
}
