/*
 * XML Type:  ClassType
 * Namespace: 
 * Java type: noNamespace.ClassType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassType(@).
 *
 * This is a complex type.
 */
public interface ClassType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.ClassType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "classtypeec69type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "roomNumber" element
     */
    java.lang.String getRoomNumber();

    /**
     * Gets (as xml) the "roomNumber" element
     */
    org.apache.xmlbeans.XmlString xgetRoomNumber();

    /**
     * Sets the "roomNumber" element
     */
    void setRoomNumber(java.lang.String roomNumber);

    /**
     * Sets (as xml) the "roomNumber" element
     */
    void xsetRoomNumber(org.apache.xmlbeans.XmlString roomNumber);

    /**
     * Gets the "students" element
     */
    noNamespace.ClassType.Students getStudents();

    /**
     * Sets the "students" element
     */
    void setStudents(noNamespace.ClassType.Students students);

    /**
     * Appends and returns a new empty "students" element
     */
    noNamespace.ClassType.Students addNewStudents();

    /**
     * Gets the "subjects" element
     */
    noNamespace.ClassType.Subjects getSubjects();

    /**
     * Sets the "subjects" element
     */
    void setSubjects(noNamespace.ClassType.Subjects subjects);

    /**
     * Appends and returns a new empty "subjects" element
     */
    noNamespace.ClassType.Subjects addNewSubjects();

    /**
     * An XML students(@).
     *
     * This is a complex type.
     */
    public interface Students extends org.apache.xmlbeans.XmlObject {
        ElementFactory<noNamespace.ClassType.Students> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "students9e8delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "Student" elements
         */
        java.util.List<noNamespace.StudentType> getStudentList();

        /**
         * Gets array of all "Student" elements
         */
        noNamespace.StudentType[] getStudentArray();

        /**
         * Gets ith "Student" element
         */
        noNamespace.StudentType getStudentArray(int i);

        /**
         * Returns number of "Student" element
         */
        int sizeOfStudentArray();

        /**
         * Sets array of all "Student" element
         */
        void setStudentArray(noNamespace.StudentType[] studentArray);

        /**
         * Sets ith "Student" element
         */
        void setStudentArray(int i, noNamespace.StudentType student);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "Student" element
         */
        noNamespace.StudentType insertNewStudent(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "Student" element
         */
        noNamespace.StudentType addNewStudent();

        /**
         * Removes the ith "Student" element
         */
        void removeStudent(int i);
    }

    /**
     * An XML subjects(@).
     *
     * This is a complex type.
     */
    public interface Subjects extends org.apache.xmlbeans.XmlObject {
        ElementFactory<noNamespace.ClassType.Subjects> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "subjectsdb3celemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "Subject" elements
         */
        java.util.List<noNamespace.SubjectType> getSubjectList();

        /**
         * Gets array of all "Subject" elements
         */
        noNamespace.SubjectType[] getSubjectArray();

        /**
         * Gets ith "Subject" element
         */
        noNamespace.SubjectType getSubjectArray(int i);

        /**
         * Returns number of "Subject" element
         */
        int sizeOfSubjectArray();

        /**
         * Sets array of all "Subject" element
         */
        void setSubjectArray(noNamespace.SubjectType[] subjectArray);

        /**
         * Sets ith "Subject" element
         */
        void setSubjectArray(int i, noNamespace.SubjectType subject);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        noNamespace.SubjectType insertNewSubject(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        noNamespace.SubjectType addNewSubject();

        /**
         * Removes the ith "Subject" element
         */
        void removeSubject(int i);
    }
}
