package day0111;

/**
 * ����� ���� ����ó��Ŭ����<br>
 * 1. ����Ŭ������ �θ�� �Ѵ�. <br>
 * 2. �θ�Ŭ������ �����ڸ� ȣ���Ͽ� ���ܰ� �߻��Ǿ��� �� ����� �޼����� �־��ش�.
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class TobaccoException extends Exception {
	public TobaccoException() { // �⺻������
		// this(); // ���ȣ��, stackOverflow�߻�.
		this("���� �ǰ��� �طӽ��ϴ�.");

	}// TobaccoException

	public TobaccoException(String msg) {
		super(msg); // �θ�Ŭ������ �����ִ� ������ ȣ��

	}// TobaccoException
}// class
