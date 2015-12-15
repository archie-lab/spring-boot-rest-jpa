package example.service;

import example.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> getList();

}
