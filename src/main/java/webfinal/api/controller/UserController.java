package webfinal.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import webfinal.api.model.LoginRequest;
import webfinal.api.model.Response;
import webfinal.api.model.SignInRequest;
import webfinal.api.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(path = "/sign-in", method = RequestMethod.POST)
    public Response userSignIn(@RequestBody SignInRequest signInRequest) {
        return userService.createUser(signInRequest.getUsername(), signInRequest.getPassword(), signInRequest.getEmail(), signInRequest.getPhoneNumber(), signInRequest.getRole());
    }

    @RequestMapping(path = "/user/get", method = RequestMethod.GET)
    public Response getUserInfo() {
        Integer userId = 0;
        return userService.getUserInfoById(userId);
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Response userLogin(@RequestBody LoginRequest loginRequest) {
        return userService.getUserInfoByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
    }
}
