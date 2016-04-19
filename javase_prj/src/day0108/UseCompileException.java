package day0108;

/**
 * ����ڰ� try~catch�� �ۼ����������� �ڵ������� �߻��ϴ� CompileException
 * ��ü�� �����Ϸ��� �����Ϸ��� ��ü�� impliments Cloneable interface�� �ݵ�� �����ؾ��Ѵ�.
 * @author user
 */
public class UseCompileException implements Cloneable {
	
	int i;
	public UseCompileException(){
		i=100;
	}//UseCompileException
	
	public static void main(String[] args) {
		
		// ������ ��ü�� ����
		UseCompileException uce = new UseCompileException();
		
		// ����, �� try~catch�� ����Ѵ�.
		try {
			UseCompileException uce1 = (UseCompileException)uce.clone();
			System.out.println("���� "+uce+"/���� "+uce1);
			uce1.i = 60;
			System.out.println("���� "+uce.i+"-���� "+uce1.i+"="+(uce.i-uce1.i));
			
		} catch (CloneNotSupportedException e) { // ������ �������� �ʴ� ��Ȳ
			System.err.println("�� ��ü�� ������ ���� �ʴ� ��ü");
			e.printStackTrace();
		} // ���� ���߰� 
		
		// �ܺ�Ŭ������ ��üȭ���� �ʰ� ����. ��ü���⿡ �����.. ��üȭ�����ʰ� �ҷ��� Ŭ������ �޼ҵ带 �� �� �ִ�.
		try {
			Class loadClass = Class.forName("day0108.UseRuntimeException"); // try~catch ���� ������ ����
			System.out.println("Ŭ�����ε�����");
			System.out.println(loadClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} // main

} // class











