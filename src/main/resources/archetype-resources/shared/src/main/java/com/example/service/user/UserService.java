package com.example.service.user;

import java.util.List;

import com.example.param.user.UserParam;
import com.example.vo.user.UserVO;

public interface UserService {

    List<UserVO> getUsers(UserParam param);
    
    UserVO getUser(UserParam param);
	
}
