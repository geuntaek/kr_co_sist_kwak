package day1221;

public class UseNoddle {

	public static void main(String[] args) {
		Noddle nd = new Noddle();
		nd.setName("신라면");
		nd.setSoup(2);
		nd.setBrand("농심");
		System.out.println(nd.boil("3분"));
	}//main 
}//class
