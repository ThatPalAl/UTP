package LambdaExpressions.e8;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class IFuncUsage implements IFunc {
    public static void main(String[] args) {
        ItemGenerator itg = new ItemGenerator("ListZakupow.txt");
        List<Item> list = IFunc.generate(7, Item::new);
        Predicate<Item> chleb = e -> e.toString().equals("Chleb");
        Predicate<Item> mleko = e -> e.toString().equals("mleko");
        Predicate<Item> drogi = e -> e.getPrice() > 3;
        List<Number> numbers = new LinkedList<>();
        numbers.add(12);


        List<Item> out = IFunc.findAll(list, chleb.or(mleko));
        System.out.println("Chleb albo mleko");
        for(Item e : out){
            System.out.println(e);
        }
        out = IFunc.findAll(list, chleb.negate());
        System.out.println("Nie chleb");
        for(Item e : out){
            System.out.println(e);
        }
        out = IFunc.findAll(list, chleb.and(drogi));
        System.out.println("Drogi chleb");
        for(Item e : out){
            System.out.println(e);
        }


    }
}
