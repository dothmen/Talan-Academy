package voile;

public class boat {
	
	public String color;
	public String size;
	public int id;
	public bridge b;
	public cabin c;
	public shell s;
	
	
	public boat(String color, String size, int id, bridge b, cabin c, shell s) {
		super();
		this.color = color;
		this.size = size;
		this.id = 1;
		this.b = b;
		this.c = c;
		this.s = s;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
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
