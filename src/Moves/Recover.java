package Moves;

import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove {
    public Recover() {
        super(Type.NORMAL, 0, 0);

    }
    //добавить эффект

    @Override
    protected java.lang.String describe() {
        return "использует атаку Recover";
    }
}

