/**
 * @author Alper
 *
 */
public class Program {

	
	public static void main(String[] args) {

		Car myCar = new Car(true);
		myCar.setTireCount(5);
		System.out.println(myCar.toString());
		
		Train smallTrain = new Train(false);
		System.out.println("Does the train has storage? " + smallTrain.hasStorage());
	}

}
