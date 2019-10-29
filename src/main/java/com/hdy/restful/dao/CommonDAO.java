package com.hdy.restful.dao;

import java.util.List;
import java.util.Map;

/**
 * @program: restful
 * @description: 通用数据库查询接口
 * @author: Andy
 * @create: 2019-10-29 23:58
 **/

public interface CommonDAO {

    /**
     * @description: 根据SQL查询
     * @author: Andy
     * @create: 2019-10-29 23:58
     **/
    List<Map<String, Object>> queryListBySql(String sql, Map<String, Object> param);
    /**
     * @description: 根据SQLID查询
     * @author: Andy
     * @create: 2019-10-29 23:58
     **/
    List<Map<String, Object>> queryListBySqlId(String sqlId, Map<String, Object> param);

}
