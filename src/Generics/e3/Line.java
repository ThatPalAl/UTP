package Generics.e3;

import java.util.Arrays;

public abstract class Line implements Mappable {

    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for(String s : locations){
            this.locations[index++] = Mappable.stringToLatLon(s);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }
}
