package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dao.entities.Utilisateur;
import dao.interfaces.IUtilisateurDao;
import dao.util.IDGenerate;

@Repository
public class UtilisateurDaoImpl{
	private static List<Utilisateur> users = new ArrayList();
	
	public static List<Utilisateur> all() {
		return users;
	}

	public static Utilisateur save(Utilisateur user) {
		user.setId(IDGenerate.generate());
		users.add(user);
		return user;
	}

	public static Utilisateur update(Utilisateur user) {
		for (int i = 0; i < users.size(); i++)
			if (users.get(i).getId().equals(user.getId()))
				{
				users.remove(i);
				users.add(user);
				return user;
				}
		return null;
	}

	public static boolean delete(String id) {
		for (int i = 0; i < users.size(); i++)
			if (users.get(i).getId().equals(id))
				{
				users.remove(i);
				return true;
				}
		return false;
	}

	public static Utilisateur getById(String id) {
		for (int i = 0; i < users.size(); i++)
			if (users.get(i).getId().equals(id))
				return users.get(i);
		return null;
	}
}