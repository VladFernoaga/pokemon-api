package com.fernoaga.pokemonapi.repository;



import com.fernoaga.pokemonapi.model.Pokemon;
import java.util.List;

public interface PokemonRepository {
  List<Pokemon> getPokemons();

}
