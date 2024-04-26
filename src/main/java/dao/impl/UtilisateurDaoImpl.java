package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dao.entities.Utilisateur;

@Repository
public class UtilisateurDaoImpl{
	
	public static List<Utilisateur> all() {
		ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		try {
			Connection myCon= Connectathon.getCon();
			PreparedStatement myStmt = myCon.prepareStatement("SELECT * FROM utilisateur");
			ResultSet resultat = myStmt.executeQuery();
			while (resultat.next()) {
				utilisateurs.add(new Utilisateur(resultat.getInt("id")+"", resultat.getString("nom"),resultat.getString("prenom"), resultat.getString("adresse"), resultat.getString("mail"), resultat.getString("phone"), resultat.getBoolean("delete"), resultat.getBoolean("archive")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateurs;
	}

	public static Utilisateur save(Utilisateur user) {
		try {
			String req = "INSERT INTO utilisateur(nom,prenom,mail,adresse,phone) VALUES (?,?,?,?,?)";
			Connection myCon= Connectathon.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1,user.getNom());
			preparedStatement.setString(2,user.getPrenom());
			preparedStatement.setString(3,user.getMail());
			preparedStatement.setString(4,user.getAdresse());
			preparedStatement.setString(5,user.getPhone());
			preparedStatement.executeUpdate();
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Utilisateur update(Utilisateur user) {
		try {
			String req = "UPDATE utilisateur set nom=?,prenom=?,mail=?,adresse=?,phone=? where id=?";
			Connection myCon= Connectathon.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1,user.getNom());
    		preparedStatement.setString(2,user.getPrenom());
    		preparedStatement.setString(3,user.getMail());
    		preparedStatement.setString(4,user.getAdresse());
    		preparedStatement.setString(5,user.getPhone());
    		preparedStatement.setInt(8,Integer.parseInt(user.getId()));
			preparedStatement.executeUpdate();
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static boolean delete(String id) {
		try {
			String req = "DELETE FROM utilisateur WHERE  id=?";
			Connection myCon= Connectathon.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setInt(1, Integer.parseInt(id));
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static Utilisateur getById(String id) {
		 try {

			 Connection myCon= Connectathon.getCon();
	            PreparedStatement myStmt = myCon.prepareStatement("SELECT * FROM utilisateur WHERE id = ?");
	            myStmt.setInt(1, Integer.parseInt(id));
	            ResultSet resultat = myStmt.executeQuery();
	            if (resultat.next()) {
	             Utilisateur  user  = new Utilisateur(resultat.getInt("id")+"", resultat.getString("nom"),resultat.getString("prenom"), resultat.getString("adresse"), resultat.getString("mail"), resultat.getString("phone"), resultat.getBoolean("delete"), resultat.getBoolean("archive"));
	                return user;
	            }
	            return null;
	        } catch (SQLException e) {
	        	return null;
	        }
	}
}