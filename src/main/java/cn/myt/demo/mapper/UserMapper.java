package cn.myt.demo.mapper;

import cn.myt.demo.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @className: UserMapper
 * @description: 用户mapper
 * @author: mayating
 * @date: 2022/1/1
 */
public interface UserMapper extends BaseMapper<User> {

    // 根据关键字查询用户
    IPage<User> selectUserPage(Page<User> page, String keyword);
}
