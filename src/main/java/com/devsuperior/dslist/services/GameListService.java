package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

// anotação para registrar essa classe como um componente no Spring
// @Component
@Service
public class GameListService {
    
	// Injetando uma instância do GameListRepository dentro do GameListServive
	@Autowired
	private GameListRepository gameListRepository;
	
	
	// Devolve uma lista do tipo DTO
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
      // O findAll() trazer do banco de dados uma lista de games. Faz uma consulta no banco de 
	  //dados para buscar no banco de dados todos os games
      List<GameList> result = gameListRepository.findAll();	
      return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
