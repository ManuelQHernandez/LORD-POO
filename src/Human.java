public class Human extends Character {


    public Human() {
        setHealth(180);
        setAttack(new Dice().generateRandomAttackHeroes());
    }



}
