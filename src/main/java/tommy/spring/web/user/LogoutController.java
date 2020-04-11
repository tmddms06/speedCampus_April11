package tommy.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class LogoutController  {

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃처리");
		//1. 브라우저와 연결된 세션 객체를 종료
	//	HttpSession session = request.getSession(false);
		// 기존의세션을가져옴
		session.invalidate();
		//2. 세션 종료 후 메인 화면으로 이동
	//	ModelAndView mav = new ModelAndView();
	//	mav.setViewName("redirect:login.jsp");
		return "login.jsp";
	}

}
