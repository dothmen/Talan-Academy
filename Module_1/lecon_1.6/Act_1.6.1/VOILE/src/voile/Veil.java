package voile;

public class Veil {
	private boolean rollup;
	private boolean unroll;
	public  String color;
	protected int size;
	private String cloth;
	private String shape;
    public  int id;
	
	public Veil (boolean rollup , boolean unroll , String color ,  int  size ,  String cloth, String shape, int id) {
		this.rollup= rollup;
		this.unroll=  unroll;
		this.color =  color;
		this.size=     size;
		this.cloth= cloth;
		this.shape= shape;
		this.id=5;
	}
	
	public boolean isRollup() {
		return rollup;
	}

	public void setRollup(boolean rollup) {
		this.rollup = rollup;
	}

	public boolean isUnroll() {
		return unroll;
	}

	public void setUnroll(boolean unroll) {
		this.unroll = unroll;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Veil [rollup=" + rollup + ", unroll=" + unroll + ", color=" + color + ", size=" + size + ", cloth="
				+ cloth + ", shape=" + shape + ", id=" + id + ", isRollup()=" + isRollup() + ", isUnroll()="
				+ isUnroll() + ", getSize()=" + getSize() + ", getCloth()=" + getCloth() + ", getShape()=" + getShape()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
