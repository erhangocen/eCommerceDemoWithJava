package Bussiness.Concrete;

import Bussiness.Abstract.IUserService;
import Core.Utilities.Abstract.ILoggerService;
import DataAccess.Abstract.IUserDao;
import Entities.Concrete.User;

import java.util.List;

public class UserManager implements IUserService {

    private final IUserDao _userDao;

    public UserManager(IUserDao _userDao) {
        super();
        this._userDao = _userDao;
    }

    @Override
    public void add(User user) {
        _userDao.add(user);
    }

    @Override
    public void update(User user) {
        _userDao.update(user);
    }

    @Override
    public void delete(User user) {
        _userDao.delete(user);
    }

    @Override
    public List<User> getAll() {
        return _userDao.getAll();
    }
}
