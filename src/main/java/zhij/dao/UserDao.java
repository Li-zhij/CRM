package zhij.dao;

import org.apache.ibatis.annotations.Param;
import zhij.domain.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(String id);
    public User getUserById(String id);
    public User getUserByActAndPwd(@Param("loginAct") String loginAct, @Param("loginPwd") String loginPwd);
    public List<User> getUsers();
}
