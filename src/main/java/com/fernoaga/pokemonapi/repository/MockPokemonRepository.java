package com.fernoaga.pokemonapi.repository;



import com.fernoaga.pokemonapi.model.Pokemon;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MockPokemonRepository implements PokemonRepository {

  @Override
  public List<Pokemon> getPokemons() {
    var pokemons = new ArrayList<Pokemon>();
    pokemons.add(new Pokemon(1, "bulbasaur"));
    pokemons.add(new Pokemon(2, "ivysaur"));
    pokemons.add(new Pokemon(3, "venusaur"));
    pokemons.add(new Pokemon(4, "charmander"));
    pokemons.add(new Pokemon(5, "charmeleon"));
    pokemons.add(new Pokemon(6, "charizard"));
    pokemons.add(new Pokemon(7, "squirtle"));
    pokemons.add(new Pokemon(8, "wartortle"));
    pokemons.add(new Pokemon(9, "blastoise"));
    pokemons.add(new Pokemon(10, "caterpie"));
    return pokemons;
  }
}
