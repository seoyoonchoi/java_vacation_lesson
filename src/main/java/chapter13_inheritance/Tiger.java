package chapter13_inheritance;

public class Tiger extends Animal{
    //클래스명 extends 부모클래스는 명령어를 통해 상속가능

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName); //super keyword(부모 클래스에서 확장한 개념으로서는 바로 alt insert 하면 부모꺼 다 갖고와서 생성자 생성할 수 있다.
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }
//Animal 클래스에서 정의한 메서드를 오버라이딩 했습니다
    //Override의 키워드는 재정의이다

    //@override가 붙어있다면 해당 메서드는 상속 받은 메서드를 의미함ㅁ
    @Override
    public void move() {
        super.move();//super()의 경우는 생성자에 해당하고 super.메서드명의 경우 부모 클래스의 메서드를 호출한다,
        //재정의하는 영역
        System.out.println("네 발로 걷습니다");
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }
}
