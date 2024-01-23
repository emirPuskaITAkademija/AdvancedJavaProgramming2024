package ba.smoki.six.question;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class AuthenticationManager {
    public boolean authenticate(User user) {

        try {
            LoginContext loginContext = new LoginContext("LoginConfig", new UserCallbackHandler(user));
            loginContext.login();
            return true;

        } catch (LoginException e) {
            System.out.println("Authentication failed: " + e.getMessage());
            return false;
        }
    }
}
