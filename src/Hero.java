public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperAbility;
    private String heroesName;

    public Hero(){}

    public Hero(int heroHealth, int heroDamage, String heroSuperAbility, String heroesName) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperAbility = heroSuperAbility;
        this.heroesName = heroesName;
    }

    public Hero (int heroHealth, String heroesName, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroesName = heroesName;
        this.heroDamage = heroDamage;

    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperAbility() {
        return heroSuperAbility;
    }

    public String getHeroesName() {
        return heroesName;
    }
}
