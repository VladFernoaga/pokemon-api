package com.fernoaga.pokemonapi.service;



import com.fernoaga.pokemonapi.dto.PokemonCollectionDto;
import com.fernoaga.pokemonapi.dto.PokemonDto;

public interface PokemonReadService {

  PokemonCollectionDto getPokemonCollection();

  PokemonDto findPokemonById(int id);
}
