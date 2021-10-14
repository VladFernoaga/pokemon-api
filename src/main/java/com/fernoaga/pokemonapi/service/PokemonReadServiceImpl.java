package com.fernoaga.pokemonapi.service;



import com.fernoaga.pokemonapi.dto.PokemonCollectionDto;
import com.fernoaga.pokemonapi.dto.PokemonDto;
import com.fernoaga.pokemonapi.model.Pokemon;
import com.fernoaga.pokemonapi.repository.PokemonRepository;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonReadServiceImpl implements PokemonReadService {

  private final PokemonRepository pokemonRepository;

  @Autowired
  public PokemonReadServiceImpl(PokemonRepository pokemonRepository) {
    this.pokemonRepository = pokemonRepository;
  }

  @Override
  public PokemonCollectionDto getPokemonCollection() {
    var pokemons = pokemonRepository.getPokemons();
    var pokemonCount = pokemons.size();
    // @formatter:off
    var result = pokemons
                .stream()
                .map(this::toPokemonDto)
                .collect(Collectors.toList());
    // @formatter:on

    return new PokemonCollectionDto(pokemonCount, result);
  }

  @Override
  public PokemonDto findPokemonById(int id) {
    var pokemons = pokemonRepository.getPokemons();

    // @formatter:off
    var pokemon = pokemons
            .stream()
            .filter(p -> p.getId() == id)
            .findFirst();
    // @formatter:on

    if (pokemon.isPresent()) {
      return toPokemonDto(pokemon.get());
    } else {
      throw new IllegalArgumentException(String.format("Pokemon id %s not found", id));
    }
  }

  private PokemonDto toPokemonDto(Pokemon pokemon) {
    var pokemonDto = new PokemonDto();
    pokemonDto.setId(pokemon.getId());
    pokemonDto.setName(pokemon.getName());

    return pokemonDto;
  }
}
