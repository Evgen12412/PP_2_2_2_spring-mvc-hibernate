package web.service;



import org.springframework.stereotype.Service;
import web.model.User;
import web.userDAO.UserDAO;

import java.util.List;
@Service
public class UserServiceImp implements UserService {

    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }


    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User show(int id) {
       return userDAO.show(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }



}
