package abstrations;

public class Limb {

    private int segements;
    private int thickness;
    private Coating coating;
    private int[] length;

    public Limb(int segements, int thickness, Coating coating, int...length) {
        this.length = length;
        this.segements = segements;
        this.thickness = thickness;
        this.coating = coating;
    }

    public int[] getLength() {
        return length;
    }
}
