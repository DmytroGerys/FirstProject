package ua.sport.serviceImpl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.sport.entity.Role;
import ua.sport.entity.User;
import ua.sport.dao.UserDao;
import ua.sport.service.UserService;

@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setRole(Role.ROLE_USER);
		userDao.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userDao.findByEmail(username);
	}
	
	@PostConstruct
	public void addAdmin(){
		User user = userDao.findByEmail("admin");
		if(user==null){
			user = new User();
			user.setEmail("admin");
			user.setPassword(encoder.encode("admin"));
			user.setRole(Role.ROLE_ADMIN);
			userDao.save(user);
		}
	}
}