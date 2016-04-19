package day1221;

/**
 *	method�� �Ű������� �ϳ����� �������� ���ڸ� ���� �� �ִ� ������������ ���
 *		public void method(�������� ... �Ű�������){ // ���������ڿ� ��ȯ���� �ְ������� �൵ �ȴ�.
 *		
 *		}
 * @author user
 */
public class VariableArguments {
	public void test( int ... param_i){ // ���� �� 
		// ... �� ���� �Ű������� �迭�� ó���ȴ�.
		for (int i = 0; i < param_i.length; i++) {
			System.out.print(param_i[i]+"\t");
		}
		System.out.println();
	}//test
	
	//variable arguments�� �ٸ� �Ű������� ���� 
	//���ǵɶ� ���� ���������� ������ �� �ִ�.
	public void vaTest(int j, String s, char c, int ... i){
		System.out.println(j);
		System.out.println(s);
		System.out.println(c);
		for (int k = 0; k < i.length; k++) {
			System.out.print(i[k]+"\t");
		}
	}
	public static void main(String[] args) {
		//��üȭ : Ŭ������ ��ü�� = new Ŭ������();
		VariableArguments va = new VariableArguments();
		va.test(10,20,30,40,50,60); // ���� ���� �ҷ����� -> �ּҰ� ��µ�.
		va.vaTest(52121704, "�̼���", 'A', 4,5,6,4,54,864,233);
	}
}
