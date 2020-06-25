public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefence("Magical");

        System.out.println("Boss health: " + boss.getBossHealth());
        System.out.println("Boss damage: " + boss.getBossDamage());
        System.out.println("Boss defence: " + boss.getBossDefence());
        System.out.println("******************");

        createHeroes();
    }

    public static Hero[] createHeroes() {

        Hero[] heroes = new Hero[3];

        Hero magic = new Hero(200, 20, "Magical", "Magic");
        Hero warrior = new Hero(250, "Warrior", 25);
        Hero kinetic = new Hero(220, 20, "Kinetic", "Kinetic");

        heroes[0] = magic;
        heroes[1] = warrior;
        heroes[2] = kinetic;

        for (int i = 0; i < 3; i++) {
            System.out.println("Hero: " + heroes[i].getHeroesName() + "; - Health: " + heroes[i].getHeroHealth() + "; Damage: "
                    + heroes[i].getHeroDamage() + "; Super ability: " + heroes[i].getHeroSuperAbility() + ";");
        }
        return heroes;
    }
}
