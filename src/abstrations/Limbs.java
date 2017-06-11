package abstrations;

import java.util.Arrays;

public class Limbs {
    public Limb[][] limb;

    public Limbs(int pairs, int segements, int thickness, Coating coating, int...length) {
        this.limb = new Limb[pairs][2];
        for (int i = 0; i < pairs; i++) {
            this.limb[i][0] = new Limb(segements, thickness, coating, length);
            this.limb[i][1] = new Limb(segements, thickness, coating, length);
        }
    }
//    public Limb(int length, int segements, int thickness, Coating coating) {
//        this.length = length;
//        this.segements = segements;
//        this.thickness = thickness;
//        this.coating = coating;
//    }

//    public Limbs(byte s, int b, int... g){
//        System.out.println("!");
//    }

}
