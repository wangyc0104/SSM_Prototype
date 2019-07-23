package wyc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wyc.service.UserService;

/**
 * 用户控制器
 * @author 王以诚
 */
@Controller
public class UserController {
	@Resource
	private UserService userServiceImpl;

	/**
	 * 展示用户列表
	 * @param model
	 * @return
	 */
	@RequestMapping("show")
	public String show(Model model) {
		model.addAttribute("list", userServiceImpl.show());
		return "index.jsp";
	}
}
