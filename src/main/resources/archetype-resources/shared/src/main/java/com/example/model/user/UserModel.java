package com.example.model.user;

import java.io.Serializable;

public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private Integer           id;
    private String            loginName;
    private String            name;
    private String            password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
