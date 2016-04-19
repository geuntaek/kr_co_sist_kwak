package day1221;

public class Homework5 {
	public static void timesTable() {
		System.out.println("槛力1-1");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + j * i + "\t");
			}
			System.out.println();
		}
	}

	public int sumNum(int num) {
		System.out.println("\n槛力1-2");
		int sum = 0;
		for (int i = 1; i < num + 1; i++) {
			sum += i;
		}
		return sum;
	}

	public void printStar(int starNum) {
		System.out.println("\n槛力1-3");
		for (int i = 0; i < starNum; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public char initial() {
		return 'L';
	}

	public static void main(String[] args) {
		timesTable();
		Homework5 hm = new Homework5();
		System.out.println(hm.sumNum(10));
		hm.printStar(6);
		System.out.println("\n槛力1-4");
		System.out.println(hm.initial()+"\n");
	}// main
}// class
