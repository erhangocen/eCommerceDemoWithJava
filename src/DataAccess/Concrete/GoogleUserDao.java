package DataAccess.Concrete;

import DataAccess.Abstract.IUserDao;
import Entities.Concrete.User;

import java.util.ArrayList;
import java.util.List;

public class GoogleUserDao implements IUserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " user has been added to the system with Google!");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " user's information has been updated!");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " user has been deleted from the system!");
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
