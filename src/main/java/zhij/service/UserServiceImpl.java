package zhij.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhij.dao.UserDao;
import zhij.domain.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return userDao.deleteUser(id);
    }

    @Override
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByActAndPwd(String loginAct, String loginPwd) {
        return userDao.getUserByActAndPwd(loginAct, loginPwd);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
