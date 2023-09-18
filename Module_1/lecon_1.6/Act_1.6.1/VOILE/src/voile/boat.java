package voile;

public class boat {
	
	public String color;
	public int size;
	public int id;
	public bridge bridge1;
	public cabin cabin1;
	public shell shell1;
	
	
	

	public boat(String color, int size, int id, bridge bridge1, cabin cabin1, shell shell1) {
		super();
		this.color = color;
		this.size = size;
		this.id = id;
		this.bridge1 = bridge1;
		this.cabin1 = cabin1;
		this.shell1 = shell1;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "boat [color=" + color + ", size=" + size + ", id=" + id + ", getColor()=" + getColor() + ", getSize()="
				+ getSize() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
