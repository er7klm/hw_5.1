public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefence("Magic");

        System.out.println("Boss health: " + boss.getBossHealth());
        System.out.println("Boss damage: " + boss.getBossDamage());
        System.out.println("Boss defence: " + boss.getBossDefence());
    }
}
