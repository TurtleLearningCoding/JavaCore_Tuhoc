
public class Dog extends Animal{

	public Dog() {
		super("dog");
	}
	public void bark() {
		System.out.println("Gau gau");
	}
	@Override
	public String toString() {
		return "Dog []";
	}

}
