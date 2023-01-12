class Area{
	static void menual() { // void : 정적인 메소드를 생성하게 되는데 void가 붙으면 반환되는 값이 없다고 보면됨 바로 사용 가능
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle:삼각형 넓이");
		System.out.println("rectangle:사각형 넓이");
		System.out.println("입니당다라당당");
		
	}
	//인스턴스 메소드
	double triangle(int a, int b) {
		return(double)a*b/2;
	}
	
	int rectangle(int a, int b) {
		return a*b;
	}
	//위에 두개들은 스테틱이라고 정의가 안되어있어서 객체를 생성해야지만 메소드를 호출해서 사용할수잇음
	
	
}
public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area.menual();
		//Area.triangle(3,5); 인스턴스 메소드가 되기 때문에 객체를 생성한 이후에 사용가능하다.
		//Area.rectangle(3,4);
		
		Area cal = new Area();
		cal.menual();
		System.out.println(cal.triangle(3,5)); // 리턴 되는 값 바로 출력
		System.out.println(cal.rectangle(3,4)); //
	
	}

}
