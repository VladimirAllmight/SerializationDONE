/*
 * An XML document type.
 * Localname: Student
 * Namespace: 
 * Java type: noNamespace.StudentDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Student(@) element.
 *
 * This is a complex type.
 */
public interface StudentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.StudentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "student4782doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Student" element
     */
    noNamespace.StudentType getStudent();

    /**
     * Sets the "Student" element
     */
    void setStudent(noNamespace.StudentType student);

    /**
     * Appends and returns a new empty "Student" element
     */
    noNamespace.StudentType addNewStudent();
}
