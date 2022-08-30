package First_Task;

import java.util.*;

public class Main {

	public static void main(String[] args) {
//Sorting by comparable		
		Set <Ship> hs = new HashSet<>();
		hs.add(new Ship("Titanic", 100));
		hs.add(new Ship("Cutter", 6));
		hs.add(new Ship("Wooden_Boat", 3));
		hs.add(new Ship("Sail_Boat", 9));
		hs.add(new Ship("Yacht", 42));

		System.out.println("Before sorting by comarable:");		
		for (Ship s : hs) {
			System.out.println(s);
		}
		
		Set <Ship> ts = new TreeSet<>(hs);
		
		System.out.println("\nAfter sorting by comarable:");
		
		for (Ship s2 : ts) {
			System.out.println(s2);
		}	
//Sorting by comparator		
		Set <Ship> hs2 = new HashSet<>();
		hs2.add(new Ship("IceBreaker", 76));
		hs2.add(new Ship("WaveCutter", 7));
		hs2.add(new Ship("Fastness", 13));
		hs2.add(new Ship("Boat", 9));
		hs2.add(new Ship("Boat", 12));
		hs2.add(new Ship("Victory", 22));
		hs2.add(new Ship("Bolt", 30));

		System.out.println("\nBefore sorting by comarator:");
		for (Ship s : hs2) {
			System.out.println(s);
		}
		
		List <Ship> list = new ArrayList<>(hs2);
		Collections.sort(list, new ShipComparator());
		System.out.println("\nAfter sorting by comarator:");
		
		for (Ship l : list) {
			System.out.println(l);
		}
	}

	

}
