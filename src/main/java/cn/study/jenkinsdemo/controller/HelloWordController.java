package cn.study.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 * @author liufp
 * @date 2019/12/13
 */
@RestController
public class HelloWordController {
    @GetMapping("/test")
    public String hello(){
        return "你好====";
    }
    @GetMapping("/list")
    public String list(){
        return "欢迎来到申迪====";
    }
    @GetMapping("/showTime")
    public String showTime(){
        return new Date().toString();
    }

}
