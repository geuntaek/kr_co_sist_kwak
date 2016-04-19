package day1228;

/**
 * 특정문자(열)로 잘라서 배열로 만드는 일을 하는 method의 사용
 * @author user
 */
public class UseSplit {
	public UseSplit(){ // 기본생성자
		String csv_data = "조근택.진주용,민명선,오윤상,홍가현";
		String[] csv_arr = csv_data.split("[.]");
		System.out.println("방의 수"+csv_arr.length);
		for (int i = 0; i < csv_arr.length; i++) {
			System.out.println(csv_arr[i]);
		}// end for
		
		String data = "서울시 강남구 서울시 동작구 서울시 광진구 서울시 영등포구";
		String[] csv_arr2 = data.split("서울시 ");
		System.out.printf("\n방의 수"+csv_arr2.length);
		for(String addr : csv_arr2){
			System.out.println(addr);
		}
		
		int year = 1993;
		String[] zodiac = "원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",");
		System.out.println("\n"+zodiac[year%12]);
		
		
	}
	public static void main(String[] args) {
		new UseSplit();
		
	}//main

}//class
