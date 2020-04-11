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
		System.out.println("1. ���� ������ ���� - ��� Ŭ������ �����ڰ� �׻� ó��");
	}

	
	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. ���� setter �޼��尡 ����");
	}

	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("3. ���� �̸� ����");
		this.beanName = beanName;
		System.out.println("----> " +this.beanName);

	}





	// 5. �ʱ�ȭ ��ó��

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Property ���� �Ϸ�");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. ���� ���丮 ����");
		this.beanFactory = beanFactory ;
		System.out.println("----> " +this.beanFactory);

	}
	
	public void init() {//�ʱ�ȭ �޼���� ����
		System.out.println("7. �ʱ�ȭ �޼��� ����");
	}


	//8. �ʱ�ȭ ��ó��
	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + "!!");
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("����.....");

	}
	
	
}
