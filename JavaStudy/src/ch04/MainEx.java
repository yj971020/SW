package ch04;

public class MainEx {
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.eat();
		
		Human human=new Human();
		human.eat();
		human.score=88.0;
		
		System.out.println(human.score);
	}
}
