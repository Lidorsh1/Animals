package animals;

public class Dog extends Mammal implements Navigator{

	public void speak() {
	}
	public Dog() {
		System.out.println("speak like a Dog");
}
	@Override
	public void navigate() {

		System.out.println("navigate like a dog");
	}

}
