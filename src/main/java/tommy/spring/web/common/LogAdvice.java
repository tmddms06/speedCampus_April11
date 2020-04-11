package tommy.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect  // Aspect = Advice + Pointcut
public class LogAdvice {


	
	@Before("PointcutCommon.allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] : 비즈니스 로직 수행 전 동작");
	}
}
