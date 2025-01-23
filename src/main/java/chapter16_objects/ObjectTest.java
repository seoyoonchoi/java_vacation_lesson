package chapter16_objects;

/*
toString(), equals(), hashCode()
1. toString() : 객체의 문자열 표현
기본적으로 모든 클래스는 Object 클래스를 상속받으며, Object의 toStrin()메서드는 클래스 이름과 해시코드(주소지라는 표현으로 써옴)을 반환함
->이를 Override해서 재정의해서 필드를 표현하는 등 다양한 방식으로 변환시켜 사용하는 편

왜 사용하는가? 사람들이 읽기 편한 방식으로 재정의, 객체명만으로도 불러낼 수 있음
즉 객체명.toString()으로 사용하지 않고 객체명 만으로도 호출이 가능하다.

2. equals(): 객체의 동등성 표현
두 객체가 논리적으로 같은지 비교하는 메서드
기본적으로 Object 클래스의 equals 메서드는 두 객체의 참조 주소를 비교합니다
형식 : 객체명1. equals(객체명2) -> 객체명 1과 2의 참조주소가 동일한지 확인한다 즉 3혀익 문장

3. hashcode(): 객체의 고유 값
객체를 정수값(해시값)으로 반환
해시 값은 주로 해시 기반 컬렉션에서 사용된다
equals()를 override하면 hasCode()도 반드시 Override 한다.

 */

public class ObjectTest extends Object{//모든 클래스는 Object클래스를 상속받는다
    //우리가 정의한 것 말고 기존에 있는 클래스를 말한다.
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("이름 : "+this.getName());
        System.out.println("주소 : "+this.getAddress());
    }

    public String displayInfo2(){
        return "이름 : "+name+"\n주소: "+address;
    }

   //@Override
    //public String toString() {
     //   return "siz";
    //}
}
