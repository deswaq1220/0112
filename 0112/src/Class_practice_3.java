class cars {
	static int wheel = 4; //클래스 변수 또는 정적멤버 <- 객체 선언 없이도 바로 사용가능
	int speed; // 인스턴스 변수 또는 인스턴스 멤버  <-객체가 선언이 되어야만 사용가능
}
public class Class_practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cars.wheel); // 객체 선언없이 사용가능. 클래스 변수(정적멤버) 접근 가능
		//System.out.println(cars.speed); // 정적으로 참조가 되지 않았기 때문에 사용불가능함
		
		cars mycar1 = new cars(); //객체 생성
		
		System.out.println(cars.wheel);
		System.out.println(mycar1.speed); // 객체를 생성한 이후에는 인스턴스 멤버에 접근 가능
		
		cars mycar2 = new cars();
		
		System.out.println("<변경 전>");
		System.out.println("mycar1.speed:"+ mycar1.speed);
		System.out.println("mycar2.speed:"+ mycar2.speed);
		System.out.println("mycar1.wheel:"+ mycar1.wheel);
		System.out.println("mycar2.wheel:"+ mycar2.wheel);
		
		mycar2.speed = 100;   //인스턴스
		mycar2.wheel = 5; // 정적멤버
		System.out.println("<변경 후>");
		System.out.println("mycar1.speed:"+ mycar1.speed);
		System.out.println("mycar2.speed:"+ mycar2.speed);
		System.out.println("mycar1.wheel:"+ mycar1.wheel);
		System.out.println("mycar2.wheel:"+ mycar2.wheel);
		
		//정적으로 되어있으면 메모리에 하나만 올라가고 주소를 공유해서 쓰다보니 다른쪽에도 동일하게 적용이 된다.
		
	}

}
