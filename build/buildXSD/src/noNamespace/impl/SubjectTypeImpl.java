/*
 * XML Type:  SubjectType
 * Namespace: 
 * Java type: noNamespace.SubjectType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML SubjectType(@).
 *
 * This is a complex type.
 */
public class SubjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubjectType {
    private static final long serialVersionUID = 1L;

    public SubjectTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "subjectName"),
        new QName("", "score"),
    };


    /**
     * Gets the "subjectName" element
     */
    @Override
    public java.lang.String getSubjectName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "subjectName" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSubjectName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "subjectName" element
     */
    @Override
    public void setSubjectName(java.lang.String subjectName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(subjectName);
        }
    }

    /**
     * Sets (as xml) the "subjectName" element
     */
    @Override
    public void xsetSubjectName(org.apache.xmlbeans.XmlString subjectName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(subjectName);
        }
    }

    /**
     * Gets the "score" element
     */
    @Override
    public byte getScore() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? 0 : target.getByteValue();
        }
    }

    /**
     * Gets (as xml) the "score" element
     */
    @Override
    public org.apache.xmlbeans.XmlByte xgetScore() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "score" element
     */
    @Override
    public void setScore(byte score) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setByteValue(score);
        }
    }

    /**
     * Sets (as xml) the "score" element
     */
    @Override
    public void xsetScore(org.apache.xmlbeans.XmlByte score) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(score);
        }
    }
}
