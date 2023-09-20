package streaming;

import java.util.Objects;

public class Musique {
	public String title;
	public String othor;
	public String interpret;
	public String kind;
	public Musique(String title, String othor, String interpret, String kind) {
		super();
		this.title = title;
		this.othor = othor;
		this.interpret = interpret;
		this.kind = kind;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musique other = (Musique) obj;
		return Objects.equals(interpret, other.interpret) && Objects.equals(title, other.title);
	}
	public String toString() {
		return "titre:"+ title + "auteur:" + othor +  "interprete :"+ interpret+  "genre" +kind;
	}
	
	
	}

	
	
	
	
	


