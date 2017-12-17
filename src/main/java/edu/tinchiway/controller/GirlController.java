package edu.tinchiway.controller;

import com.alibaba.fastjson.JSON;
import edu.tinchiway.domain.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author TinChiWay
 * @date 2017/12/5.
 */

@RestController
/**
 * @Controller+@ResponseBody 返回json数据格式的控制器
 * */
@RequestMapping("/hello")
public class GirlController {

    @Autowired
    private GirlProperties girlProperties;

    /**
     * @PathVariable 获取url中数据
     * @RequestParam 获取请求参数的值
     * @GetMapping 组合注解
     */

    //@RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")//组合注解
    public String say(@RequestParam(value = "id", required = false, defaultValue = "200") Integer id, @RequestParam("name") String name) {
        //使用@PathVariable("id") 获取/say/{id}
        return JSON.toJSONString(girlProperties) + id + name;
    }


}
