package chapter16_objects.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("꽁","욘");
        Teacher teacher2 = new Teacher("꽁","욘");

        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        System.out.println(tClass.getSimpleName());
        System.out.println(teacher1);

        Field[] fields = tClass.getDeclaredFields();
        for(int i = 0;i<fields.length;i++){
            System.out.println("필드명 출력"+fields[i].getName());
            System.out.println(fields[i].getType());//패키지명+클래스명 출력
            System.out.println(fields[i].getType().getSimpleName());//클래스명만 출력
            //위의 것들은 보통 디버깅을 할 때 사용한다.

        }

        for(Field field : fields){
            System.out.println(field.getName());//필드명 출력
            System.out.println(field.getType());//퍀지명 클래스명 철력
            System.out.println(field.getType().getSimpleName());
        }

        //클래스의 모든 메서드 정보를 출력하는 반복문
        Method[] methods = tClass.getDeclaredMethods();
        for(int i = 0; i<methods.length;i++){
            System.out.println("메서드명 출력 : "+methods[i].getName());
            System.out.println("return type 출력");
        }

    }
}
