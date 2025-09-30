import java.util.Arrays;

public class DriverMain011 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Animal pet1 = new Dog("max");
		Animal pet2 = new Dog("max");
		pet2.setName("luna");
		System.out.println(pet2.toString());
		System.out.println(pet1.equals(pet2));
		
		
		Animal pet3 = new Dog("cheeta", 1000);
		System.out.println(Animal.KINGDOM);
		pet1.makeSound();
		
		pet1.setSpeed(0);
		pet2.setSpeed(100);
		
		Animal[] petShop = new Animal[4];
		petShop[0] = pet1;
		petShop[1] = pet2;
		petShop[2] = pet3;
		petShop[3] = new Cat("kitty");
		
//		for(int i = 0 ; i < petShop.length; i++) {
//			System.out.print(petShop[i].getName()+ " - " + petShop[i].getSpeed());
//			System.out.println();
//		}
		
//		for(Animal a: petShop) { //for each loop
//			System.out.print(a.getName()+ " - " + a.getSpeed());
//			System.out.println();
//		}
//		

		
		Animal suger = new Cat("suger");
		Animal suger2 = (Cat) suger.clone();
		System.out.println(suger.getName() );
		System.out.println(suger2.getName());
		suger.makeSound();
		
		Dog puppy = new Dog();
		//puppy.eat();
		
		System.out.println("before sorting");
		for(Animal a: petShop) { //for each loop
			System.out.print(a.toString());
			//System.out.print(a.makeSound());
			System.out.println();
//			if(a instanceof Cat)
//				System.out.print(((Cat)a).eat());
//			System.out.println();


		}
		Arrays.sort(petShop);
		System.out.println("after sorting");
		for(Animal a: petShop) { //for each loop
			System.out.print(a);
			System.out.println();
		}
		
		//System.out.println(Animal.getNumberOfAnimal());
		
		Jumper[] jumpers = new Jumper[3];
		jumpers[0] = new Dog();
		jumpers[1] = new Cat();
		//jumpers[2] = new Bird(); This is not a Jumper
				
	}
}
