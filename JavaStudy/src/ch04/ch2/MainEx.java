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
		
		 //Animal �迭
		Animal[] zoo=new Animal[3]; 
		//Animal Ÿ�Ը� �� �� �ִ� �迭 but �ڽĵ� ���� �� ����
		//but Animal �� �а��Ͽ� ��
		//�ڽĵ��� Ȯ���� �� ���� -> Animal Ÿ������ ���� Ȯ��� �κ��� ����� 
		//(�θ� ���� �ڽĿ��� �ִ� �ʵ�� �޼ҵ�� ������)
		//but �������̵� �� �κ��� ������ �� �״�� ��� ���� 
		
		zoo[0] = new Dog();  // Dog->Animal
		zoo[1] = new Cat(); // Cat->Animal
		zoo[2] = new Chicken(); // Chicken->Animal
		
		for(int i=0;i<zoo.length;i++) {
			zoo[i].speak();
		}
		// zoo[1].catEat() 
		//    -> cat ���� �ְ� �θ� ���� catEat() �޼ҵ尡 ����� ��� �Ұ�
		
	}
}
