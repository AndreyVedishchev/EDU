package abstrations;

public class Limbs {
    private int cnt;
    private int lng;

    public Limbs(int lng) { //для паука
        this.lng = lng;
        this.cnt = 8;
    }

    public Limbs(int cnt, int lng) { //для остальных
        this.cnt = cnt;
        this.lng = lng;
    }
}
