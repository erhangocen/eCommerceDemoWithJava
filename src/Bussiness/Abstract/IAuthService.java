package Bussiness.Abstract;

import Entities.Concrete.LoginDto;
import Entities.Concrete.RegisterDto;

public interface IAuthService {
    void login(LoginDto login);
    void register(RegisterDto register);
}
