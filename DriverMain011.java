import java.util.*;

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
		//jumpers[2] = new Bird(); //This is not a Jumper

		Object[] runner = new Object[4];
		runner[0] = new Dog();
		runner[1] = new Cat();
		runner[2] = new Bird();
		runner[3] = new String("runner");

		Runner r1 = (Runner) runner[0];
		//Runner r2 = (Runner) runner[2]; ////run timer error
		//Runner r3 = (Runner) runner[3]; //run timer error

		printRunners(runner);

		System.out.println("----Generic Class-------");
		System.out.println();

		Box<String> box = new Box<String>("Hi");
		System.out.println(box.get());

		//Box<String> box = new Box<String>(123); // not allowed
		
		
		System.out.println("----Generic Class Bounds-------");
		Calculator<Integer> c = new Calculator<Integer>();
		System.out.println(c.add(2, 3));
		
		System.out.println("----Generic Class Multiple Bounds-------");
		Athlete<Dog> athleteDog = new Athlete<Dog>(new Dog());
		athleteDog.perform();
		
		Athlete<Cat> athleteCat = new Athlete<Cat>(new Cat());
		athleteCat.perform();
		
		//Athlete<Bird> athleteBird = new Athlete<Bird>(new bird()); // no allowed

		System.out.println("----Generic Methods-------");
		util.print("hello");
		util.print(123);
		
		util.countLength("hello");
		
		Cat echoCat = util.echo(new Cat("Kitten"));
		System.out.println(echoCat);
		
		Integer echoNum = util.echo(1122);
		System.out.println(echoNum);
		
		
		System.out.println("----wild cards-------");

		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		//list.add(123);// not allowed
		list.add("java");
		printList(list);
		
//		ArrayList list1 = new ArrayList(); //raw type avoid it
//		list.add("hello");
//		list.add(123);// not allowed
//		list.add("java");
//		printList(list);
		
		ArrayList<Animal> listOfAnimal = new ArrayList<Animal>();
		listOfAnimal.add(new Cat());
		listOfAnimal.add(new Dog());
		listOfAnimal.add(new Bird());
		//listOfAnimal.add("Animal");//not allowed
		
		//printAnimals(listOfAnimal);
		
		addDog(listOfAnimal);
		printAnimals(listOfAnimal);

	}

	public static void printRunners(Object[] runners) {
		System.out.println("----inside printRunners method-------");

		for(Object r: runners) { //for each loop
			if(r instanceof Runner)
				((Runner) r).run();
			else
				System.out.println(r);
		}
	}
	
	static void printList(List<?> list) {
	    for (Object o : list) System.out.println(o);
	}

	static void printAnimals(List<? extends Animal> list) {
	    for (Animal a : list) 
	    	System.out.println(a);
	}

	static void addDog(List<? super Dog> list) {
		list.add(new Dog("Rex" , 203));
	}



}
