/*
 * XML Type:  ClassType
 * Namespace: 
 * Java type: noNamespace.ClassType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML ClassType(@).
 *
 * This is a complex type.
 */
public class ClassTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClassType {
    private static final long serialVersionUID = 1L;

    public ClassTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "roomNumber"),
        new QName("", "students"),
        new QName("", "subjects"),
    };


    /**
     * Gets the "roomNumber" element
     */
    @Override
    public java.lang.String getRoomNumber() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "roomNumber" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetRoomNumber() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "roomNumber" element
     */
    @Override
    public void setRoomNumber(java.lang.String roomNumber) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(roomNumber);
        }
    }

    /**
     * Sets (as xml) the "roomNumber" element
     */
    @Override
    public void xsetRoomNumber(org.apache.xmlbeans.XmlString roomNumber) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(roomNumber);
        }
    }

    /**
     * Gets the "students" element
     */
    @Override
    public noNamespace.ClassType.Students getStudents() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.ClassType.Students target = null;
            target = (noNamespace.ClassType.Students)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "students" element
     */
    @Override
    public void setStudents(noNamespace.ClassType.Students students) {
        generatedSetterHelperImpl(students, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "students" element
     */
    @Override
    public noNamespace.ClassType.Students addNewStudents() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.ClassType.Students target = null;
            target = (noNamespace.ClassType.Students)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "subjects" element
     */
    @Override
    public noNamespace.ClassType.Subjects getSubjects() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.ClassType.Subjects target = null;
            target = (noNamespace.ClassType.Subjects)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "subjects" element
     */
    @Override
    public void setSubjects(noNamespace.ClassType.Subjects subjects) {
        generatedSetterHelperImpl(subjects, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "subjects" element
     */
    @Override
    public noNamespace.ClassType.Subjects addNewSubjects() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.ClassType.Subjects target = null;
            target = (noNamespace.ClassType.Subjects)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }
    /**
     * An XML students(@).
     *
     * This is a complex type.
     */
    public static class StudentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClassType.Students {
        private static final long serialVersionUID = 1L;

        public StudentsImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "Student"),
        };


        /**
         * Gets a List of "Student" elements
         */
        @Override
        public java.util.List<noNamespace.StudentType> getStudentList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getStudentArray,
                    this::setStudentArray,
                    this::insertNewStudent,
                    this::removeStudent,
                    this::sizeOfStudentArray
                );
            }
        }

        /**
         * Gets array of all "Student" elements
         */
        @Override
        public noNamespace.StudentType[] getStudentArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new noNamespace.StudentType[0]);
        }

        /**
         * Gets ith "Student" element
         */
        @Override
        public noNamespace.StudentType getStudentArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.StudentType target = null;
                target = (noNamespace.StudentType)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "Student" element
         */
        @Override
        public int sizeOfStudentArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "Student" element  WARNING: This method is not atomicaly synchronized.
         */
        @Override
        public void setStudentArray(noNamespace.StudentType[] studentArray) {
            check_orphaned();
            arraySetterHelper(studentArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "Student" element
         */
        @Override
        public void setStudentArray(int i, noNamespace.StudentType student) {
            generatedSetterHelperImpl(student, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "Student" element
         */
        @Override
        public noNamespace.StudentType insertNewStudent(int i) {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.StudentType target = null;
                target = (noNamespace.StudentType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "Student" element
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

        /**
         * Removes the ith "Student" element
         */
        @Override
        public void removeStudent(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
    }
    /**
     * An XML subjects(@).
     *
     * This is a complex type.
     */
    public static class SubjectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClassType.Subjects {
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
