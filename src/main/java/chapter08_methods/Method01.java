package chapter08_methods;

import java.util.Scanner;

/*
    Method란? : Java에서는 함수 개념과 동일함

    Method : 일련의 동작을 묶어서 정의한 것. 입력값과 출력값이 존재(optional)

    함수(function)와 메서드(method)가 동일한 개념이라면 왜 용어를 분리하는가?
        : 클래스 내부에 함수를 정의하게 되면 이를 메서드라고 함.
            Java의 경우는 모든 함수들이 특정 클래스에 종속돼있기 때문에 전부 다 메서드에 해당합니다.
            즉 다른 언어(ex) python)를 배우게 된다면 함수의 호출 방식과 메서드의 호출 방식 상에서의 차이가
            있어 해당 수업에서는 method로 용어를 통일할겁니다.
            혹시 제가 함수라고 이야기하면 그냥 메서드라고 알아들으시면 됩니다.

        호출 형식
        클래스명.메서드명()
        객체명.메서드명()          -> scanner.nextInt()    : 즉 저희는 몇몇 부분에서 이미 method를 호출해왔었습니다.

        mehtod의 정의 : 특정한 메서드를 클래스 내에 만드는 것
        method의 호출(call) : main method나 혹은 클래스의 method 내에서 클래스명.메서드명() 혹은,
            객체명.메서드명()을 통해서 메서드를 호출할 수 있음. -> 호출 = 실행

        1. Java에서의 메서드
            1. method : 특정 작업을 수행하는 코드 블럭을 정의하는 방법

                예를 들어, '사진을 찍는다'라는 행위에 대해서 생각해보면
                1) 주머니에서 폰을 꺼내고,
                2) 잠금화면을 풀고,
                3) 카메라를 켜고,
                4) 사진을 찍고자 하는 대상에 폰을 조준하고,
                5) 셔터를 누른다.

                컴퓨터는 시키는 대로만 하기 때문에 사진을 찍기 위해서는 이상의 1) - 5)까지의 명령어를
                입력해줘야만 합니다. 하지만 '사진을 찍는다'라는 메서드 내에 1) - 5) 명령어들을 미리 입력
                (메서드 정의)해놓고 나서, '사진을 찍는다'는 명령어를 실행(메서드 호출)시키면
                자동으로 1) - 5)까지의 명령을 순서대로 수행함
                    -> 즉 메서드란 순차적으로 이루어지는 명령어들을 모아둔 것.

            2. 메서드 관련 용어 정리
                1) 메서드 정의(define) : 사용자가 메서드를 새로 만드는 것을 의미
                2) 인수(argument) : 사용자 메서드에 전달할 입력(input)
                3) 매개변수(parameter) : 인수를 받아서 저장하는 변수
                4) 반환값/출력값/리턴값(return) : 메서드의 출력(output)
                5) 메서드 호출(call) : 만들어진(혹은 미리 정의된) 메서드를 실제로 사용하는 것

 */
public class Method01 {
    // 여기에 작성해볼 예정

    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ]
    public static void call2(String str) { //정의 단계에서 () 내에 있는 것이 매개변수(파라미터)
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + str);
    }

    // 3. [ x | o ]
    public static String call3() { // return 값의 자료형이 명시
        System.out.println("[ x | o ]");

        String result = "";

        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < i + 1 ; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int day) {  // 매개변수도 있고, 결과값의 자료형이 String
        System.out.println("[ o | o ]");

        return year + "년 " + month + "월 " + day + "일";
    }

    public static void main(String[] args) {

        call1();
        call2("오늘 하루도 힘내요😃");   // 호출 단계에서 ()내에 입력하는 것을 argument
        call3();                            // 이렇게 했을 때 콘솔창에 아무것도 없습니다.

        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        System.out.println(scanner.nextLine()); // 예외 사례
//        String name = scanner.nextLine();       // 배웠을 때의 형태
//        System.out.println(name);

        // 여러분들이 method를 사용함에 있어서 꼭 알아야 할 점 :
        // 어떤 method의 결과값(return)은 다른 method의 argument로 작용할 수 있습니다.
        String todayFeeling = scanner.nextLine();   // .nextLine()의 결과값이 todayFeeling이라는 변수에 저장
        call2(todayFeeling);    // todayFeeling은 call2()라는 메서드의 argument로 사용이 되었다는 점
        // 이런식으로 하나의 메서드의 결과값이 다음 메서드의 argument로 이어지고, 또 그 결과값이 그 다음
        // 메서드의 argument로서 사용되는 메서드들의 흐름을 만들어주는 프로그래밍 방식을
        // 함수형 프로그래밍(Functional Programming)이라고 함.




//        System.out.println(name);
        // call3();의 출력값을 확인을 하기 위해서는 sout이 포함돼야 함.
        System.out.println(call3());
        call4(2025, 01, 03);
        System.out.println(call4(2025, 1, 3));

        String today = call4(2025, 1, 3);
        System.out.println(today);
        String birthday = call4(1988, 7, 9);
        System.out.println(birthday);
    }
}
