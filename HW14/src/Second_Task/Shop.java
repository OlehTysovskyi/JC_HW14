package Second_Task;

import java.util.*;

public class Shop {
	
	Scanner scn = new Scanner(System.in);
	List <Commodity> cmd = new ArrayList<>();

	public void addCmd() {
		System.out.print("-Enter product's name: ");
		String name = scn.next();
		System.out.print("-Enter product's length: ");
		int length = scn.nextInt();
		System.out.print("-Enter product's width: ");
		int width = scn.nextInt();
		System.out.print("-Enter product's weight: ");
		int weight = scn.nextInt();
		cmd.add(new Commodity(name, length, width, weight));
		System.out.println("-Commodity was added successfully" + "\n" + cmd);	

	}
	public void removeCmd() {
		List<Commodity> toRemove = new ArrayList<>();
		System.out.print("-Enter product's name: ");
		String name = scn.next();
		for (Commodity c : cmd) {
			if(c.getName().equals(name)) {
				toRemove.add(cmd.get(cmd.indexOf(c)));
			}
		}
		cmd.removeAll(toRemove);
		System.out.println("-Commodity was removed successfully" + "\n" + cmd);
	}
	public void changeCmd() {
		System.out.print("-Enter product's name to change: ");
		String name = scn.next();
		System.out.print("-Enter new product's name: ");
		String newName = scn.next();
		System.out.print("-Enter new product's length: ");
		int newLength = scn.nextInt();
		System.out.print("-Enter new product's width: ");
		int newWidth = scn.nextInt();
		System.out.print("-Enter new product's weight: ");
		int newWeight = scn.nextInt();
		for (Commodity c : cmd) {
			if(name.equals(c.getName())) {
				c.setName(newName);
				c.setLength(newLength);
				c.setWidth(newWidth);
				c.setWeight(newWeight);
			}
		}
		System.out.println("-Commodity was changed successfully" + "\n" + cmd);	
	}
	public void sortByName() {
		System.out.println("Before sorting:" + "\n" + cmd);
		List <Commodity> nameCmd = new ArrayList<>();
		nameCmd.addAll(cmd);
		Collections.sort(nameCmd, new NameComparator());
		System.out.println("After sorting:" + "\n" + nameCmd);
	}
	public void sortByLength() {
		System.out.println("Before sorting:" + "\n" + cmd);
		List <Commodity> lengthCmd = new ArrayList<>();
		lengthCmd.addAll(cmd);
		Collections.sort(lengthCmd, new LengthComparator());
		System.out.println("After sorting:" + "\n" + lengthCmd);
	}
	public void sortByWidth() {
		System.out.println("Before sorting:" + "\n" + cmd);
		List <Commodity> widthCmd = new ArrayList<>();
		widthCmd.addAll(cmd);
		Collections.sort(widthCmd, new WidthComparator());
		System.out.println("After sorting:" + "\n" + widthCmd);
	}
	public void sortByWeight() {
		System.out.println("Before sorting:" + "\n" + cmd);
		List <Commodity> weightCmd = new ArrayList<>();
		weightCmd.addAll(cmd);
		Collections.sort(weightCmd, new WeightComparator());
		System.out.println("After sorting:" + "\n" + weightCmd);
	}
	public void showElement() {
		System.out.print("-Enter product's index: ");
		int index = scn.nextInt();
		
		try {
			for (Commodity c : cmd) {
				if(cmd.indexOf(c)==(index)) {
					System.out.println(cmd.get(index));
				}	
				else throw new ArrayIndexOutOfBoundsException();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("*You entered wrong index!!!");
		}
	}
	public void exit() {
		System.exit(0);
	}
}
