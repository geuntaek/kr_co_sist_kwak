package day1228;

public class Homework7 {

	public Homework7() {
		int[][] arr = new int[5][10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				}
				System.out.printf("%d", arr[i][j]);
			} // end for
			System.out.println();
		} // end for
	}// Homework7

	public static void main(String[] args) {
		new Homework7();
	}// main

}// class
