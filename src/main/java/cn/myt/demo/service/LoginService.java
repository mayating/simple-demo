package cn.myt.demo.service;

import cn.myt.demo.common.Result;
import cn.myt.demo.dto.LoginDTO;

/**
 * @author: mayating
 * @date: 2022/1/2
 */
public interface LoginService {

    Result login(LoginDTO loginDTO);
}
