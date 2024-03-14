package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userSer;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return userSer.getWelcomeMsg();
	}
}
