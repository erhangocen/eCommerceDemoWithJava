package Bussiness.Abstract;

import Entities.Concrete.User;

import java.util.List;

public interface IUserService {
    void add(User user);
    void update(User user);
    void delete(User user);

    List<User> getAll();
}
