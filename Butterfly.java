package animals;

public class Butterfly extends Insect implements Flyer{

	public void speak() {
	}
	public Butterfly() {
		System.out.println("speak like a Butterfly");
}
	@Override
	public void fly() {

		System.out.println("fly like a butterfly");
	}

}
