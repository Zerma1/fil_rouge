package model.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Calculateur {
    /**
     * Donne un int aleatoire entre min et max.
     * @param min
     * @param max
     * @return
     */
    public static int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    /**
     * Donne un int aleatoire entre min et max.
     * @param min
     * @param max
     * @return
     */
    public static Long randLong(long min, long max) {
        return ThreadLocalRandom.current().nextLong(min, max + 1);
    }
}
