package streaming;

public class PlayListUI {

	public static void main(String[] args) {
	
        PlayList playliste1 = new PlayList(null, null, null, null, null);
        PlayList playliste2 = new PlayList(null, null, null, null, null);

        playliste1.ajouterMusique();
        playliste1.ajouterMusique();

        playliste2.ajouterMusique();
        playliste2.ajouterMusique();

        System.out.println(playliste1);
        System.out.println(playliste2);

        Musique musiqueRecherchee = playliste1.rechercherMusique("Chanson 1");
        if (musiqueRecherchee != null) {
            System.out.println("Musique trouvée : " + musiqueRecherchee);
        } else {
            System.out.println("Musique non trouvée.");
        }
    }



	}


