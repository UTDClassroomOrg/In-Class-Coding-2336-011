/*
Classes & Objects

1 - Defining classes and objects  
2 - Instance variables and methods  
3 - Constructors (default, overloaded) 
4 - Constructor chaining (this())  
5 - The this keyword  
6 - Accessing objects and fields (. operator or access modifier)  
7 - UML basics (class diagrams)  
8 - Class abstraction and encapsulation  
9 - Static variables and methods
10 - Constants (static final)  
   - Visibility modifiers  (public (+) - protected (#) - package(~) - private(-)) )
11 - Getter and setter methods  
12 - Arrays of objects  
13 - Immutable objects 
14 - The toString() method 
15 - The equals() method 

---

Inheritance

16. Superclass and Subclass
17. The `extends` Keyword
18. Inheritance of Fields and Methods
19. Constructor Chaining (`super()`)
20. The `super` Keyword (super. in method)
21. Method Overriding
22. Abstract Methods (stopped here section11)
23. Object Casting (Upcasting, Downcasting)

Polymorphism

24. Polymorphism (Dynamic Binding)
25. The `instanceof` Operator (more example..)

Interfaces & Abstract Classes

26. Interfaces (`interface`, `implements`)
27. Abstract Classes in Depth
28. Multiple Inheritance of Type (Interfaces)
29. Implementing Multiple Interfaces
30. The `Comparable<T>` Interface (`compareTo`)
31. The `Cloneable` Interface (`clone`)
Note: make sure to also show the array of comparable objects even if they are not 
the same type of objects, like edible. 

Generics

32. Motivation for Generics (Type Safety, Eliminating Casting)
33. Generic Classes (`GenericClass<T>`)
34. Bounded Type Parameters (`<T extends Number>`)
35. Multiple Bounds (`<T extends A & B>`)
36. Generic Methods (`<T> T methodName(...)`)
37. Raw Types (and Why to Avoid Them)
38. Wildcards – Unbounded (`<?>`)
39. Wildcards – Upper Bounded (`<? extends T>`)
40. Wildcards – Lower Bounded (`<? super T>`)
41. Generic Collections (`ArrayList<T>`, `HashMap<K,V>`)
42. Restrictions and Limitations of Generics

 */


public abstract class Animal implements Comparable<Animal>, Cloneable{

	private String name = "def";
	private int weight;
	private int age;
	private boolean hasOwner;
	private double speed = 1;
	
	private static int numberOfAnimal;
	public static final String KINGDOM = "Animalia"; //constant
	
	public Animal() {
		this("def");
		//System.out.println("(1) Inside constructor of Animal");
		//Animal.numberOfAnimal++;
	}
	
	public Animal(String name) {
		//this.name = name;
		//Animal.numberOfAnimal++;
		this(name, 1);
		//System.out.println("(2) Inside constructor of Animal");

	}
	
	public Animal(String name, int speed) {
		this.setSpeed(speed);
		this.name = name;
		Animal.numberOfAnimal++;
		//System.out.println("(3) Inside constructor of Animal");

	}

	double getSpeed() {
		return speed;
	}

	void setSpeed(double speed) {
		if(speed > 1)
			this.speed = speed;
		else 
			System.out.println("speed must be more than 0!");
	}

	static int getNumberOfAnimal() {
		return numberOfAnimal;
	}

	public abstract String makeSound() ;
//	{
//		//System.out.println("Some generic sound.. ");
//		return "Some generic sound.. ";
//	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Animal)) return false;
		Animal other = (Animal) obj;
		return name.equals(other.name) && speed == other.speed;
	}

	@Override
	public String toString() {
		return "Animal [ name = " + this.name +", speed = " + this.speed + "]";
	}
	
	@Override
	public int compareTo(Animal other) {
		if(this.speed == other.speed) return 0;
		else if(this.speed > other.speed) return 1;
		else return -1;
		//return this.name.compareTo(other.name);
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}


}

class Cat extends Animal implements Jumper, Runner {
	
	Cat(){}
	
	Cat(String name){
		super(name);
	}
	
	@Override
	public String makeSound() {
		//System.out.println("Meowww");
		return "Meowww";
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.makeSound();
	}
	public String eat() {
		return "fish!";
	}

	@Override
	public void run() {
		System.out.println("run cat");
		
	}
	@Override
	public void jump() {
		System.out.println("jump cat");
		
	}
}

class Dog extends Animal implements Jumper, Runner{
	Dog(){
		//super();
	}
	Dog(String name){
		super(name);
	}
	Dog(String name, int speed){
		super(name, speed);
	}
	
	@Override
	public String makeSound() {
		//System.out.println("Meowww");
		return "Wolffff!";
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.makeSound();
	}
	@Override
	public void run() {
		System.out.println("run dog");
		
	}
	@Override
	public void jump() {
		System.out.println("jump dog");
		
	}

}

class Bird extends Animal{
	Bird(){
		//super();
	}
	Bird(String name){
		super(name);
	}
	Bird(String name, int speed){
		super(name, speed);
	}
	
	@Override
	public String makeSound() {
		return "Twit!";
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.makeSound();
	}
}

interface Jumper{
	void jump();
}

interface Runner{
	void run();
}


	
	

