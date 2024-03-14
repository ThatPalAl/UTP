package Generics.e3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Park> parkList = new ArrayList<>();
        Park lazienkiPark = new Park("Lazienki", "-15.03, 12.345");
        Park narodowyPark = new Park("Narodowy", "-19.742, 98.76547");
        Park kabackiPark = new Park("Kabacki", "46.572138,-127.386");
        parkList.add(lazienkiPark);
        parkList.add(narodowyPark);
        parkList.add(kabackiPark);

        Park[] parks = {lazienkiPark, narodowyPark, kabackiPark};

//        Layer<Park> parkLayer = new Layer<>(parkList);
        Layer<Park> parkLayer = new Layer<>(parks);
        parkLayer.renderLayer();

        River odra = new River("Odra", "-53.12893, -12.12389", "12.2183756, -65.128397", "83.129837, 98.1723");
        River wisla = new River("Wisla", "-213.19283, -46.129821", "84.102983, -78.921837", "36.921378, 123.2134");

        River[] rivers = {odra, wisla};
        Layer<River> riverLayer = new Layer<>(rivers);
        riverLayer.renderLayer();


    }
}
