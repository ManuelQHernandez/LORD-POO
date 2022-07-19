public abstract class Character {

    private int Attack;
    private int Health;

    public Character() {
    }



    public boolean isAlive() {
        return Health > 0;
    }

    public int getHealth() {
        return Health;
    }

    public int getAttack() {
        return Attack;
    }

    public void setHealth(int health) {
        if (health < 0){
            this.Health=0;
        }else{
            this.Attack = Attack;
        }
    }

    public void setAttack(int attack) {
        if (attack < 0) {
            this.Attack=0;
        } else {
            this.Attack = Attack;
        }
    }


}

