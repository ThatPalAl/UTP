package Generics.e2;


public class Main {
    public static void main(String[] args) {
        String[] words = {"lol", "wtf", "dzbanowanie", "suss"};
        GenArr<String> genArr = new GenArr<>(words);
        System.out.println(genArr.getMinMax().getMax());
        System.out.println(genArr.getMinMax().getMin());

        Integer[] nums = {10, 15, 2, 22, 7, 300};
        GenArr<Integer> genNums = new GenArr<>(nums);
        System.out.println(genNums.getMinMax().getMax());
        System.out.println(genNums.getMinMax().getMin());

    }
}
