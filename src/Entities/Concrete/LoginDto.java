package Entities.Concrete;

public class LoginDto {
    private String eMail;
    private String password;

    public LoginDto(String eMail, String password) {
        super();
        this.eMail = eMail;
        this.password = password;
    }

    public LoginDto() {

    }

    public String geteMail() {
        return eMail;
    }

    public LoginDto seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
