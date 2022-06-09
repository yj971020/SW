package ch04.ch2;

public class MainEx {
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.speak();
		
		Dog dog= new Dog();
		dog.speak();
		dog.speak(2);
		
		Cat cat=new Cat();
		cat.speak();
		
		Chicken ch= new Chicken();
		ch.speak();	
		
		System.out.println("------------------");
		
		 //Animal 배열
		Animal[] zoo=new Animal[3]; 
		//Animal 타입만 올 수 있는 배열 but 자식들 들어올 수 있음
		//but Animal 로 둔갑하여 들어감
		//자식들은 확장이 된 상태 -> Animal 타입으로 들어가면 확장된 부분은 사라짐 
		//(부모엔 없고 자식에만 있는 필드와 메소드는 없어짐)
		//but 오버라이드 된 부분은 재정의 된 그대로 사용 가능 
		
		zoo[0] = new Dog();  // Dog->Animal
		zoo[1] = new Cat(); // Cat->Animal
		zoo[2] = new Chicken(); // Chicken->Animal
		
		for(int i=0;i<zoo.length;i++) {
			zoo[i].speak();
		}
		// zoo[1].catEat() 
		//    -> cat 에만 있고 부모엔 없던 catEat() 메소드가 사라져 사용 불가
		
	}
}
