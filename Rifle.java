public class Rifle extends Pistol{
    private final int rate;

    public Rifle(){
        super(30);
        this.rate = 30;
    }

    public Rifle(int clip){
        super(clip);
        int rate = clip/2;
        if (rate < 1) rate = 1;
        this.rate = rate;
    }

    public Rifle(int clip, int rate){
        super(clip);
        if (rate < 1) throw new IllegalArgumentException("Скорострельность должна быть натуральным числом");
        this.rate = rate;
    }

    public void shoot(){
        for (int i = 0; i < rate; i++){
            if (getAmmo() == 0) {
                System.out.println("Клац!");
                return;
            }
            super.makeShoot();
        }
    }

    public void shootRange(int range){
        for (int i = 0; i < range; i++){
            if (getAmmo() == 0) {
                System.out.println("Клац!");
                return;
            }
            shoot();
        }
    }
}
