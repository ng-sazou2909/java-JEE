package service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import controlle.dto.UtilisateurDTO;
import dao.impl.UtilisateurDaoImpl;
import mapper.impl.UtilisateurMapperImpl;

@Service
public class UtilisateurServiceImpl{
	private static UtilisateurDaoImpl dao;
	private static UtilisateurMapperImpl mapper;
	
	public static List<UtilisateurDTO> all() {
		return dao.all().stream().map(us -> mapper.getUtilisateurToUtilisateurDTO(us)).collect(Collectors.toList());
	}

	public static UtilisateurDTO save(UtilisateurDTO user) {
		if (user==null) return null;
		return mapper.getUtilisateurToUtilisateurDTO(dao.save(mapper.getUtilisateurDTOToUtilisateur(user)));
	}

	public static UtilisateurDTO getById(String id) {
		if (id==null||id.equals(""))return null;
		return mapper.getUtilisateurToUtilisateurDTO(dao.getById(id));
	}

	public static UtilisateurDTO update(UtilisateurDTO user) {
		if (user==null) return null;
		return mapper.getUtilisateurToUtilisateurDTO(dao.update(mapper.getUtilisateurDTOToUtilisateur(user)));
	}

	public static boolean delete(String id) {
		if (id==null||id.equals(""))return false;
		return dao.delete(id);
	}
}