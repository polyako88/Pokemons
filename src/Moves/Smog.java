package Moves;

import ru.ifmo.se.pokemon.*;


public class Smog extends SpecialMove {
    public Smog(){
        super(Type.POISON,30,70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect smog = new Effect().chance(0.4).turns(1).condition(Status.POISON);
        pokemon.addEffect(smog);
    }
    @Override
    protected java.lang.String describe(){
        return "использует атаку Smog";
    }
}
