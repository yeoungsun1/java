package this02;

public class DogMain {
	public static void main(String[] args) {
		Dog d1 = new Dog("바둑이");
		System.out.println(d1);
		Dog d2 = new Dog("초코");
		System.out.println(d2);
		
		d1.bark();
		d2.bark();
		
		d1.playWith("초코");
		d1.playWith(d2.name);
		
		Dog d3 = new Dog();
		System.out.println("객체의 참조값(주소값) : " + d3);
		
	}
}
