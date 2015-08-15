package com.example.dao.user;

import java.util.List;

import com.example.model.user.UserModel;
import com.example.param.user.UserParam;

public interface UserDao {

    List<UserModel> getUsers(UserParam param);
}
