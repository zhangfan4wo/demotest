package com.demo.dao.impl;

import com.demo.dao.QueryZFDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangfanfan on 16-9-5.
 */
@Repository
public class QueryZFDaoImpl  implements QueryZFDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> queryZF() {
        return jdbcTemplate.queryForList("SELECT * FROM table_zhangfan");
    }
}
