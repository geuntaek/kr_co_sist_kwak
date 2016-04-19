package day0108;

public class Test extends UseThrows { // 부모클래스인 UseThrows에서 예외를 throws함.
	
	//부모클래스의 생성자가 예외를 날리면 자식클래스의 생성자에서 해당 예외를 throws 날려보낸다. 이렇게 처리밖에 못한다. 상속때문이다.
	
	public Test() throws ClassNotFoundException{
		super(); // 생성자의 첫줄에는 super();가 있다. 이걸 처리(try catch)하고 싶어도 super()는 첫줄에 써져야하기때문에 에러가 난다. 그렇기 때문에 또 예외를 날려야한다.
	}

}
