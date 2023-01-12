
class Car1 {
	//필드 = 속성 (객체에 대한)변수 
	boolean powerOn; // 초기값 안넣으면 false
	String color; // null
	int wheel; //0 
	int speed; //0 
	boolean wiperOn; // false
	
	//메소드(함수, 기능 function이라고도 함  이름() 이런 값은 다 메소드라고 보믄된다)
	void power() {powerOn =!powerOn;}
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn =! wiperOn;}
	
	
}
//같은곳에서 스면 내부 클래스삼

public class Car{
	public static void main(String[] args) {
		//객체가 생성되지 않으면 클래스 생성이 불가능하다.
		//System.out.println("시동 처음 초기화:" + Car1.powerOn);
		
		Car1 mycar = new Car1(); // car1 클래스를 이용해서 mycar 라는 객체 생성 : car1 클래스안에 필드와 메소드 사용가능
		System.out.println("시동 처음 초기화:" + mycar.powerOn);
		System.out.println("차의 색상 초기화:" + mycar.color);
		System.out.println("바퀴의 수 초기화:" + mycar.wheel);
		System.out.println("속력  초기화:" + mycar.speed);
		System.out.println("와이퍼 작동 초기화:" + mycar.wiperOn);
		
		mycar.power();
		System.out.println("시동 메소드 동작:" + mycar.powerOn);
		
		mycar.power();
		System.out.println("시동 메소드 다시 동작:" + mycar.powerOn);
		
		mycar.color = "black";
		System.out.println("현재 차의 색상:" + mycar.color);
		

	}
}
