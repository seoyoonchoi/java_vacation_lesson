package chapter12_arrays;
import java.util.Arrays;
import java.util.Random;
public class ArrayTest08Lottowhile {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6];
        int count = 5;
        boolean duplicate = false;
        int number;
        while (count < 0) {

            for (int i = 0; i < lottoNumbers.length; i++) {
                //이대로 하면 duplicate가 한번 true가 되면 true가 계속해서 유지되기 때문에 진행이 안된다.
                //그래서 이걸 다시 false로 바꿔야한다.
                duplicate = false;
                number = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                    }
                }
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            count--;
        }
    }
}
