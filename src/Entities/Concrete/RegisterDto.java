package Entities.Concrete;

public class RegisterDto {
    String firstName;
    String lastname;
    String eMail;
    String password;

    public RegisterDto(String firstName, String lastname, String eMail, String password) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.eMail = eMail;
        this.password = password;
    }

    public RegisterDto() {

    }

    public String getFirstName() {
        return firstName;
    }

    public RegisterDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public RegisterDto setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String geteMail() {
        return eMail;
    }

    public RegisterDto seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
