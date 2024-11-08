package Moves;
import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove{
    public DarkPulse(){
        super(Type.DARK,80,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect darkPulse = new Effect().chance(0.2).turns(1).stat(Stat.SPEED, -1); //добавить flinch
        pokemon.addEffect(darkPulse);
    }
    @Override
    protected java.lang.String describe(){
        return "использует атаку DarkPulse";
    }
}
