package tommy.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service  // <bean id="beforeAdvice" class="..."/>
@Aspect	  // <aop:aspect ref="beforeAdvice/>
public class BeforeAdvice {
	

	@Before("PointcutCommon.allPointcut()")  //<aop:before ...>
	public void beforeLog(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("[사전처리] : "+method +"() 메서드의 ARGS 정보  "+ args[0].toString());
	}
}
