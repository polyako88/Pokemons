package Moves;

import ru.ifmo.se.pokemon.*;

public class CottonGuard extends StatusMove {
    public CottonGuard(){
        super(Type.GRASS,0,0);

    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect cottonGuard = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.restore();
        pokemon.addEffect(cottonGuard);
    }
    @Override
    protected java.lang.String describe(){
        return "использует атаку CottonGuard";
    }
}

