package webfinal.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    private String role;

    public Users(String username, String password, String email, String phoneNumber, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }
}
