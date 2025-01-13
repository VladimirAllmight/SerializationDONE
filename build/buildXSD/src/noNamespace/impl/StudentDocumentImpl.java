/*
 * An XML document type.
 * Localname: Student
 * Namespace: 
 * Java type: noNamespace.StudentDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one Student(@) element.
 *
 * This is a complex type.
 */
public class StudentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StudentDocument {
    private static final long serialVersionUID = 1L;

    public StudentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Student"),
    };


    /**
     * Gets the "Student" element
     */
    @Override
    public noNamespace.StudentType getStudent() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.StudentType target = null;
            target = (noNamespace.StudentType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Student" element
     */
    @Override
    public void setStudent(noNamespace.StudentType student) {
        generatedSetterHelperImpl(student, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Student" element
     */
    @Override
    public noNamespace.StudentType addNewStudent() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.StudentType target = null;
            target = (noNamespace.StudentType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
