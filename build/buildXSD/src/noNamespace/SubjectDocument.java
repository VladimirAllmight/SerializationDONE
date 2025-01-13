/*
 * An XML document type.
 * Localname: Subject
 * Namespace: 
 * Java type: noNamespace.SubjectDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Subject(@) element.
 *
 * This is a complex type.
 */
public interface SubjectDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.SubjectDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "subject1a73doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Subject" element
     */
    noNamespace.SubjectType getSubject();

    /**
     * Sets the "Subject" element
     */
    void setSubject(noNamespace.SubjectType subject);

    /**
     * Appends and returns a new empty "Subject" element
     */
    noNamespace.SubjectType addNewSubject();
}
