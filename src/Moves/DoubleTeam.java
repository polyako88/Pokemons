package Moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect doubleTeam = new Effect().stat(Stat.EVASION, 1);
        pokemon.addEffect(doubleTeam);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку DoubleTeam";
    }
}


