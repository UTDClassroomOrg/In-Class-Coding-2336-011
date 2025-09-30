
public class DriverMain011 {

	public static void main(String[] args) {
		Animal pet1 = new Animal("max");
		Animal pet2 = new Animal("max");
		pet2.setName("Luna");
		System.out.println(pet2.toString());
		System.out.println(pet1.equals(pet2));
		
		Animal pet3 = new Animal("cheeta", 1000);
		System.out.println(Animal.KINGDOM);
		pet1.makeSound();
		
		pet1.setSpeed(0);
		pet2.setSpeed(100);
		
		Animal[] petShop = new Animal[3];
		petShop[0] = pet1;
		petShop[1] = pet2;
		petShop[2] = pet3;	
		
//		for(int i = 0 ; i < petShop.length; i++) {
//			System.out.print(petShop[i].getName()+ " - " + petShop[i].getSpeed());
//			System.out.println();
//		}
		
//		for(Animal a: petShop) { //for each loop
//			System.out.print(a.getName()+ " - " + a.getSpeed());
//			System.out.println();
//		}
//		

		for(Animal a: petShop) { //for each loop
			System.out.print(a.toString());
			System.out.print(a);
			System.out.println();
		}
		
		Animal kitty = new Cat("kitty");
		System.out.println(kitty);
		kitty.makeSound();
		
		Dog puppy = new Dog();
		//puppy.eat();

		
		
	}
}
