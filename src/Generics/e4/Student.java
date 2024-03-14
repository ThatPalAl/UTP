package Generics.e4;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        Student other = (Student) o;
        return name.compareTo(other.name);
    }
}
