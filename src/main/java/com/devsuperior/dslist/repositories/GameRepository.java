package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// Componente da camada e acesso a dados 
// Game = referência para a entidade  Long = referência para o tipo do ID
public interface GameRepository extends JpaRepository<Game, Long>{

}
