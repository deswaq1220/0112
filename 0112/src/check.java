
 class check {
	 static int cv =5; // 정적 변수 멤버
	 int iv = 4; //인스턴스 변수 멤버
	 
	 static void cm() { // 정적 메소드
		 
	 }
	 
	 void im() { //인스턴스 메소드
		 
	 }
	 
	 static void cm_Imember() { // 정적 메소드에서 인스턴스 멤버 사용
		 //System.out.println(iv); // 에러 : 인스턴스 멤버 (생성: 객체 선언)
		// im(); //에러: 인스턴스 멤버 (생성: 객체선언)
	 }
	 
	 void im_Cmember() { //인스턴스 메소드에서 정적멤버 사용
		 System.out.println(cv); //
		 cm();
	 }
	 
	 static void cm_Cmember() {  // 정적 멤버 메소드에서 정적 멤버 사용
		 System.out.println(cv);
		 cm();
	 }
	 
	 void im_Imember() { // 인스턴스 메소드에서 인스턴스 멤버 사용
		 System.out.println(iv);
		 im();
	 }
	 
	 
}
 
 public class Method3 {
	 public static void main(String[] args) {
		 
		 //Check.cm_Imember(); 에러
		 check.cm_Cmember(); //성공
		 
		 check myinstance = new check();
		 myinstance.im_Cmember();//성공
		 myinstance.im_Imember();//성공
		
		 
	 }
 }

 
 