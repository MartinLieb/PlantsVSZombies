public class Zombie {

    int health;
    int attack;


    public Zombie(){
        this.health = 100;
    }

    public void attack(Plant plante){
        plante.takeDamage();
    }

    public void takeDamage(){
        int randomDamage = 5 + (int)(Math.random() * ((10 - 5) + 1));
        if (this.health-randomDamage <= 0){
            this.health = 0;
            System.out.println("Plante vandt\nVICTORY");
            System.exit(0);
        }
        else {
            this.health -= randomDamage;
            System.out.println("Plant attacked zombie and the zombie now has " + this.health + " HP left");
        }
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}
