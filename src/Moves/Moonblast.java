package Moves;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends StatusMove {
    public Moonblast() {
        super(Type.FAIRY, 95, 100);

    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect moonBlast = new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(moonBlast);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку Moonblast";
    }
}
