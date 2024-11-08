package Moves;

import ru.ifmo.se.pokemon.*;

public class Ember extends SpecialMove {
    public Ember(){
        super(Type.FIRE,40,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect ember = new Effect().chance(0.1).condition(Status.BURN); //было .burn(pokemon)
        pokemon.addEffect(ember);
    }
    @Override
    protected java.lang.String describe(){

        return "использует атаку Ember";
    }
}


