package DataAccess.Abstract;

import Entities.Concrete.User;

import java.util.ArrayList;
import java.util.List;

public interface IUserDao {
    void add(User user);
    void update(User user);
    void delete(User user);

    List<User> getAll();
}
