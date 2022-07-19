public class Trasgo extends Character {

    public Trasgo() {
        setHealth(180);
        setAttack(new Dice().generateRandomAttackBeast());
    }

}
