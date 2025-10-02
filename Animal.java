
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

class Athlete<T extends Runner & Jumper>{
	private T participant;
	 
	Athlete(T participant){
		this.participant = participant;
	}
	
	public void perform() {
		participant.run();
		participant.jump();
	}
	
}


	
	

