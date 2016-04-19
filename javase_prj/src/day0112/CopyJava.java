package day0112;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CopyJava {

	public CopyJava() {
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "������ ���� ����", FileDialog.LOAD);
		fdOpen.setVisible(true); // dialog�� �����ش�.
		String name = fdOpen.getFile(); // ������ ������ �̸�
		String path = fdOpen.getDirectory(); // ������ ������ ���
		String[] fileArr = name.split("[.]"); // ������ �̸��� .�� �������� ������ �迭�� ����.

		if (fileArr[fileArr.length - 1].toLowerCase().equals("java")) { // �迭�� ������ ���� ���� java���
			try {
				BufferedReader br = new BufferedReader(new FileReader(path + name));
				String temp = "";
				int cnt = 0;
				StringBuilder output = new StringBuilder();
				boolean flag = false;

				// public class�� �� line�� ������ 6���� output�� ���̰� showConfirmDialog�� ���� �����ش�.
				while ((temp = br.readLine()) != null) {
					if (temp.contains("class")) { // ���� line�� public class�� ���ԵǾ��ִٸ�
						output.append(temp);
					}
					while (temp.contains("class")) {
						output.append(br.readLine()).append("\n");
						if (cnt == 5) {
							flag = true;
							break;
						}
						cnt++;
					}
					if (flag) {
						break;
					}
				}

				output.append("�����Ͻðڽ��ϱ�?");
				int option = JOptionPane.showConfirmDialog(frame, output);
				switch (option) {
				case JOptionPane.OK_OPTION: // ���� �������� ���
					StringBuilder copy_name = new StringBuilder(name); // java�����̸�.java�� copy_name�� ����.

					// copy_name�� �ڿ������� ã�� . �տ�[ ���� ��¥]�� ����.
//					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//					String now = format.format(new Date(System.currentTimeMillis()));
					copy_name.insert(copy_name.lastIndexOf("."), "[" + System.currentTimeMillis() + "]");

					File file = new File("C:/dev/copy");
					StringBuilder copy_sb = new StringBuilder();
					copy_sb.append(file.toString()).append("/").append(copy_name.toString()); // copy_sb : path/����[��¥].java
					
					File copy_file = new File(copy_sb.toString()); 

					if (file.mkdirs()) { // copyDir�� ����
						System.out.println("copy ���丮�� �����߽��ϴ�.");
					} else { // �̹� copyDir�� �����ϴ� ���
						System.out.println("copy ���丮�� �̹� �����Ǿ����ϴ�.");
					}

					FileInputStream fis = new FileInputStream(path + name); // copy�ϱ� ���� stream
					FileOutputStream fos = new FileOutputStream(copy_file); // copy�Ѱ� �����ϱ� ���� stream
					
					int read = 0;
					while ((read = fis.read()) != -1) { // ���� line�� ���� ������
						fos.write(read); // ��Ʈ���� ��� : ���߿� ��ϵǴ� �����Ͱ� ������ ��ϵ� �����͸� �ڵ����� �����Ѵ�. ���� �������� ���� �����͸� flush���ش�.
					}
					fos.flush();
					fos.close();
					fis.close();
					JOptionPane.showMessageDialog(frame, "���簡 �Ϸ�Ǿ����ϴ�.");
					break;
				default: // �ƴϿ� Ȥ�� ��Ҹ� �������� ���
					JOptionPane.showMessageDialog(frame, "���縦 ����߽��ϴ�.");
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(frame, "����� java�� �˴ϴ�.");
		}
		frame.dispose();
	}
	public static void main(String[] args) {
		new CopyJava();
	}

}
