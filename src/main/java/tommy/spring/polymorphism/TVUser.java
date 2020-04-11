package tommy.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//1. Spring Container 구동
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring Container로 부터 원하는 (필요한) 객체를 요청(Lookup) 한다.
		
		
		TV tv = (TV) factory.getBean("tv", TV.class);
		//TV tv2 = (TV) factory.getBean("tv", TV.class);
		//TV tv3 = (TV) factory.getBean("tv", TV.class);
		//BeanFactory factory = new BeanFactory();
		//TV tv = (TV) factory.getBean(args[0]);
		
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring Container 종료
		factory.close();
		
		
		
	}
}
