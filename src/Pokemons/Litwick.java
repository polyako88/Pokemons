package Pokemons;

import Moves.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Litwick extends Pokemon {
        public Litwick (String name, int level) {
            super(name, level);
            this.setType(Type.GHOST, Type.FIRE);
            this.setStats(50, 30, 55, 65, 55, 20);
            this.setMove(new DarkPulse(), new Smog());
        }
}
