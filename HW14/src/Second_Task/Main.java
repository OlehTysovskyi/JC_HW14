package Second_Task;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		Scanner scn = new Scanner(System.in);
		int key = 0;
		
		while(true) {
			System.out.println("================================================="
							   + "\n-Enter:" 
		                       + "\n'1' to add commodity"
		                       + "\n'2' to remove commodity"
		                       + "\n'3' to change commodity"
		                       + "\n'4' to sort commodities by name"
		                       + "\n'5' to sort commodities by length"
		                       + "\n'6' to sort commodities by width"
		                       + "\n'7' to sort commodities by weight"
		                       + "\n'8' to see commodity on inex"
		                       + "\n'9' to exit");
			key = scn.nextInt();
			
			switch(key) {
			case (1) : {
				shop.addCmd();
				break;
			}
			case 2:{
				shop.removeCmd();
				break;
			}
			case 3:{
				shop.changeCmd();
				break;
			}
			case 4:{
				shop.sortByName();
				break;
			}
			case 5:{
				shop.sortByLength();
				break;
			}
			case 6:{
				shop.sortByWidth();
				break;
			}
			case 7:{
				shop.sortByWeight();
				break;
			}
			case 8:{
				shop.showElement();
				break;
			}
			case 9:{
				shop.exit();
				break;
			}			
			}
		}

	}

}
