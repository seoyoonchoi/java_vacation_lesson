package chapter12_arrays;

public class ArrayTest06_enhanced_for {
    public static void main(String[] args) {
        int[] mathScores = {100,90,80,70};
        for(int mathScore : mathScores){
            System.out.print(mathScore + " ");
        }

        String[] names = {"허수지","정승민","장소정"};
        for(String name : names){
            System.out.println(name + " ");
        }
    }
}
