package Moves;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {
    public FlashCannon() {
        super(Type.STEEL, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect flashCannon = new Effect().chance(0.1).stat(Stat.DEFENSE, -1);
        pokemon.addEffect(flashCannon);
    }

    @Override
    protected java.lang.String describe(){
        return "использует атаку FlashCannon";
    }
}

