/*
 * XML Type:  StudentType
 * Namespace: 
 * Java type: noNamespace.StudentType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StudentType(@).
 *
 * This is a complex type.
 */
public interface StudentType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.StudentType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "studenttype21ectype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "name" element
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Gets the "subjects" element
     */
    noNamespace.StudentType.Subjects getSubjects();

    /**
     * Sets the "subjects" element
     */
    void setSubjects(noNamespace.StudentType.Subjects subjects);

    /**
     * Appends and returns a new empty "subjects" element
     */
    noNamespace.StudentType.Subjects addNewSubjects();

    /**
     * An XML subjects(@).
     *
     * This is a complex type.
     */
    public interface Subjects extends org.apache.xmlbeans.XmlObject {
        ElementFactory<noNamespace.StudentType.Subjects> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "subjectsa7ffelemtype");
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
