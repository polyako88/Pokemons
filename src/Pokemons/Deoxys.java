package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deoxys extends Pokemon {
    public Deoxys (String name, int level){
        super(name, level);
        this.setType(Type.PSYCHIC);
        this.setStats(50, 150, 50, 150, 50, 150);
        this.setMove(new DarkPulse(), new FlashCannon());
    }
}

