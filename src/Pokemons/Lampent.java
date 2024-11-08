package Pokemons;

import Moves.*;

import ru.ifmo.se.pokemon.Type;

public class Lampent extends Litwick{
    public Lampent(String name, int level){
        super(name, level);
        this.setType(Type.GHOST, Type.FIRE);
        this.setStats(60, 40, 60, 95, 60, 55);
        this.setMove(new Ember());
    }
}
