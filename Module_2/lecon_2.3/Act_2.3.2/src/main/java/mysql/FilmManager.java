package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmManager {
	private Connection connection;
   public FilmManager() throws SQLException {
        connection = Connexion.getConnection();
    }
   public List<Film> consulterTousLesFilms() {
		    List<Film> films = new ArrayList<>();
		    String query = "SELECT * FROM film";

		    try (PreparedStatement statement = connection.prepareStatement(query);
		         ResultSet resultSet = statement.executeQuery()) {

		        while (resultSet.next()) {
		            int id_film = resultSet.getInt("id_film");
		            String titre = resultSet.getString("titre");
		            int duree_min = resultSet.getInt("duree_min");
		            Film film = new Film(id_film, titre, duree_min);
		            films.add(film);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return films;
		}
  public Film consulterFilmParID(int id_film) {
	   Film film = null;
	    String query = "SELECT * FROM film WHERE id_film = ?";

	    try (PreparedStatement statement = connection.prepareStatement(query)) {
	        statement.setInt(1, id_film);
	        ResultSet resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            String titre = resultSet.getString("titre");
	            // Récupérez les autres attributs du film ici
	            film = new Film();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return film;
	}
   public void modifierTitreFilm(int id, String nouveauTitre) {
	   String query = "UPDATE film SET titre = ? WHERE id_film = ?";

	    try (PreparedStatement statement = connection.prepareStatement(query)) {
	        statement.setString(1, nouveauTitre);
	        statement.setInt(2, id);
	        statement.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
  public void supprimerFilm(int id) {
	   String query = "DELETE FROM film WHERE id_film = ?";

	    try (PreparedStatement statement = connection.prepareStatement(query)) {
	        statement.setInt(1, id);
	        statement.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
   }
}