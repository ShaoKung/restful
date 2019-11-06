package com.hdy.restful.config;

import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @program: restful
 * @description: SQL缓存类
 * @author: Andy
 * @create: 2019-10-30 00:26
 **/

@Lazy
@Repository
public class SQLCache {

    private static long EXPIRE = 30000L;
    private ConcurrentMap<String, String> sqlConfig = new ConcurrentHashMap();
    private ConcurrentMap<String, Long> sqlTimeConfig = new ConcurrentHashMap();
    @Resource(
            name = "paramNamedJdbcTemplate"
    )
    private NamedParameterJdbcTemplate nameJdbcTemplate2;

    public SQLCache() {
    }

    public String getSql(String sqlId) {
        String sql = "";
        if (!this.sqlConfig.containsKey(sqlId) || !this.sqlTimeConfig.containsKey(sqlId + "_CACHE_TIME") || System.currentTimeMillis() - (Long)this.sqlTimeConfig.get(sqlId + "_CACHE_TIME") > EXPIRE) {
            Map<String, String> map = new HashMap();
            map.put("vsql_id", sqlId);
            Object list = new ArrayList();

            try {
                list = this.nameJdbcTemplate2.queryForList("select * from sql_config where sql_id=:vsql_id and use_tag='1'", map);
            } catch (Exception var6) {
                var6.printStackTrace();
            }

            if (list != null && !((List)list).isEmpty()) {
                this.sqlConfig.put(((Map)((List)list).get(0)).get("sql_id").toString(), ((Map)((List)list).get(0)).get("sql_context").toString());
                this.sqlTimeConfig.put(sqlId + "_CACHE_TIME", System.currentTimeMillis());
            }
        }

        sql = (String)this.sqlConfig.get(sqlId);
        return sql == null ? sqlId + "is not define,please check your sql_config" : sql;
    }

}
