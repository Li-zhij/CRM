package zhij.service;

import zhij.domain.User;

import java.util.List;

public interface UserService {
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(String id);
    public User getUserById(String id);
    public User getUserByActAndPwd(String loginAct, String loginPwd);
    public List<User> getUsers();
}
