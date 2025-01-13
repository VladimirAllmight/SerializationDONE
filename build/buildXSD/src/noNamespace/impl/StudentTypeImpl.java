/*
 * XML Type:  StudentType
 * Namespace: 
 * Java type: noNamespace.StudentType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML StudentType(@).
 *
 * This is a complex type.
 */
public class StudentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StudentType {
    private static final long serialVersionUID = 1L;

    public StudentTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "name"),
        new QName("", "subjects"),
    };


    /**
     * Gets the "name" element
     */
    @Override
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "name" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "name" element
     */
    @Override
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "name" element
     */
    @Override
    public void xsetName(org.apache.xmlbeans.XmlString name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(name);
        }
    }

    /**
     * Gets the "subjects" element
     */
    @Override
    public noNamespace.StudentType.Subjects getSubjects() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.StudentType.Subjects target = null;
            target = (noNamespace.StudentType.Subjects)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "subjects" element
     */
    @Override
    public void setSubjects(noNamespace.StudentType.Subjects subjects) {
        generatedSetterHelperImpl(subjects, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "subjects" element
     */
    @Override
    public noNamespace.StudentType.Subjects addNewSubjects() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.StudentType.Subjects target = null;
            target = (noNamespace.StudentType.Subjects)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
    /**
     * An XML subjects(@).
     *
     * This is a complex type.
     */
    public static class SubjectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StudentType.Subjects {
        private static final long serialVersionUID = 1L;

        public SubjectsImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "Subject"),
        };


        /**
         * Gets a List of "Subject" elements
         */
        @Override
        public java.util.List<noNamespace.SubjectType> getSubjectList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getSubjectArray,
                    this::setSubjectArray,
                    this::insertNewSubject,
                    this::removeSubject,
                    this::sizeOfSubjectArray
                );
            }
        }

        /**
         * Gets array of all "Subject" elements
         */
        @Override
        public noNamespace.SubjectType[] getSubjectArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new noNamespace.SubjectType[0]);
        }

        /**
         * Gets ith "Subject" element
         */
        @Override
        public noNamespace.SubjectType getSubjectArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.SubjectType target = null;
                target = (noNamespace.SubjectType)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "Subject" element
         */
        @Override
        public int sizeOfSubjectArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "Subject" element  WARNING: This method is not atomicaly synchronized.
         */
        @Override
        public void setSubjectArray(noNamespace.SubjectType[] subjectArray) {
            check_orphaned();
            arraySetterHelper(subjectArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "Subject" element
         */
        @Override
        public void setSubjectArray(int i, noNamespace.SubjectType subject) {
            generatedSetterHelperImpl(subject, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        @Override
        public noNamespace.SubjectType insertNewSubject(int i) {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.SubjectType target = null;
                target = (noNamespace.SubjectType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
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

        /**
         * Removes the ith "Subject" element
         */
        @Override
        public void removeSubject(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
    }
}
