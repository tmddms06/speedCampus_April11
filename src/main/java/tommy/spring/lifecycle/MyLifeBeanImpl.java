package tommy.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyLifeBeanImpl implements MyLifeBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	private String greeting;
	private String beanName;
	private BeanFactory beanFactory;
	
	public MyLifeBeanImpl() {
		super();
		System.out.println("1. 빈의 생성자 실행 - 모든 클래스는 생성자가 항상 처음");
	}

	
	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. 빈의 setter 메서드가 수행");
	}

	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("3. 빈의 이름 설정");
		this.beanName = beanName;
		System.out.println("----> " +this.beanName);

	}





	// 5. 초기화 전처리

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Property 설정 완료");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. 빈의 팩토리 설정");
		this.beanFactory = beanFactory ;
		System.out.println("----> " +this.beanFactory);

	}
	
	public void init() {//초기화 메서드로 지정
		System.out.println("7. 초기화 메서드 수행");
	}


	//8. 초기화 후처리
	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + "!!");
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("종료.....");

	}
	
	
}
