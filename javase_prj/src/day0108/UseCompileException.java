package day0108;

/**
 * 사용자가 try~catch를 작성하지않으면 코딩에러를 발생하는 CompileException
 * 객체를 복제하려면 복제하려는 객체는 impliments Cloneable interface를 반드시 구현해야한다.
 * @author user
 */
public class UseCompileException implements Cloneable {
	
	int i;
	public UseCompileException(){
		i=100;
	}//UseCompileException
	
	public static void main(String[] args) {
		
		// 복제할 객체를 생성
		UseCompileException uce = new UseCompileException();
		
		// 복제, 꼭 try~catch를 써야한다.
		try {
			UseCompileException uce1 = (UseCompileException)uce.clone();
			System.out.println("원본 "+uce+"/복제 "+uce1);
			uce1.i = 60;
			System.out.println("원본 "+uce.i+"-복제 "+uce1.i+"="+(uce.i-uce1.i));
			
		} catch (CloneNotSupportedException e) { // 복제를 지원하지 않는 상황
			System.err.println("이 객체는 복제가 되지 않는 객체");
			e.printStackTrace();
		} // 형을 맞추고 
		
		// 외부클래스를 객체화하지 않고 얻어내기. 객체지향에 위배됨.. 객체화하지않고 불러온 클래스의 메소드를 쓸 수 있다.
		try {
			Class loadClass = Class.forName("day0108.UseRuntimeException"); // try~catch 하지 않으면 오류
			System.out.println("클래스로딩성공");
			System.out.println(loadClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} // main

} // class











