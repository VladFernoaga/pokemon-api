package com.fernoaga.pokemonapi.controller;



import com.fernoaga.pokemonapi.dto.PokemonCollectionDto;
import com.fernoaga.pokemonapi.dto.PokemonDto;
import com.fernoaga.pokemonapi.service.PokemonReadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/pokemon")
public class PokemonController {

  private final PokemonReadService pokemonReadService;

  public PokemonController(PokemonReadService pokemonReadService) {
    this.pokemonReadService = pokemonReadService;
  }

  @GetMapping(path = "")
  public ResponseEntity<PokemonCollectionDto> getAll() {
    return ResponseEntity.ok().body(pokemonReadService.getPokemonCollection());
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<PokemonDto> getForId(@PathVariable("id") Integer id) {
    return ResponseEntity.ok().body(pokemonReadService.findPokemonById(id));
  }

  @ExceptionHandler(value = {IllegalArgumentException.class})
  protected ResponseEntity<Object> unknownArgument(RuntimeException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
  }
}
