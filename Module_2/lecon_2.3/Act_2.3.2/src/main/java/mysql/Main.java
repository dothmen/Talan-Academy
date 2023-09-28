package mysql;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
		 FilmManager filmManager = new FilmManager();

	        // Testez les méthodes ici
	        List<Film> films = filmManager.consulterTousLesFilms();
	        System.out.println("Tous les films :");
	        for (Film film : films) {
	            System.out.println(film);
	        }

	        Film film = filmManager.consulterFilmParID(1);
	        System.out.println("Film par id_film (377) : " + film);

	        filmManager.modifierTitreFilm(2, "Nouveau Titre");
	        System.out.println("Titre du film modifié.");

	        filmManager.supprimerFilm(3);
	        System.out.println("Film supprimé.");
	    }

	}


