package com.hlp.mp.simple;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.hlp.mp.simple.mapper.UserMapper;
import com.hlp.mp.simple.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatisPlus {

    @Test
    // 测试查询全部用户
    public void testFindAll() throws IOException {
        String config = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        // 使用 MybatisPlus 中的 MybatisSqlSessionFactoryBuilder 进程构建
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        
        // 测试查询（调用 MybatisPlus 的 BaseMapper 中定义好的方法）
        List<User> userList = userMapper.selectList(null);
        for (User user:userList) {
            System.out.println(user);
        }
    }
}
