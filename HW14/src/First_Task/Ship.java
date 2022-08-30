package First_Task;

public class Ship implements Comparable<Ship>{

	private String name;
	private int length;
	
	Ship(String name, int length){
		this.name = name;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLenght(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Ship [name='" + name + "'; length=" + length + "]";
	}

	@Override
	public int compareTo(Ship o) {
		return this.name.compareTo(o.getName());
	}


	
	
	
}
