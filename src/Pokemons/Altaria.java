package Pokemons;

import Moves.Bulldoze;
import Moves.CottonGuard;
import Moves.Moonblast;
import Moves.Sing;
import ru.ifmo.se.pokemon.Type;

public class Altaria extends Swablu{
    public Altaria (String name, int level){
        super(name, level);
        this.setType(Type.DRAGON, Type.FLYING);
        this.setStats(75, 70, 90, 70, 105, 80);
        this.setMove(new Bulldoze());
    }
}
