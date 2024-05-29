package org.example.service.employer;

public interface EmployerAuthService {
    void register(String username, String password);
    String login(String username, String password);
    void logout(String token);

}
