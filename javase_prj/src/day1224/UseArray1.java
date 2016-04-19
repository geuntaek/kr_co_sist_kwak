package day1224;


/**
 * 일차원 배열의 사용
 * @author user
 */
public class UseArray1 {
	public UseArray1(){
		// 1. 선언 : 데이터형[] 배열명 = null;
//		int a1[],a2;// 배열 하나, 정수형 변수 하나임. 일관성이 없기 때문에 잘 사용하지 않는다.
		int[] arr; // 배열이 만들어짐
		
		// 2. 생성 : 배열명 = new 데이터형[방의 수];
		arr= new int[6]; // 인덱스는 0~5까지
		
		// 1+2 : 데이터형[] 배열명 = new 데이터형[방의 수];
		// 참조형 데이터형은 주소라는 것을 가지게 된다. 
		int[] arr1 = new int[3];
		
		System.out.println(arr+"/"+arr1);
		System.out.println("arr의 방의 수 : "+arr.length);
		System.out.println("arr1의 방의 수 : "+arr1.length);
		
		// 생성과 동시에 초기화 된다.
//		System.out.println(arr1[2]);
		
		// 3. 값 할당 : 배열명[방의 번호] = 값;
		arr[0]=2015;
		arr[3]=12;
		arr[5]=24;
		
		// 4. 값 사용 : 배열명[방의 번호]
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		
		System.out.println("---------------------------------------------");
		// 일괄 처리
		// 기존 for : 인덱스를 사용
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"] = "+arr[i]+"\t");
		}// end for
		
		System.out.println("\n---------------------------------------------");
		// 개선된 for : 인덱스를 사용하지 않음
		// 처음 방부터 끝방까지 모든 방의 값을 순차적으로 사용
		for(int value : arr){
			System.out.print(value+"\t");
		}
	}//UseArray1
	
	public void processScore(){
		System.out.println("\n---------------------------------------------");
		// 기본형 형식으로 생성
		int[] score = {90,55,48,67,97,70};
		int sum = 0;
		int maxScore = score[0];
		// 특정 구간을 비교할 때에는 초기값이 0부터가야한다.
		// 처음부터 끝까지를 비교할 때에는 0또는 배열명[0] 이렇게 2가지를 사용할 수 있다.
		
		int minScore = score[0];
		// 특정 구간을 비교할 때에는 초기값이 100부터가야한다.
		// 처음부터 끝까지를 비교할 때에는 100또는 배열명[0] 이렇게 2가지를 사용할 수 있다.
		
		String best = "";
		String worst = "";
		
		String[] names = {"이소희","이유진","이석진","함승지","함원지","로로롤"};
		
		
		System.out.println("응시인원 : "+score.length);
		System.out.println("번호\t이름\t자바");
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf(" %d\t%s\t %d\n",i+1,names[i],score[i]);
			sum +=score[i];
			if(maxScore<score[i]){ // 최고값구하기
				maxScore = score[i];
				best = names[i];
			}//end if
			if(minScore>score[i]){ // 최저값구하기
				minScore = score[i];
				worst = names[i];
			}//end if
		}//end for
		
		
		System.out.println("---------------------------------------------");
		System.out.printf("총점 : %d\t평균 : %.2f\n",sum,(float)sum/score.length);
		System.out.printf("최고점수 : %d  최고점수자 이름 : %s\n",maxScore,best);
		System.out.printf("최저점수 : %d  최저점수자 이름 : %s\n",minScore,worst);
		
		System.out.println("---------------------------------------------");
		String[] addr={"서울시 강남구","서울시 동작구","서울시 영등포구","서울시 광진구",
				"안산시 상록구","수원시 영통구","서울시 관악구","부산시 해운대구","전주시 완산구",
				"완도군 구운김리","군악구 완산정"};
		int cnt = 0;
		// 모든 서울시와 서울시의 수를 출력
//		for (int i = 0; i < addr.length; i++) {
//			if(addr[i].startsWith("서울")){
//				System.out.println(addr[i]);
//				cnt++;
//			}
//		}
		for(String temp : addr){
			if(temp.startsWith("서울")){
				System.out.println(temp);
				cnt++;
			}
		}
		System.out.println("서울시의 수 : "+cnt);
		System.out.println("---------------------------------------------");
		for(String temp : addr){
			if(temp.contains("완")){
				System.out.println(temp);
			}
		}
		/////////////////// 12-28-2015 정렬///////////////////
		int temp = 0;
		for (int i = 0; i < score.length-1; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i]<score[j]){
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					System.out.print(temp);
				}
			}
		}
		System.out.println("\n점수 정렬 후");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t",score[i]);
		}
		
		/////////////////// 띠 구하기 ///////////////////
		int year = 2015;
		String[] zodiac = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		System.out.println("\n"+zodiac[year%12]);
		
		
		
		
	}//processScore
	
	
	public static void main(String[] args) {
		// 객체명이 필요없을 때 사용하는 객체화
		// 인자있는 생성자도 마찬가지이다.
		// new 생성자(); 
		
		// 객체 생성후 여러개의 method를 호출 할 때 사용하는 객체화
//		UseArray1 ua = new UseArray1();
//		ua.processScore();
		
		// 생성후 딱 하나의 method만 호출할 때 사용하는 객체화
		// 객체화 : new 생성자().호출할method명();
		new UseArray1().processScore();
		
		
	}//main

}//class