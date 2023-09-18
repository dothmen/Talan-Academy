package voile;

public class shell {
	
	public String material;
	public String shape;
	public int id;
	public Veil v;
	
	public shell(String material, String shape, int id, Veil v) {
		super();
		this.material = material;
		this.shape = shape;
		this.id = id;
		this.v = v;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Veil getV() {
		return v;
	}


	public void setV(Veil v) {
		this.v = v;
	}


	@Override
	public String toString() {
		return "shell [material=" + material + ", shape=" + shape + ", id=" + id + ", v=" + v + ", getMaterial()="
				+ getMaterial() + ", getShape()=" + getShape() + ", getId()=" + getId() + ", getV()=" + getV()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	}


