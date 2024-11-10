public class Pistol2 extends Weapon{
    private final int clip; // ammo limit


    public Pistol2(int ammo, int clip){
        super(ammo);
        // if (ammo < 0) throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        if (ammo > clip) throw new IllegalArgumentException("Количество патронов не может быть больше лимита магазина");
        // this.ammo = ammo;
        this.clip = clip;
    }
    public Pistol2(int clip){
        super(0);
        if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        // this.ammo = 0;
        this.clip = clip;
    }

    // public int getAmmo(){
    //     return ammo;
    // }
    public int getClip(){
        return clip;
    }
    public boolean isLoaded(){
        return ammo() > 0;
    }

    public int load(int loadingAmmo){
        if (loadingAmmo + clip < 0) throw new IllegalArgumentException("Количество патронов в пистолете не может быть отрицательным");
        if (loadingAmmo + ammo() > clip){
            // ammo = clip;
            super.load(clip);
            return ammo() + loadingAmmo - clip;
        };
        // ammo += loadingAmmo;
        super.load(loadingAmmo + ammo());
        return 0;
    }
    public int unload(){
        return super.load(0);
    }

    public void shoot(){
        if (isLoaded()){
            System.out.println("Бах!");
            getAmmo();
        }
        else {
            System.out.println("Клац!");
        }
    }
}