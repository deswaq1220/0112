
public class Class_practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 mycar1 = new Car1();
		Car1 mycar2 = new Car1();
		// new를 사용하면 메모리에 대한 주소가 달라진다.
		
		mycar1.color = "red";
		mycar2.color = "black"; // 메모리가 달라서 따로따로 된다. 객체 이름을 다 다르게 하면 메모리를 많이 소모하고 제각각 사용가능
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycar1의 색:" + mycar1.color);
		System.out.println("mycar2의 색:" + mycar2.color);
		System.out.println();
		System.out.println("mycar1의 속도:" + mycar1.speed);
		System.out.println("mycar2의 속도:" + mycar2.speed);
		System.out.println();
		System.out.println("mycar1의  작동 여부:" + mycar1.wiperOn);
		System.out.println("mycar2의 작동 여부:" + mycar2.wiperOn);
		System.out.println();
		
		System.out.println(mycar1);
		System.out.println(mycar2);
		
		
		

	}

}
