package cn.myt.demo.vo;

import cn.myt.demo.model.User;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: mayating
 * @date: 2022/1/2
 * @description 登陆VO
 */
@Data
public class LoginVO implements Serializable {
    private static final long serialVersionUID = -8127913844523140404L;

    private Integer id;
    private String token;
    private User user;
}
