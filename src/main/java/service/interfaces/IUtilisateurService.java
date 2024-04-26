package service.interfaces;

import java.util.List;

import controlle.dto.UtilisateurDTO;

public interface IUtilisateurService {
	List<UtilisateurDTO> all();
	UtilisateurDTO save(UtilisateurDTO user);
	UtilisateurDTO getById(String id);
	UtilisateurDTO update(UtilisateurDTO user);
	boolean delete(String id);
}
