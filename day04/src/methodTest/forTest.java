package methodTest;
//2번 : for문 안에서 작성한 결과와 밖에서 작성한 결과 차이
public class forTest {

	public static void main(String[] args) {
		
		//1~10까지 출력하는 반복문
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		//1~3까지의 값과 총합을 출력하는 반복문
		int total = 0;
		//int i = 1 조건식 1 <= 3 true 	total : 1	i++	: 1 + 1 현재 i의 값 : 2
		//			조건식 2 <= 3 true	total : 3	i++ : 2 + 1 현재 i의 값 : 3
		//			조건식 3 <= 3 true 	total : 6	i++ : 3 + 1 현재 i의 값 : 4
		//			조건식 4 <= 3 false 반복문 탈출!
		for(int i = 1; i <= 3; i++) {
//			System.out.println(i);
			total += i;	//total = total + i;	total = 3 + 3
			System.out.println(total); //total의 첫번째 반복값 : 1
										//total의 두번째 반복값 : 3
										//total의 세번째 반복값 : 6
		}

	}

}
