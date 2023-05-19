package com.devsuperior.dslist.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

// anotação para registrar essa classe como um componente no Spring
// @Component
@Service
public class GameService {
    
	// Injetando uma instância do GameRepository dentro do GameServive
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
	  Game result = gameRepository.findById(gameId).get();
	  GameDTO dto = new GameDTO(result);
	  return dto; 
	}
	
	// Devolve uma lista do tipo DTO
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
      // O findAll() trazer do banco de dados uma lista de games. Faz uma consulta no banco de 
	  //dados para buscar no banco de dados todos os games
      List<Game> result = gameRepository.findAll();	
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
	}
}
