package day1224;

/**
 * 주민번호를 처리하는 클래스를 사용
 * @author user
 */
public class UseWork {

	public static void main(String[] args) {
		Work w = new Work("151224-4235456");
		if (w.checkLength()) {
			if(w.checkHyphen()){
				if(w.birth().equals("처리불가")){
					System.out.println("내국인만 처리가능합니다.");
				}else{ // 모든 유효성 검증을 마친경우
					System.out.println("생일은 "+w.birth());
					System.out.println("나이는 "+w.age());
					System.out.println("성별은 "+w.gender());
					System.out.println("띠는 "+w.zodiac());
				}
			}else{
				System.out.println("유효하지 않은 주민번호형식");
			}
			
		} else {
			System.out.println(w.getSssn()+"은 주민번호 14자리 " + w.checkLength());
		}
	}

}
