package com.example.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.param.user.UserParam;
import com.example.service.user.UserService;
import com.example.vo.user.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userServie;

    @RequestMapping("/login")
	public ModelAndView login(UserParam param) {
		ModelAndView modelAndView =  new ModelAndView();
        UserVO user = userServie.getUser(param);
		if(null != user){
            modelAndView.setViewName("/user/loginSuccess");
            modelAndView.addObject("user", user);
		}else{
            modelAndView.setViewName("/user/loginError");
		}
		return modelAndView;
	}
}