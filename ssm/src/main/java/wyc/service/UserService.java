package wyc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wyc.pojo.User;

/**
 * 用户Service
 * @author 王以诚
 */
@Service
public interface UserService {
	
	/**
	 * 显示所有用户
	 * @return 用户对象的List
	 */
	public List<User> show();
}
