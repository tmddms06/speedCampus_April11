package tommy.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//1. Spring Container ����
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring Container�� ���� ���ϴ� (�ʿ���) ��ü�� ��û(Lookup) �Ѵ�.
		
		
		TV tv = (TV) factory.getBean("tv", TV.class);
		//TV tv2 = (TV) factory.getBean("tv", TV.class);
		//TV tv3 = (TV) factory.getBean("tv", TV.class);
		//BeanFactory factory = new BeanFactory();
		//TV tv = (TV) factory.getBean(args[0]);
		
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring Container ����
		factory.close();
		
		
		
	}
}
