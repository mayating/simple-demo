package cn.myt.demo.service.impl;

import cn.myt.demo.common.Result;
import cn.myt.demo.dto.LoginDTO;
import cn.myt.demo.mapper.UserMapper;
import cn.myt.demo.model.User;
import cn.myt.demo.service.LoginService;
import cn.myt.demo.util.JwtUtil;
import cn.myt.demo.vo.LoginVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: mayating
 * @date: 2022/1/2
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Result login(LoginDTO loginDTO) {
        if (Strings.isNullOrEmpty(loginDTO.getLoginName())) {
            return Result.fail("账号不能为空");
        }
        if (Strings.isNullOrEmpty(loginDTO.getPassword())) {
            return Result.fail("密码不能为空");
        }
        //通过登录名查询用户
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("login_name", loginDTO.getLoginName());
        User user = userMapper.selectOne(wrapper);
        //比较密码
        if (user != null && user.getPassword().equals(loginDTO.getPassword())) {
            LoginVO loginVO = new LoginVO();
            loginVO.setId(user.getId());
            //这里token直接使用一个uuid
            //使用jwt的情况下，会生成一个jwt token, jwt token 里会包含用户的信息
            //loginVO.setToken(UUID.randomUUID().toString());
            //loginVO.setUser(user);
            log.info("登录成功！生成token! ");
            String token = JwtUtil.createToken(user);
            loginVO.setToken(token);
            loginVO.setUser(user);
            return Result.success(loginVO);
        }
        return Result.fail("登陆失败");
    }
}
