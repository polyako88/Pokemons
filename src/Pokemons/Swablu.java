package Pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.Type;

public class Swablu extends Pokemon {
    public Swablu (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FLYING);
        this.setStats(40, 40, 60, 40, 75, 50);
        this.setMove(new Sing(), new Moonblast(), new CottonGuard());
    }
}
