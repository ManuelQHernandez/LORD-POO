public class Hobbit extends Character {

    public Hobbit() {
        setHealth(200);
        setAttackInit();
    }

    public void setAttackInit() {

        Character el = new Orco();

        if (el.getClass().equals(Orco.class)) {
            setAttack(new Dice().generateRandomAttackHeroes()-5);
        } else {
            setAttack(new Dice().generateRandomAttackBeast());
        }
    }
}
