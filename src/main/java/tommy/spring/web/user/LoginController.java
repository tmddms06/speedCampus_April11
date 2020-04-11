package tommy.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tommy.spring.web.user.impl.UserDAO;



@Controller
public class LoginController  {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("test");
		vo.setPassword("test");
		return "login.jsp";
	}
	
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(UserVO vo, HttpSession session) {
		System.out.println("로그인처리");
		if(vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		UserVO user = userService.getUser(vo);
		if (user != null) {
			session.setAttribute("userName", user.getName());
			 return "getBoardList.do";
		} else {// 실패
			return "login.jsp";
		}

	}

}
