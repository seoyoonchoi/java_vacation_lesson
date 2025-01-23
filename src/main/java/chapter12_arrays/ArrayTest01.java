package chapter12_arrays;
/*
2차원 배열 선언 시 열의 크기는 지정하지 않아도 되지만 행의 크기는 항상 지정해야 한다.
int[][] arr1 = new int[크기][]
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int ahn_math;
        int choi_math;
        int kim_math;

        String strExample1 = "안녕하세요";
        String strExample2 = new String("the whether is hot");
        String strExample3 = new String("안녕하세요");
        System.out.println(strExample1);
        System.out.println(strExample2);

        int[] arr2 = {1,2,3,4,5}; //각 숫자를 element라고 함 (한국어로는 요소라고 씀)
        System.out.println(arr2);

        if(strExample1 == "안녕하세요"){
            System.out.println("실행");//스트링은 주소값이 중요하다
        }

        if(strExample1.equals(strExample3)){ //strExample1 == strExamle3 같은 표현은 주소지를 확인하기 때문에 데이터값을 비교하기 위해 equals를 쓴다.
            System.out.println("실행2");
        }



        int[] thisAges = {20,29,30,38};
        System.out.println(thisAges[1]);
        System.out.println(thisAges[2]);
        System.out.println(thisAges[3]);
        System.out.println(thisAges[0]);

        for(int i = 0;i<4;i++){
            System.out.println(thisAges[i]);
        }

        for(int i = 0;i<thisAges.length;i++){
            System.out.println(thisAges[i]);
        }


















    }
}
