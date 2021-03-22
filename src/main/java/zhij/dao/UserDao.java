package zhij.dao;

import zhij.domain.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public User getUserById(int id);
    public List<User> getUsers();
}
