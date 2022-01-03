package cn.myt.demo.controller;

import cn.myt.demo.common.Result;
import cn.myt.demo.dto.QueryDTO;
import cn.myt.demo.model.User;
import cn.myt.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description 用户管理
 * @author: mayating
 * @date: 2022/1/2
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/api/user/list")
    public Result userList(@RequestBody QueryDTO queryDTO) {
        return Result.success(userService.selectUserPage(queryDTO));
    }

    @PostMapping("/api/user/add")
    public Result addUser(@RequestBody User user) {
        return Result.success(userService.addUser(user));
    }

    @PostMapping("/api/user/update")
    public Result updateUser(@RequestBody User user) {
        return Result.success(userService.updateUser(user));
    }

    @PostMapping("/api/user/delete")
    public Result deleteUser(Integer id) {
        return Result.success(userService.deleteUser(id));
    }

    @PostMapping("/api/user/delete/batch")
    public Result batchDeleteUser(@RequestBody List<Integer> ids) {
        userService.batchDelete(ids);
        return Result.success("");
    }
}
