public class Pistol {
    private int ammo;
    private final int clip; // ammo limit


    public Pistol(int ammo, int clip){
        if (ammo < 0) throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        if (ammo > clip) throw new IllegalArgumentException("Количество патронов не может быть больше лимита магазина");
        this.ammo = ammo;
        this.clip = clip;
    }
    public Pistol(int clip){
        if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        this.ammo = 0;
        this.clip = clip;
    }

    public int getAmmo(){
        return ammo;
    }
    public int getClip(){
        return clip;
    }
    public boolean isLoaded(){
        return ammo > 0;
    }

    public int load(int loadingAmmo){
        if (loadingAmmo + clip < 0) throw new IllegalArgumentException("Количество патронов в пистолете не может быть отрицательным");
        if (loadingAmmo + ammo > clip){
            ammo = clip;
            return ammo + loadingAmmo - clip;
        };
        ammo += loadingAmmo;
        return 0;
    }
    public int unload(){
        int tempAmmo = ammo;
        ammo = 0;
        return tempAmmo;
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