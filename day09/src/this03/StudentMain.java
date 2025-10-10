package this03;

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student("철수");
		Student st2 = new Student("맹구", 2);
		Student st3 = new Student("유리", 3, "떡잎초등학교");
		
		st1.printInfo();
		st2.printInfo();
		st3.printInfo();
		
	}
}
