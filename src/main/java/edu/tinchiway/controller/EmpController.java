package edu.tinchiway.controller;

import com.alibaba.fastjson.JSON;
import edu.tinchiway.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工控制器
 *
 * @author TinChiWay
 * @date 2017/12/14
 */
@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    EmpMapper empMapper;

    @GetMapping("list")
    public String getList(){
        return JSON.toJSONString(empMapper.list());
    }
}
