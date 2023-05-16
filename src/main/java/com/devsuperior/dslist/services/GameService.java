package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	// Devolve uma lista do tipo DTO
	public List<Game> findAll(){
      // O findAll() trazer do banco de dados uma lista de games. Faz uma consulta no banco de 
	  //dados para buscar no banco de dados todos os games
      List<Game> result = gameRepository.findAll();	
      return result;
	}
}
