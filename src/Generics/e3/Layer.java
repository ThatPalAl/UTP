package Generics.e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(Arrays.asList((layerElements)));
    }

    public void addElements(T... elemts){
        layerElements.addAll(Arrays.asList(elemts));
    }

    public void renderLayer(){
        for(T element: layerElements){
            element.render();
        }
    }
}
