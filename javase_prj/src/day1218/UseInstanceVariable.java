package day1218;

/**
 *	인스턴스 변수 접근지정자의 특징
 * @author user
 */
public class UseInstanceVariable {
	
	public static void main(String[] args) {
		// 같은 패키지 안에서는 public, protected, default instance 변수 사용가능
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.i+iv.j+iv.i); 
		iv.i = 12; // public
		iv.j = 2015; // protected
		iv.l = 18; // default
		// iv.k = 10; // private는 외부에서는 사용 불가
		System.out.println("접근지정자 public "+iv.i+", proctected "+iv.j+", default "+iv.i);
	}// main
}// class

