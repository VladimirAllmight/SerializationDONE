/*
 * An XML document type.
 * Localname: Class
 * Namespace: 
 * Java type: noNamespace.ClassDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Class(@) element.
 *
 * This is a complex type.
 */
public interface ClassDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.ClassDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s959808EBD3C5F6D8A5064C591DD3CA5F.TypeSystemHolder.typeSystem, "class147fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Class" element
     */
    noNamespace.ClassType getClass1();

    /**
     * Sets the "Class" element
     */
    void setClass1(noNamespace.ClassType class1);

    /**
     * Appends and returns a new empty "Class" element
     */
    noNamespace.ClassType addNewClass1();
}
