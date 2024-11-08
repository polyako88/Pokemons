package Moves;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing() {
        super(Type.NORMAL, 0, 55);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect sing= new Effect().turns(2).condition(Status.SLEEP);
        pokemon.addEffect(sing);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку Sing";
    }
}