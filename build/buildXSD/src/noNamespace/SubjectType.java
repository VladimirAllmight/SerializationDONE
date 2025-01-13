/*
 * XML Type:  SubjectType
 * Namespace: 
 * Java type: noNamespace.SubjectType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubjectType(@).
 *
 * This is a complex type.
 */
public interface SubjectType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.SubjectType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "subjecttype145dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "subjectName" element
     */
    java.lang.String getSubjectName();

    /**
     * Gets (as xml) the "subjectName" element
     */
    org.apache.xmlbeans.XmlString xgetSubjectName();

    /**
     * Sets the "subjectName" element
     */
    void setSubjectName(java.lang.String subjectName);

    /**
     * Sets (as xml) the "subjectName" element
     */
    void xsetSubjectName(org.apache.xmlbeans.XmlString subjectName);

    /**
     * Gets the "score" element
     */
    byte getScore();

    /**
     * Gets (as xml) the "score" element
     */
    org.apache.xmlbeans.XmlByte xgetScore();

    /**
     * Sets the "score" element
     */
    void setScore(byte score);

    /**
     * Sets (as xml) the "score" element
     */
    void xsetScore(org.apache.xmlbeans.XmlByte score);
}
