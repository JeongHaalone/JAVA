package ch09.interfaceExam;

public class Television implements RemoteControl {
	//리모콘 인터페이스를 사용하는 구현체
	//필드
	private int volume; //숫자로 된 볼륨
	
	//기본 생성자 : Television tel = new Television();
	
	//메서드
	
	@Override // 재정의 (위에서 만든 메서드를 동작 시킨다ㅏ.)
	public void turnOn() {
		// 전원을 켠다.
		System.out.println("tv의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// 전원을 끈다.
		System.out.println("tv의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int Volume) {
		// 볼륨 조절		
		if (volume>RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 tv의 볼륨 :" + volume);
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		 
				if (mute) {
					System.out.println("무음 처리 합니다.");
				} else {
					System.out.println("무음 처리를 해지합니다..");
				
			}
	}//if close
	
	
	
	
}
