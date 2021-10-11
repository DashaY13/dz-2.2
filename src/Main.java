public class Main {
    public static void main(String[] args) {
        int initialAccount = 20;
        int replenishment = 1200;
        int percent;
        if (replenishment >= 1000) {
            percent = replenishment / 100;
        } else {
            percent = 0;
        }
        int bonus = initialAccount + replenishment + percent;
        System.out.println(bonus);
    }
}
