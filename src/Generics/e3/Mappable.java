package Generics.e3;

public interface Mappable {
    void render();
    static double[] stringToLatLon(String location){
        String[] splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lon = Double.valueOf(splits[1]);
        return new double[]{lat, lon};
    }
}
