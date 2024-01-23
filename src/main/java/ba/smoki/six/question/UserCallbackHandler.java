package ba.smoki.six.question;

import javax.security.auth.callback.*;
import java.io.IOException;

public class UserCallbackHandler implements CallbackHandler {

    private User user;

    public UserCallbackHandler(User user) {
        this.user = user;
    }


    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        for (Callback callback : callbacks) {

            if (callback instanceof NameCallback) {

                ((NameCallback) callback).setName(user.getUsername());

            } else if (callback instanceof PasswordCallback) {

                ((PasswordCallback) callback).setPassword(user.getPassword().toCharArray());

            }
        }
    }
}