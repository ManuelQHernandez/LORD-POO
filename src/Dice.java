import java.util.Random;

public class Dice {

    public int generateRandomAttackHeroes() {
        Random random = new Random();
        int value = random.nextInt(100 + 1) + 1;

        return value;
    }

    public int generateRandomAttackBeast() {
        Random random = new Random();
        int value = random.nextInt(90 + 0) + 0;
        return value;
    }
}
