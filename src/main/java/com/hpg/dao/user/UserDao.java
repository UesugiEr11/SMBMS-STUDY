package com.hpg.dao.user;

import com.hpg.pojo.Role;
import com.hpg.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//设置成一个接口
public interface UserDao {
    //得到要登陆的用户
    public User getLoginUser(Connection connection, String userCode) throws Exception;
    //修改当前用户的密码
    public int updatePwd(Connection connection, int id, String password) throws  Exception;

    //查询用户总数 (根据用户名或角色查询用户总数）
    public int getUserCount(Connection connection,String username, int userRole) throws Exception;

    //通过条件查询-userList
    public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize)throws Exception;

    //增加用户信息
    public int add(Connection connection, User user)throws Exception;

    //通过userId删除user
    public int deleteUserById(Connection connection, Integer delId)throws Exception;

    //修改用户信息
    public int modify(Connection connection, User user)throws Exception;

    //通过userId获取user
    public User getUserById(Connection connection, String id)throws Exception;


}
