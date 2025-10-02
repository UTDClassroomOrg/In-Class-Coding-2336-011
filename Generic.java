
class Box<T> {
	T value;
	Box(T value){
		this.value = value;
	}
	T get() {
		return value;
	}
}

class Calculator<T extends Number>{
	double add (T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}
	
}

class util{
	
	public static <T> void print(T item) {
		System.out.println(item);
	}
	
	public static <T> int countLength(T item) {
		return item.toString().length();
	}
	
	public static <T> T echo(T item) {
		return item;
	}
	
	
	
	
}

