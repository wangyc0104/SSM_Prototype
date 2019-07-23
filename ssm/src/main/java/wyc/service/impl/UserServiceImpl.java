package wyc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wyc.mapper.UserMapper;
import wyc.pojo.User;
import wyc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> show() {
		return userMapper.selAll();
	}

}
