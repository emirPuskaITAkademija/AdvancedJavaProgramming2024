package ba.smoki.six.question;

public class Main {
    public static void main(String[] args) {

        User user = new User("john_doe", "password123", "ADMIN");
        AuthenticationManager authManager = new AuthenticationManager();
        boolean isAuthenticated = authManager.authenticate(user);

        if (isAuthenticated) {

            System.out.println("User authenticated successfully.");
            // Perform role checks and further logic

        } else {
            System.out.println("Authentication failed.");
        }
    }
}
