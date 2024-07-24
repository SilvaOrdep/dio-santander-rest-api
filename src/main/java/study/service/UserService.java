package study.service;

import study.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
