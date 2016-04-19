package day0108;

/**
 * JVM�� ����� �ڵ����� ó���ϴ� ������ RunTimeException
 * @author user
 */
public class UseRuntimeException {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		// ���ܸ� ��� ó���ϴ� ���
		try {
			
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			result = num1/num2;
			System.out.printf("%d/%d = %d",num1,num2,result);
		}catch(ArithmeticException ae){
			System.err.println("0���δ� ���� �� ����");
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.err.println("���� > java Ŭ������ ��1 ��2");
		}catch(NumberFormatException nfe){
			System.err.println("������ ���ڸ� �Է��� �����մϴ�.");
		}catch(Exception e){ 
			// ���� �� �θ�, �̰ͺ��ٴ� ������ ������ ������ִ°� ����. �ڽ��� ���°� ����.
			// catch�� ��Ӱ����� �ڽ� ���ܰ� �������;� �Ѵ�.
			System.err.println("�ν����� ���� ����");
		}
		
		/* ���ܸ� ���� ó���ϴ� ���
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
		// System.err �� ���ܻ�Ȳ�� ����ϴ� �ǹ����� ��� stream
		// err�� ���ܹ߻��� stack�� ����� �޼����� ����ϴ� ���� �ϱ� ������ stack�� ����ִ� �޼����� �����Ͽ� �������� �����ð��� �߻��ϱ⶧����
		// out���� �ʰ� ��µ� �� �ִ�.
		
			System.err.println("����>java UseRuntimeException ��1 ��2");
			
			//1. ������ ���ܸ޼��� ���
			System.err.println("�ʰ��� "+aioobe.getMessage());
			//2. ���ܸ� ó���ϴ� Ŭ������� ������ ���ܸ޼��� ���
			System.err.println("----------------------------------------------");
			System.err.println(aioobe.toString());
			System.err.println(aioobe);
			//3. �ڼ��� ���ܸ޼��� : ���ܹ߻� Ŭ���� ��ο� ���ܹ߻��� ������ ���´�.
			System.err.println("----------------------------------------------");
			aioobe.printStackTrace();
			
			num1 = 1;
			num2 = 1;
		} catch(NumberFormatException nfe){
			System.err.println("���� ���� ���¸� �Է� ����");
			num1 = 1;
			num2 = 1;
		} 
		
		try {
			result = num1/num2;
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage()); // �ſ� ������ �޽���
			System.err.println(ae); // ����ó��Ŭ���� + ������ �޽���
			ae.printStackTrace(); // �ڼ��� �޽��� + ���ܰ� �߻��� ���μ�
			num2 = 1;
			result = num1/num2;
		}
		
		System.out.printf("%d/%d = %d",num1,num2,result);
		*/
	}

}
