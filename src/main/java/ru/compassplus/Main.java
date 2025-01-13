package ru.compassplus;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private LinkedList<Subject> subjects;

    public Student(String name, LinkedList<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', subjects=" + subjects + "}";
    }
}

class Subject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String subjectName;
    private byte score;

    public Subject(String subjectName, byte score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject{subjectName='" + subjectName + "', score=" + score + "}";
    }
}

class Class implements Serializable {
    private static final long serialVersionUID = 1L;
    private String roomNumber;
    private List<Student> students;
    private List<Subject> subjects;

    public Class(String roomNumber, List<Student> students, List<Subject> subjects) {
        this.roomNumber = roomNumber;
        this.students = students;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Class{roomNumber='" + roomNumber + "', students=" + students + ", subjects=" + subjects + "}";
    }
}


public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("Mathematics", (byte) 90);
        Subject science = new Subject("Science", (byte) 85);

        LinkedList<Subject> subjects1 = new LinkedList<>();
        subjects1.add(math);
        subjects1.add(science);

        Student student1 = new Student("Ivan", subjects1);

        List<Student> students = new LinkedList<>();
        students.add(student1);

        List<Subject> classSubjects = new LinkedList<>();
        classSubjects.add(math);
        classSubjects.add(science);

        Class classroom = new Class("101", students, classSubjects);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.ser"))) {
            out.writeObject(student1);
            out.writeObject(classroom);
            System.out.println("Objects have been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.ser"))) {
            Student student = (Student) in.readObject();
            Class classroom2 = (Class) in.readObject();

            System.out.println("Deserialized Student: " + student);
            System.out.println("Deserialized Class: " + classroom2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}