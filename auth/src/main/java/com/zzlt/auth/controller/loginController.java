package com.zzlt.auth.controller;

import com.zzlt.auth.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class loginController {

    @RequestMapping("/in")
    public String  login(@RequestBody UserVo userVo){

        return  "登录成功";
    }

}
