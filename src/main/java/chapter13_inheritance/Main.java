package chapter13_inheritance;
/*
오버라이딩은 재정의라는 키워드가 들어간다는 것이다.
오버로딩은 메서드 명은 동일하지만 매개변수를 다르게 작성하는 것이다.
 */
public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal("바둑이");
//        Animal animal3 = new Animal(1);
//        Animal animal4 = new Animal("나비",1);
//
//        Tiger tiger1 = new Tiger("티거",4);
//        tiger1.setAnimalAge(3);//부모클래스의 메서드 사용 -> 부모클래스와 효과 동일
//        tiger1.move();//재정의된 부모 클래스의 메서드

        Human human1 = new Human("최서윤",28);
        human1.move();
        System.out.println("제 이름은 "+human1.getAnimalName()+"이고, 나이는 "+human1.getAnimalAge()+" 살 입니다.");
        System.out.println(human1.read("멘토자바")+ " 책을 읽고 있습니다.");


    }
}
