public class Orco extends Character {

    public Orco() {
        setHealth(180);
        setAttack(new Dice().generateRandomAttackBeast());
    }



}
