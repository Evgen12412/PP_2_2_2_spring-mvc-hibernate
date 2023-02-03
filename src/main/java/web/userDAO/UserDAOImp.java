package web.userDAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User ",User.class).getResultList();
    }

    @Override
    @Transactional
    public void createUser(User user) {
        entityManager.persist(user);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
    @Transactional
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
    @Transactional
    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }
}
