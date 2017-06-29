package strategy_pattern;

import strategy_pattern.behaviors.AxeBehavior;
import strategy_pattern.behaviors.BowAndArrowBehavior;
import strategy_pattern.behaviors.KnifeBehavior;
import strategy_pattern.behaviors.SwordBehavior;
import strategy_pattern.models.*;
import strategy_pattern.models.Character;

/**
 * Created by eliamyro on 29/6/17.
 *
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary  independently from
 * clients that use it.
 */
public class StrategyTest {

    static Character kingArthur;
    static Character queenElizabeth;
    static Character knightLancelot;
    static Character trollSlurb;

    public static void main(String[] args) {

        kingArthur = new King();
        queenElizabeth = new Queen();
        knightLancelot = new Knight();
        trollSlurb = new Troll();

        displayFightMessages();

        kingArthur.setWeapon(new AxeBehavior());
        queenElizabeth.setWeapon(new BowAndArrowBehavior());
        knightLancelot.setWeapon(new KnifeBehavior());
        trollSlurb.setWeapon(new SwordBehavior());

       displayFightMessages();
    }

    private static void displayFightMessages(){
        System.out.print("King: ");
        kingArthur.fight();
        System.out.print("Queen: ");
        queenElizabeth.fight();
        System.out.print("Knight: ");
        knightLancelot.fight();
        System.out.print("Troll: ");
        trollSlurb.fight();

        System.out.println();
    }
}
