package voile;

public class cabin {
	
	public String shape;
	public int size;
	public int id;
	public cabin (String shape,int size,int id) {
		this.shape=shape;
		this.size=size;
		this.id=3;

}
	

	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
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
		return "cabin [shape=" + shape + ", size=" + size + ", id=" + id + ", getShape()=" + getShape() + ", getSize()="
				+ getSize() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	



}
