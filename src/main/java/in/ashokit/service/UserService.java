package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public String getWelcomeMsg() {
		logger.warn("This is the warn msg");
		logger.info("This is the info msg");
		logger.error("This is the error msg");
		logger.debug("This is the debug msg");
		logger.trace("This is the trace nsg");
		return "Welcome to logging application";
	}
}
