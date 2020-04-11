package tommy.spring.polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("SamsungTV ��ü ���� - ����Ʈ ������");
	}
	
	
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV ��ü ���� - ������ ������ - ���߸���");
		this.speaker = speaker;
		this.price = price;
	}



	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV ��ü ���� - ������ ������");
		this.speaker = speaker;
	}
	
	
	
	public Speaker getSpeaker() {
		System.out.println("getSpeaeker() �޼��� ȣ��");
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() �޼��� ȣ��");
		this.speaker = speaker;
	}
	
	

	public int getPrice() {
		System.out.println("getPrice() �޼��� ȣ��");
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setPrice() �޼��� ȣ��");
		this.price = price;
	}



	public void powerOn() {
		System.out.println("SamsungTV ������ �Ҵ� (���� : "+price + "�� )");
		
	}
	public void powerOff() {
		System.out.println("SamsungTV ������ ����.");
	}
	/*
	public void volumeUp() {
		System.out.println("SamsungTV ������ �ø���.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV ������ ������.");
	}
	*/
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}

	
	
	public void start() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��");
	}
	
	public void stop() {
		System.out.println("��ü ���� ���� ó���� ���� ó��");
	}
	

	
}
