public class Pistol2 extends Weapon{
    private final int clip; // ammo limit


    public Pistol2(int ammo, int clip){
        // if (ammo < 0) throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        // if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        // if (ammo > clip) throw new IllegalArgumentException("Количество патронов не может быть больше лимита магазина");
        // this.ammo = ammo;
        // this.clip = clip;

        super(Math.min(ammo, clip));
        if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        if (ammo > clip) throw new IllegalArgumentException("Количество патронов не может быть больше лимита магазина");
        this.clip = clip;
    }
    public Pistol2(int clip){
        // if (clip < 1) throw new IllegalArgumentException("Лимит магазина должен быть натуральным числом");
        // this.ammo = 0;
        // this.clip = clip;

        this(0, clip);
    }

    // public int getAmmo(){
    //     return ammo;
    // }
    public int getClip(){
        return clip;
    }
    // public boolean isLoaded(){
    //     return ammo > 0;
    // }

    public int load(int loadingAmmo){
        if (loadingAmmo + clip < 0) throw new IllegalArgumentException("Количество патронов в пистолете не может быть отрицательным");

        int availableSpace = clip - ammo();
        int loadedAmmo = Math.min(loadingAmmo, availableSpace);

        super.load(loadedAmmo);
        return loadingAmmo - loadedAmmo;
        // if (loadingAmmo + clip > clip){
        //     ammo = clip;
        //     return ammo + loadingAmmo - clip;
        // };
        // ammo += loadingAmmo;
        // return 0;
    }
    public int unload(){
        // int tempAmmo = ammo;
        // ammo = 0;
        // return tempAmmo;

        int currentAmmo = ammo();
        super.load(0);
        return currentAmmo;
    }

    public void shoot(){
        // if (ammo > 0){
        //     System.out.println("Бах!");
        //     ammo--;
        // }
        // else{
        //     System.out.println("Клац!");
        // }

        if (ammo() > 0){
            System.out.println("Бах!");
            getAmmo();
        }
        else {
            System.out.println("Клац!");
        }

    }


}