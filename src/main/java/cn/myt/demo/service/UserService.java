package cn.myt.demo.service;

import cn.myt.demo.dto.QueryDTO;
import cn.myt.demo.model.User;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @author: mayating
 * @date: 2022/1/2
 */
public interface UserService {
    /**
     * 分页查询
     *
     * @param queryDTO
     * @return
     */
    IPage<User> selectUserPage(QueryDTO queryDTO);

    /**
     * 新增
     *
     * @param user
     * @return
     */
    Integer addUser(User user);

    /**
     * 更新
     *
     * @param user
     * @return
     */
    Integer updateUser(User user);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    Integer deleteUser(Integer id);

    /**
     * 批量删除
     *
     * @param ids
     */
    void batchDelete(List<Integer> ids);
}
