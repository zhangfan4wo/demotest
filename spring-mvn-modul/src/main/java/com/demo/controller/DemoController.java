package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.dao.JobQueryDao;
import com.demo.dao.QueryZFDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**Error listenerStart
 * Created by zhangfanfan on 16-9-5.
 */
@RequestMapping("/")
@Controller
public class DemoController {
    @Autowired
    QueryZFDao queryZFdao;
    @Autowired
    JobQueryDao jobQueryDao;

    @RequestMapping("demo")
    @ResponseBody
    public Object demo(){
        List<Map<String,Object>> result=queryZFdao.queryZF();
        return JSON.toJSONString(result);
    }

    @RequestMapping("ZF")
    @ResponseBody
    public Object queryZF1(){
        return "hello";
    }

    @RequestMapping("jobquery")
    @ResponseBody
    public List<Map<String,Object>> demo1(){
        return jobQueryDao.queryJobQueryDao();
    }
}
