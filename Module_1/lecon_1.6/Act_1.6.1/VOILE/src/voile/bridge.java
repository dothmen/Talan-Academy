package voile;

public class bridge {
	
	public String color;
	public int size;
	public int id;
	public bridge (String color,int size,int id) {
		this.color=color;
		this.size=size;
		this.id=2;
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
		return "bridge [color=" + color + ", size=" + size + ", id=" + id + ", getColor()=" + getColor()
				+ ", getSize()=" + getSize() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
