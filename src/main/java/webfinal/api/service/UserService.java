package webfinal.api.service;

import webfinal.api.model.Response;
import webfinal.api.model.SignInRequest;

public interface UserService {
    Response createUser(String username, String password, String email, String phoneNumber);

    Response getUserInfoById(Integer userId);
}
