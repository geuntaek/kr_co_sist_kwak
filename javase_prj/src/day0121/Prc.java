package day0121;

public class Prc {

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		System.out.println("Question " + question);
		System.out.println("Answer " + answer);
	}

	/**
	 * �迭strArr�� ������� �ϳ������Ƿ� ��󼭹�ȯ Math.random() ���
	 * 
	 * @param strArr
	 * @return
	 */
	public static String getAnswer(String[] strArr) {
		int i = (int) (Math.random() * (strArr.length));
		String str = strArr[i];
		return str;

	}

	/**
	 * �־��� ���ڿ� str�� �� ������ ��������������, ���ο� ���ڿ��� ��ȯ Math.random()���
	 * 
	 * @param str
	 * @return
	 */
	public static String getScrambledWord(String str) {
		char[] c = str.toCharArray();
		int cnt = 0;
		char temp = 0;
		for (int i = 0; i < c.length; i++) {
			cnt = (int) (Math.random() * c.length);
			temp = c[i];
			c[i] = c[cnt];
			c[cnt] = temp;
		}

		return new String(c);
	}

}
