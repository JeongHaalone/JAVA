package ch07.mbcCar;

import ch07.hankook.SnowTire;
import ch07.hyundai.Engine;
import ch07.kumho.EcoTire;
import ch07.nexen.BigWidthTire;
import ch07.nexen.*;//그곳(넥센에서 만든 클래스)에 있는 것을 다 가져온다.(같은 이름 x)

public class Car {
	//필드
	ch07.hankook.Tire hTire = new ch07.hankook.Tire(); //한국 타이어 패키지에서 가져옴
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); //금호 타이어 패키지에서 가져옴
	SnowTire sTire = new SnowTire();
	EcoTire eTire = new EcoTire();
	BigWidthTire bTire = new BigWidthTire();
	SportsTire spTire = new SportsTire();
	
	Engine hEngine = new Engine();
	
	//생성자
	
	
	
	
	//매서드
}
