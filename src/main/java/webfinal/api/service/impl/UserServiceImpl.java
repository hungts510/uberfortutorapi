package webfinal.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webfinal.api.entity.Users;
import webfinal.api.model.Response;
import webfinal.api.repository.UserDao;
import webfinal.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Response createUser(String username, String password, String email, String phoneNumber) {
        Users registerUser = new Users(username, password, email, phoneNumber);
        if (username != null && password != null && email != null && phoneNumber != null) {
            userDao.insertUser(registerUser);
            Response registerResponse = Response.builder().code(0).message("Successfully").data(registerUser).build();
            return registerResponse;
        }
        return Response.builder().code(1).message("Fail!").data(null).build();
    }

    @Override
    public Response getUserInfoById(Integer userId) {
        Users userInfo = userDao.getUserById(userId);
        if (userInfo != null) {
            Response response = Response.builder().code(0).message("Successfully").data(userInfo).build();
            return response;
        }
        return Response.builder().code(1).message("Fail!").data(null).build();
    }
}
