package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dao.entities.Utilisateur;
import dao.util.IDGenerate;

@Repository
public class UtilisateurDaoImpl{
	
	public static List<Utilisateur> all() {
		ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		try {
			java.sql.Connection myCon= Connectathon.getCon();
			PreparedStatement myStmt = myCon.prepareStatement("SELECT * FROM utilisateur  ORDER BY id asc");
			ResultSet resultat = myStmt.executeQuery();
			while (resultat.next()) {
				utilisateurs.add(new Utilisateur(resultat.getString("id"), resultat.getString("nom"),resultat.getString("prenom"), resultat.getString("adresse"), resultat.getString("mail"), resultat.getString("phone"), resultat.getBoolean("delete"), resultat.getBoolean("archive")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateurs;
	}

	public static Utilisateur save(Utilisateur user) {
		user.setId(IDGenerate.generate());
		try {
			String req = "INSERT INTO users(nom,prenom,mail,adresse,phone,archive,delete,id) VALUES (?,?,?,?,?,?,?,?)";
			java.sql.Connection myCon= Connectathon.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1,user.getNom());
			preparedStatement.setString(2,user.getPrenom());
			preparedStatement.setString(3,user.getMail());
			preparedStatement.setString(4,user.getAdresse());
			preparedStatement.setString(5,user.getPhone());
			preparedStatement.setBoolean(6,false);
			preparedStatement.setBoolean(7,false);
			preparedStatement.setString(8,user.getId());

			preparedStatement.executeUpdate();
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Utilisateur update(Utilisateur user) {
		try {
			String req = "UPDATE utilisateur set nom=?,prenom=?,mail=?,adresse=?,phone=?,archive=?,delete=? where id=?";
			java.sql.Connection myCon= Connectathon.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1,user.getNom());
    		preparedStatement.setString(2,user.getPrenom());
    		preparedStatement.setString(3,user.getMail());
    		preparedStatement.setString(4,user.getAdresse());
    		preparedStatement.setString(5,user.getPhone());
    		preparedStatement.setBoolean(6,user.isArchive());
    		preparedStatement.setBoolean(7,user.isDelete());
    		preparedStatement.setString(8,user.getId());
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
			java.sql.Connection myCon= Connectathon.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1, id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static Utilisateur getById(String id) {
		 try {

			 java.sql.Connection myCon= Connectathon.getCon();
	            PreparedStatement myStmt = myCon.prepareStatement("SELECT * FROM utilisateur WHERE id = ?");
	            myStmt.setString(1, id);
	            ResultSet resultat = myStmt.executeQuery();
	            if (resultat.next()) {
	             Utilisateur  user  = new Utilisateur(resultat.getString("id"), resultat.getString("nom"),resultat.getString("prenom"), resultat.getString("adresse"), resultat.getString("mail"), resultat.getString("phone"), resultat.getBoolean("delete"), resultat.getBoolean("archive"));
	                return user;
	            }
	            return null;
	        } catch (SQLException e) {
	        	return null;
	        }
	}
}