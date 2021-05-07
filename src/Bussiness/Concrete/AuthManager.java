package Bussiness.Concrete;

import Bussiness.Abstract.IAuthService;
import Bussiness.Abstract.IUserService;
import Core.Utilities.Abstract.ILoggerService;
import Core.Utilities.Abstract.IRegexService;
import Entities.Concrete.LoginDto;
import Entities.Concrete.RegisterDto;
import Entities.Concrete.User;

import java.util.List;
import java.util.Random;

public class AuthManager implements IAuthService {

    private final IRegexService _regexService;
    private final IUserService _userService;
    private final ILoggerService _loggerService;
    public AuthManager(IRegexService _regexService, IUserService _userService, ILoggerService _loggerService) {
        super();
        this._regexService = _regexService;
        this._userService = _userService;
        this._loggerService = _loggerService;
    }

    @Override
    public void login(LoginDto login) {
        boolean isExistAccount = true;

        List<User> users = _userService.getAll();
        for (User user : users) {
            if (user.geteMail() == login.geteMail()) {
                if (user.getPassword() == login.getPassword()) {
                    System.out.println("Hello " + user.getFirstName() + " !");
                    isExistAccount = false;
                    break;
                }
            }
        }
        if (isExistAccount) {
            System.out.println("This user was not found!");
        }
    }

    @Override
    public void register(RegisterDto register) {

        boolean isExistAccount = true;

        if (register.getPassword().length() >= 6) {
            if (register.getFirstName().length() > 3 || register.getLastname().length() > 3) {
                if (_regexService.isValid(register.geteMail())) {
                    List<User> users = _userService.getAll();
                    if (users != null) {
                        for (User user : users) {
                            if (user.geteMail() == register.geteMail()) {
                                System.out.println("This email is exist in the system");
                                isExistAccount = false;
                                break;
                            }
                        }
                    }
                    if (isExistAccount) {
                        Random rand = new Random();
                        User user = new User(rand.nextInt(100), register.getFirstName(), register.getLastname(), register.geteMail(), register.getPassword());
                        _loggerService.logToMail("--Click it for complete to register--");
                        _userService.add(user);
                    }
                } else {
                    System.out.println("Invalid Email");
                }
            } else {
                System.out.println("Name and surname must contain at least two characters!");
            }
        } else {
            System.out.println("Password must be more than 6 characters.");
        }
    }
}
