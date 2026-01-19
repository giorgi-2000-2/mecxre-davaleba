package org.example;
import net.datafaker.Faker;
import java.util.Objects;

    public class Student {

        private String studentId;
        private String name;

        public Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public String getStudentId() {
            return studentId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(studentId, student.studentId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId);
        }

        @Override
        public String toString() {
            return "Student{id='" + studentId + "', name='" + name + "'}";
        }
    }

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String id = faker.idNumber().valid();
        Student student1 = new Student(id, faker.name().fullName());


        Student student2 = new Student(id, faker.name().fullName());

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("Are students equal? " + student1.equals(student2));
    }
}

