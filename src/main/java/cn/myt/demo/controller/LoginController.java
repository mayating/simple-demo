package cn.myt.demo.controller;

import cn.myt.demo.common.Result;
import cn.myt.demo.dto.LoginDTO;
import cn.myt.demo.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 登陆业务响应
 *
 * @author: mayating
 * @date: 2022/1/2
 */
@RestController
public class LoginController {

    @Resource
    LoginService loginService;

    @PostMapping(value = "/api/login")
    //@CrossOrigin //后端跨域
    public Result login(@RequestBody LoginDTO loginDTO) {
        return loginService.login(loginDTO);
    }
}
