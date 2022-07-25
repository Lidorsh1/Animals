package animals;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];

		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Ostrich();
		animals[3] = new Ant();
		animals[4] = new Dog();
		animals[5] = new Bat();
		animals[6] = new Dog();
		animals[7] = new Sparrow();

		for (int i = 0; i < animals.length; i++) {

			if(animals[i]!=null) {
				animals[i].speak();
				System.out.println("========================");
				if(animals[i]instanceof Flyer) {
					
					//animals[i].
				}
			}
			
		}
	}

}
