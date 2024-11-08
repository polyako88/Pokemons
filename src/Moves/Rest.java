package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect rest = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.restore();
        pokemon.addEffect(rest);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку Rest";
    }
}