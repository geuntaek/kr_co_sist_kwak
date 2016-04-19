package day0108;

/**
 * JVM이 실행시 자동으로 처리하는 예외인 RunTimeException
 * @author user
 */
public class UseRuntimeException {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		// 예외를 묶어서 처리하는 경우
		try {
			
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			result = num1/num2;
			System.out.printf("%d/%d = %d",num1,num2,result);
		}catch(ArithmeticException ae){
			System.err.println("0으로는 나눌 수 없음");
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.err.println("사용법 > java 클래스명 값1 값2");
		}catch(NumberFormatException nfe){
			System.err.println("값에는 숫자만 입력이 가능합니다.");
		}catch(Exception e){ 
			// 제일 윗 부모, 이것보다는 각각의 에러를 명시해주는게 좋다. 자식을 쓰는게 좋다.
			// catch는 상속관계라면 자식 예외가 먼저나와야 한다.
			System.err.println("인식하지 못한 예외");
		}
		
		/* 예외를 따로 처리하는 경우
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
		// System.err 은 예외상황을 출력하는 의미적인 출력 stream
		// err은 예외발생시 stack에 담겨진 메세지를 출력하는 일을 하기 때문에 stack에 담겨있는 메세지를 추적하여 꺼내오는 지연시간이 발생하기때문에
		// out보다 늦게 출력될 수 있다.
		
			System.err.println("사용법>java UseRuntimeException 값1 값2");
			
			//1. 간단한 예외메세지 출력
			System.err.println("초간단 "+aioobe.getMessage());
			//2. 예외를 처리하는 클래스명과 간단한 예외메세지 출력
			System.err.println("----------------------------------------------");
			System.err.println(aioobe.toString());
			System.err.println(aioobe);
			//3. 자세한 예외메세지 : 예외발생 클래스 모두와 예외발생한 라인이 나온다.
			System.err.println("----------------------------------------------");
			aioobe.printStackTrace();
			
			num1 = 1;
			num2 = 1;
		} catch(NumberFormatException nfe){
			System.err.println("같은 숫자 형태만 입력 가능");
			num1 = 1;
			num2 = 1;
		} 
		
		try {
			result = num1/num2;
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage()); // 매우 간단한 메시지
			System.err.println(ae); // 예외처리클래스 + 간단한 메시지
			ae.printStackTrace(); // 자세한 메시지 + 예외가 발생한 라인수
			num2 = 1;
			result = num1/num2;
		}
		
		System.out.printf("%d/%d = %d",num1,num2,result);
		*/
	}

}
