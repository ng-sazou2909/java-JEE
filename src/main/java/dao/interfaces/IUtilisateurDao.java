package dao.interfaces;

import java.util.List;

import dao.entities.Utilisateur;

public interface IUtilisateurDao {
	List<Utilisateur> all();
	Utilisateur save(Utilisateur user);
	Utilisateur getById(String id);
	Utilisateur update(Utilisateur user);
	boolean delete(String id);
}