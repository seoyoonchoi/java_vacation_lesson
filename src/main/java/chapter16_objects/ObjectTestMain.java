package chapter16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest obj = new ObjectTest();
        obj.setName("최서윤");
        obj.setAddress("연제구");
        obj.displayInfo();
        System.out.println(obj.displayInfo2());
    }

}
