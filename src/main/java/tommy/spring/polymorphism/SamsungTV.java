package tommy.spring.polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체 생성 - 디폴트 생성자");
	}
	
	
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 객체 생성 - 생성자 인젝션 - 다중매핑");
		this.speaker = speaker;
		this.price = price;
	}



	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 객체 생성 - 생성자 인젝션");
		this.speaker = speaker;
	}
	
	
	
	public Speaker getSpeaker() {
		System.out.println("getSpeaeker() 메서드 호출");
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 메서드 호출");
		this.speaker = speaker;
	}
	
	

	public int getPrice() {
		System.out.println("getPrice() 메서드 호출");
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setPrice() 메서드 호출");
		this.price = price;
	}



	public void powerOn() {
		System.out.println("SamsungTV 전원을 켠다 (가격 : "+price + "원 )");
		
	}
	public void powerOff() {
		System.out.println("SamsungTV 전원을 끈다.");
	}
	/*
	public void volumeUp() {
		System.out.println("SamsungTV 볼륨을 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV 볼륨을 내린다.");
	}
	*/
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}

	
	
	public void start() {
		System.out.println("객체 초기화 작업 처리");
	}
	
	public void stop() {
		System.out.println("객체 삭제 전에 처리할 로직 처리");
	}
	

	
}
