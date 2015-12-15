package example.service;

import example.model.User;
import example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@Validated
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(@NotNull @Valid User user) {
        LOGGER.debug("save User {}", user);
        return userRepository.save(user);
    }

    @Override
    public List<User> getList() {
        LOGGER.debug("Retrieving the list of all users");
        return userRepository.findAll();
    }
}
