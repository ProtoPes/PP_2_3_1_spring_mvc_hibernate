package web.dao;

import web.entities.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getAll();

    void delete(long id);

    void update(User user);

    User get(long id);
}
