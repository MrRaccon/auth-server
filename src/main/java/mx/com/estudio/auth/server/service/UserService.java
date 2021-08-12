package mx.com.estudio.auth.server.service;

import java.util.List;

import mx.com.estudio.auth.server.model.User;

public interface UserService {
    User save(User user);
    List<User> findAll();
    void delete(long id);
}
