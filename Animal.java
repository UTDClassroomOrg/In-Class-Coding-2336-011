public class Animal{

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

	public void makeSound() {
		System.out.println("Some generic sound.. ");
	}
	
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
	


}

class Cat extends Animal{
	
	//Cat(){}
	
	Cat(String name){
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meowww");
	}
	
}

class Dog extends Animal{
	
}
	
	

