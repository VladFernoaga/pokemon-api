package com.fernoaga.pokemonapi.dto;



import java.util.List;

public class PokemonCollectionDto {

  private int count;
  private List<PokemonDto> result;

  public PokemonCollectionDto() {}

  public PokemonCollectionDto(int count, List<PokemonDto> result) {
    this.count = count;
    this.result = result;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public List<PokemonDto> getResult() {
    return result;
  }

  public void setResult(List<PokemonDto> result) {
    this.result = result;
  }
}
