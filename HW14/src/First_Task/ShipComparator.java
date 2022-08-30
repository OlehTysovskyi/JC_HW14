package First_Task;

import java.util.Comparator;

public class ShipComparator implements Comparator<Ship>{

	@Override
	public int compare(Ship o1, Ship o2) {
		if(o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if(o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else {
			if(o1.getLength() > o2.getLength()) {
				return 1;
			} else if(o1.getLength() < o2.getLength()){
				return -1;
			} 	
		} 
		return 0;
	}
}
