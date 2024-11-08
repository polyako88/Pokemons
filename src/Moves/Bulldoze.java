package Moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect bulldoze = new Effect().turns(1).stat(Stat.SPEED, -1);
        pokemon.addEffect(bulldoze);

    }

    @Override
    protected java.lang.String describe() {
        return "использует атаку Bulldoze";
    }
}