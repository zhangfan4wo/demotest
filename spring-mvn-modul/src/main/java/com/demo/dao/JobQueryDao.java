package com.demo.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/8/25.
 */
public interface JobQueryDao {
    /**
     * 查询job表中的全部内容
     *
     * @return
     */
    public List<Map<String, Object>> queryJobQueryDao();
}
