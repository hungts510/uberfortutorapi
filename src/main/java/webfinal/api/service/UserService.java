package webfinal.api.service;

import webfinal.api.model.Response;
import webfinal.api.model.SignInRequest;

public interface UserService {
    Response createUser(String username, String password, String email, String phoneNumber, String role);

    Response getUserInfoById(Integer userId);

    Response getUserInfoByUsernameAndPassword(String username, String password);
}
