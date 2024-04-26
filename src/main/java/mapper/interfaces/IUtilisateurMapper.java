package mapper.interfaces;

import controlle.dto.UtilisateurDTO;
import dao.entities.Utilisateur;

public interface IUtilisateurMapper {
	UtilisateurDTO getUtilisateurToUtilisateurDTO(Utilisateur data);
	Utilisateur getUtilisateurDTOToUtilisateur(UtilisateurDTO dto);
}