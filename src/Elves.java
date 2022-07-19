public class Elves extends Character {


    public Elves() {
        setHealth(250);
        setAttackInit();
    }


    public void setAttackInit() {

        Character el = new Orco();

        if (el.getClass().equals(Orco.class)) {
            setAttack(new Dice().generateRandomAttackHeroes()*10);
        } else {
            setAttack(new Dice().generateRandomAttackBeast());
        }
    }
}
