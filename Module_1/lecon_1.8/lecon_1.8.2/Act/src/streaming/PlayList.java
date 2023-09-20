package streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayList {
	public String non;
	public String kind;
	List <Musique> PlayList;
	public PlayList(String non, String kind, List<Musique> playList) {
		super();
		this.non = non;
		this.kind = kind;
		this.PlayList = playList;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		return Objects.equals(non, other.non);
	}
	public String toString() {
		return "titre:"+ non+   "genre" +kind + "liste de musique" +PlayList;
	}
	public void ajoutermusique(Musique m) {
		
		this.PlayList.add(m);
	}
	
      public void rechercher(Musique m) {
		
    	  this.non();
      }
      

}
