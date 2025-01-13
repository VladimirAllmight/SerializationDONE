/*
 * An XML document type.
 * Localname: Subject
 * Namespace: 
 * Java type: noNamespace.SubjectDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one Subject(@) element.
 *
 * This is a complex type.
 */
public class SubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubjectDocument {
    private static final long serialVersionUID = 1L;

    public SubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Subject"),
    };


    /**
     * Gets the "Subject" element
     */
    @Override
    public noNamespace.SubjectType getSubject() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.SubjectType target = null;
            target = (noNamespace.SubjectType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Subject" element
     */
    @Override
    public void setSubject(noNamespace.SubjectType subject) {
        generatedSetterHelperImpl(subject, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Subject" element
     */
    @Override
    public noNamespace.SubjectType addNewSubject() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.SubjectType target = null;
            target = (noNamespace.SubjectType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
