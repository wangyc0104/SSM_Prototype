package wyc.mapper;

import java.util.List;

import wyc.pojo.User;

public interface UserMapper {
	
	/**
	 * 选择所有用户
	 * @return
	 */
	List<User> selAll();
	
}
