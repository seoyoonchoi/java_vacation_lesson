package chapter16_objects.students;

import org.w3c.dom.ls.LSOutput;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수", 20250001);
        Student student2 = new Student("최서윤", 20250002);
        System.out.println(student1);
        System.out.println(student2);
    }
}
