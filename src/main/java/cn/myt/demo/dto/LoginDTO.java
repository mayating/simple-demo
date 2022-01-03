package cn.myt.demo.dto;

import lombok.Data;

/**
 * @description 登陆业务实体类
 * @className: LoginDTO
 * @author: mayating
 * @date: 2022/1/2
 */
@Data
public class LoginDTO {

    private String loginName;
    private String password;
}
