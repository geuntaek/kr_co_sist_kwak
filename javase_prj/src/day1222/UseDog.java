package day1222;

public class UseDog {

	public static void main(String[] args) {
		Dog jindo = new Dog();
		System.out.println(jindo.eat("사료"));
		
		Dog poodle = new Dog(2,2,5,"검은");
		System.out.println(poodle.run("1000미터"));
		
		Dog corgi = new Dog(2,1,3,"네이비");
		System.out.println("눈은 "+corgi.getEye()+"개, 꼬리는 "+corgi.getTail()+
				"개, 다리는 "+corgi.getLeg()+"개인 이 개의 털색은 "+corgi.getColor());
	}

}
