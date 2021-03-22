package zhij.dao;

import zhij.domain.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(String id);
    public User getUserById(String id);
    public List<User> getUsers();
}
