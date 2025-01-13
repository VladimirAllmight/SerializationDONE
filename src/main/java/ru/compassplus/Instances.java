package ru.compassplus;

import noNamespace.*;
import org.apache.xmlbeans.XmlOptions;
import java.io.*;

public class Instances {
    public static void main(String[] args) {
        try {
            // Создаем корневой элемент ClassDocument
            ClassDocument classDoc = ClassDocument.Factory.newInstance();

            // Создаем элемент Class
            ClassType classType = classDoc.addNewClass1();
            classType.setRoomNumber("101");

            // Добавляем студентов
            ClassType.Students students = classType.addNewStudents();
            StudentType student1 = students.addNewStudent();
            student1.setName("Alice");
            StudentType.Subjects student1Subjects = student1.addNewSubjects();
            SubjectType subject1 = student1Subjects.addNewSubject();
            subject1.setSubjectName("Math");
            subject1.setScore((byte) 95);
            SubjectType subject2 = student1Subjects.addNewSubject();
            subject2.setSubjectName("English");
            subject2.setScore((byte) 88);

            StudentType student2 = students.addNewStudent();
            student2.setName("Bob");
            StudentType.Subjects student2Subjects = student2.addNewSubjects();
            SubjectType subject3 = student2Subjects.addNewSubject();
            subject3.setSubjectName("Science");
            subject3.setScore((byte) 92);
            SubjectType subject4 = student2Subjects.addNewSubject();
            subject4.setSubjectName("History");
            subject4.setScore((byte) 85);

            // Добавляем предметы в класс
            ClassType.Subjects classSubjects = classType.addNewSubjects();
            SubjectType classSubject1 = classSubjects.addNewSubject();
            classSubject1.setSubjectName("Math");
            classSubject1.setScore((byte) 100);
            SubjectType classSubject2 = classSubjects.addNewSubject();
            classSubject2.setSubjectName("Science");
            classSubject2.setScore((byte) 98);

            // Сохраняем XML в строку
            StringWriter writer = new StringWriter();
            XmlOptions options = new XmlOptions().setSavePrettyPrint();
            classDoc.save(writer, options);
            String xmlString = writer.toString();
            System.out.println("Saved XML:");
            System.out.println(xmlString);

            // Читаем XML обратно
            StringReader reader = new StringReader(xmlString);
            ClassDocument parsedDoc = ClassDocument.Factory.parse(reader);

            // Восстанавливаем данные
            ClassType parsedClass = parsedDoc.getClass1();
            System.out.println("\nThe restored object:");
            System.out.println("Room: " + parsedClass.getRoomNumber());
            System.out.println("Students:");
            for (StudentType student : parsedClass.getStudents().getStudentArray()) {
                System.out.println("  Name: " + student.getName());
                System.out.println("  Subjects:");
                for (SubjectType subj : student.getSubjects().getSubjectArray()) {
                    System.out.println("    " + subj.getSubjectName() + ": " + subj.getScore());
                }
            }
            System.out.println("Class subjects:");
            for (SubjectType subj : parsedClass.getSubjects().getSubjectArray()) {
                System.out.println("  " + subj.getSubjectName() + ": " + subj.getScore());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
