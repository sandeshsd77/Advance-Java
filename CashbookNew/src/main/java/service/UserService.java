package service;

import dao.UserDao;
import model.User;

import java.util.List;

public class UserService {
    static UserDao userDao = new UserDao();


    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void editUser(User user) {
        userDao.editUser(user);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    public User getUserById(int id) {
        return userDao.getUser(id);
    }


    public List <User> getAllUser() {
        return userDao.getAllUser();
    }
}