package zhij.service;

import zhij.domain.User;

import java.util.List;

public interface UserService {
    public int addUser(User user);
    public User getUserById(int id);
    public List<User> getUsers();
}
