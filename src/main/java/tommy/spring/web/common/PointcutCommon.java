package tommy.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class PointcutCommon {

	
	@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")
	public void allPointcut() {
		// <aop:pointcut id="allPointcut()" expression="..."
	}
	
	

	@Pointcut("execution(* tommy.spring.web..*Impl.get*(..))")
	public void getPointcut() {
		// <aop:pointcut id="getPointcut()" expression="..."
	}
}
