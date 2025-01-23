package chapter16_objects.teachers;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //hashcode 랑 equals가 묶여 있는 이유는 equals를 판별하는 기준이 hashcode이기 때문이다.

    @Override
    public int hashCode() {
        return Objects.hash(name,schoolName);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null||getClass() != obj.getClass()) {
            return false;
        }else{
            Teacher teacher = (Teacher) obj;
            return Objects.equals(name, teacher.name)&Objects.equals(schoolName,teacher.schoolName);
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
