package day0112;

import java.io.File;

/**
 * ���丮 ����, ���� ����
 * @author user
 */
public class MakeDir {

	public MakeDir(){
		// ���丮 ����
		// �����ϴ� ���丮 ���� ���ο� ���丮�� ����
//		File file = new File("c:/dev/geunteak");
//		
//		if(file.mkdir()){ // return�� boolean
//			System.out.println(file+"�� �����Ǿ����ϴ�.");
//		}else{ // �θ���丮�� �߸� �� ���
//			System.out.println(file+"�� �������� �ʾҽ��ϴ�. �θ���丮�� Ȯ���ϼ���");
//		}
		
		// �θ���丮���� ����
//		File file = new File("c:/geunteack/juyong");
//		if(file.mkdirs()){
//			System.out.println(file+"�� �����Ǿ����ϴ�.");
//		}else{
//			System.out.println(file+"�� �������� �ʾҽ��ϴ�. ����̺긦 Ȯ���ϼ���");
//		}
		
		// ���� ����
		File file = new File("C:/dev/temp/java_read.txt");
		System.out.println( file.exists() );
		if(file.delete()){
			System.out.println(file+"������ �����Ǿ����ϴ�.");
		}else{ // ������ ���°��
			System.out.println(file+"�� ��θ� Ȯ���ϼ���.");
		}
	}
	public static void main(String[] args) {
		new MakeDir();
	}

}
