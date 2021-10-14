package com.fernoaga.pokemonapi.model;

public class Pokemon {

  private final int id;
  private final String name;

  public Pokemon(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
