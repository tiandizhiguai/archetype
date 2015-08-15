package com.example.service.impl.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.dao.user.UserDao;
import com.example.model.user.UserModel;
import com.example.param.user.UserParam;
import com.example.service.user.UserService;
import com.example.vo.user.UserVO;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

	@Override
    public List<UserVO> getUsers(UserParam param) {
        List<UserVO> result = new ArrayList<UserVO>();
        List<UserModel> userModels = userDao.getUsers(param);

        if (CollectionUtils.isEmpty(userModels)) {
            return result;
        }

        for (UserModel model : userModels) {
            UserVO userVO = new UserVO();
            userVO.setId(model.getId());
            userVO.setLoginName(model.getLoginName());
            userVO.setName(model.getName());
            userVO.setPassword(model.getPassword());
            result.add(userVO);
        }
        return result;
	}

	@Override
    public UserVO getUser(UserParam param) {
        List<UserVO> vos = getUsers(param);
        if (!CollectionUtils.isEmpty(vos)) {
            return vos.get(0);
        }
        return new UserVO();
	}
}