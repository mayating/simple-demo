package cn.myt.demo.mapper;

import cn.myt.demo.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @className: UserMapperTest
 * @description: mapper测试
 * @author: mayating
 * @date: 2022/1/1
 */
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @DisplayName("插入数据")
    public void testInsert() {
        User user = new User(1, "test1", "test", "t123", "男", "test1@qq.com", "漫渡镇");
        int id = userMapper.insert(user);
        System.out.println(id);
    }

    @Test
    @DisplayName("根据id查找")
    public void testSelectById() {
        User user = userMapper.selectById(2);
        System.out.println(user.toString());
    }

    @Test
    @DisplayName("查找所有")
    public void testSelectAll() {
        List<Object> userList = userMapper.selectObjs(null);
        System.out.println(userList.size());
    }

    @Test
    @DisplayName("更新")
    public void testUpdate() {
        User user = new User();
        user.setId(2);
        user.setAddress("金葫芦镇");
        int id = userMapper.updateById(user);
        System.out.println(id);
    }

    @Test
    @DisplayName("删除")
    public void testDelete() {
        userMapper.deleteById(5);
    }
}
