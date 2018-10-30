public class MiniGunPlant extends Plant {

    public void attack(Zombie zombie){
        zombie.takeDamage();
        zombie.takeDamage();
        zombie.takeDamage();
    }
}
