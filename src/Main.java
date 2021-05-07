import Bussiness.Concrete.AuthManager;
import Bussiness.Concrete.UserManager;
import Core.Utilities.Concrete.MailLoggerManagerAdapter;
import Core.Utilities.Concrete.RegexManager;
import DataAccess.Concrete.GoogleUserDao;
import DataAccess.Concrete.HibernateUserDao;
import Entities.Concrete.LoginDto;
import Entities.Concrete.RegisterDto;
import Entities.Concrete.User;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserManager hibernateManager = new UserManager(new HibernateUserDao());
        AuthManager hibernateAuthManager = new AuthManager(new RegexManager(),hibernateManager, new MailLoggerManagerAdapter());

        UserManager googleManager = new UserManager(new GoogleUserDao());
        AuthManager googleAuthManager = new AuthManager(new RegexManager(),googleManager, new MailLoggerManagerAdapter());

        ArrayList<User> users = new ArrayList<>();
        List<User> hibernateUsers = hibernateManager.getAll();
        List<User> googleUsers = googleManager.getAll();

        hibernateAuthManager.register(new RegisterDto("Erhan", "Göcen", "erhan@gmail.com", "1234567"));
        hibernateAuthManager.login(new LoginDto("erhan2004xzx@gmail.com","1234567"));

        googleAuthManager.register(new RegisterDto("Eren", "Birk", "eren@gmail.com", "1234567"));
        googleAuthManager.login(new LoginDto("eren@gmail.com","1234567"));

        users.addAll(googleUsers);
        users.addAll(hibernateUsers);


        System.out.println("-----------------------------------\n");
        System.out.println("Registered User \n---------------");
        for (User user:users){
            System.out.println("- " + user.getFirstName());
        }




    }
}
