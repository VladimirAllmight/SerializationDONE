/*
 * An XML document type.
 * Localname: Class
 * Namespace: 
 * Java type: noNamespace.ClassDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one Class(@) element.
 *
 * This is a complex type.
 */
public class ClassDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClassDocument {
    private static final long serialVersionUID = 1L;

    public ClassDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Class"),
    };


    /**
     * Gets the "Class" element
     */
    @Override
    public noNamespace.ClassType getClass1() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.ClassType target = null;
            target = (noNamespace.ClassType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Class" element
     */
    @Override
    public void setClass1(noNamespace.ClassType class1) {
        generatedSetterHelperImpl(class1, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Class" element
     */
    @Override
    public noNamespace.ClassType addNewClass1() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.ClassType target = null;
            target = (noNamespace.ClassType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
