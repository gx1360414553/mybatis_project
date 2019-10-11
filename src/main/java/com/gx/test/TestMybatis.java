package com.gx.test;

import com.gx.bean.User;
import com.gx.mapper.UserMapper;
import com.gx.sqlSession.MySqlsession;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月11日 09:46:00
 */
public class TestMybatis {
    public static void main(String[] args) {
        MySqlsession sqlsession=new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
