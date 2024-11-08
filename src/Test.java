import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Test {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Swablu("Swablu", 1);
        Pokemon p2 = new Deoxys("Deoxys", 1);
        Pokemon p3 = new Litwick("Litwick",1 );
        Pokemon p4 = new Lampent("Lampent",1 );
        Pokemon p5 = new Altaria("Altaria",1 );
        Pokemon p6 = new Chandelure("Chandelure",1 );
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}