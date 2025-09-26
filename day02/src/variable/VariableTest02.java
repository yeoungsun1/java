package variable;

public class VariableTest02 {
	public static void main(String[] args) {

		// 실수형(double, float)
		// double : 8byte(64bit)
		// 유효 자리수 : 소수점 이하 15자리~16자리

		// float : 4byte(32bit)
		// 유효자리수 : 소수점 6자리~7자리

		float pi = 3.1415926535f;
		double e = 2.718281828459023;
		System.out.println(pi); // 1415927 float는 반드시 값 뒤에 f, F를 붙여야함
		System.out.println(e); // double 실수형의 기본형이기 때문에 따로 안붙여도됨

	}
}
