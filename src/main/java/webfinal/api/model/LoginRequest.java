package webfinal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginRequest {
    @JsonProperty(value= "username")
    private String username;

    @JsonProperty(value = "password")
    private String password;
}
