package mapper.impl;

import org.springframework.stereotype.Component;

import controlle.dto.UtilisateurDTO;
import dao.entities.Utilisateur;
import mapper.interfaces.IUtilisateurMapper;
@Component
public class UtilisateurMapperImpl{
	public static UtilisateurDTO getUtilisateurToUtilisateurDTO(Utilisateur data) {
		if (data==null)return null;
		UtilisateurDTO dto = new UtilisateurDTO();
		dto.setId(data.getId());
		dto.setAdresse(data.getAdresse());
		dto.setMail(data.getMail());
		dto.setPhone(data.getPhone());
		dto.setNom(data.getNom());
		dto.setPrenom(data.getPrenom());
		return dto;
	}
	public static Utilisateur getUtilisateurDTOToUtilisateur(UtilisateurDTO dto) {
		if (dto==null)return null;
		Utilisateur data = new Utilisateur();
		data.setId(dto.getId());
		data.setAdresse(dto.getAdresse());
		data.setMail(dto.getMail());
		data.setPhone(dto.getPhone());
		data.setNom(dto.getNom());
		data.setPrenom(dto.getPrenom());
		return data;
	}
}