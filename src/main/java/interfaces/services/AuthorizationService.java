package interfaces.services;

/**
 * Created by Вика on 13.10.2015.
 */
public interface AuthorizationService {
    void logIn(String password,String login, String email);
    void logOut();
}
