
// Sub - class

public class Car {

	public static void main(String[] args) {

		Vehicle p = new Vehicle();

		p.setWheelsCount(4);
		//p.setSeats(5);

		if (p.getSeats() == 2 & p.getWheelsCount() > 2) {
			System.out.println("looks like a luxury vehicle"+p.getSeats() );
		} else
			System.out.println("nice vehicle" +p.getSeats() );

	}

}
