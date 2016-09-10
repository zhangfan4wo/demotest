package com.demo.dao.impl;

import com.demo.dao.JobQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/8/25.
 */
    @Repository
    public class JobQueryDaoImpl implements JobQueryDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> queryJobQueryDao() {

        return jdbcTemplate.queryForList("SELECT * FROM `t_pub_schjob` LIMIT  0,1000");
    }

}

