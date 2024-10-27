public class Pistol {
    private int ammo;

    public Pistol(int ammo){
        this.ammo = ammo;

    }
    public Pistol(){
        this.ammo = 5;
    }

    public void makeShoot(){
        if (ammo > 0){
            System.out.println("Бах!");
            ammo--;
        }
        else{
            System.out.println("Клац!");
        }
    }
}
