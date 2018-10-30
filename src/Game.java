import java.util.Random;

public class Game {
    // Initialize modstandere
    Plant plante = new Plant();
    Zombie zombie = new Zombie();
    ConeZombie cZombie = new ConeZombie();
    PeaShooterPlant pPlante = new PeaShooterPlant();
    MiniGunPlant mPlant = new MiniGunPlant();
    BucketZombie bZombie = new BucketZombie();


    public void start(){
        Random random = new Random();

        boolean zombieHit = random.nextBoolean(); // Random boolean

        while(zombie.getHealth() != 0 || plante.getHealth() != 0){
            if (zombieHit){
                zombie.attack(plante);
            }
            else{
                plante.attack(zombie);
            }
            zombieHit = !zombieHit;
        }

    }

    public void start2(){
        Random random = new Random();

        boolean zombieHit = random.nextBoolean(); // Random boolean

        while(cZombie.getHealth() != 0 || pPlante.getHealth() != 0){
            if (zombieHit){
                cZombie.attack(pPlante);
            }
            else{
                pPlante.attack(cZombie);
            }
            zombieHit = !zombieHit;
        }

    }

    public void start3(){
        Random random = new Random();

        boolean zombieHit = random.nextBoolean(); // Random boolean

        while(bZombie.getHealth() != 0 || mPlant.getHealth() != 0){
            if (zombieHit){
                bZombie.attack(mPlant);
            }
            else{
                mPlant.attack(bZombie);
            }
            zombieHit = !zombieHit;
        }

    }
}
