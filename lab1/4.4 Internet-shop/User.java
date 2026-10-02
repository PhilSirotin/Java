public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean authenticate(String enteredLogin, String enteredPassword) {
        return login.equals(enteredLogin) && password.equals(enteredPassword);
    }
}