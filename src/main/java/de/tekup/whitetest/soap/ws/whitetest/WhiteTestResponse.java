
package de.tekup.whitetest.soap.ws.whitetest;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student",
    "exam",
    "date"
})
@XmlRootElement(name = "WhiteTestResponse")
public class WhiteTestResponse {

    @XmlElement(required = true)
    protected Student student;
    @XmlElement(required = true)
    protected Exam exam;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Obtenir la valeur de la propriété student.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Définir la valeur de la propriété student.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudent(Student value) {
        this.student = value;
    }

    /**
     * Obtenir la valeur de la propriété exam.
     * 
     * @return
     *     possible object is
     *     {@link Exam }
     *     
     */
    public Exam getExam() {
        return exam;
    }

    /**
     * Définir la valeur de la propriété exam.
     * 
     * @param availableExams
     *     allowed object is
     *     {@link Exam }
     *     
     */
    public void setExam(List<Exam> availableExams) {
        this.exam = (Exam) availableExams;
    }

    /**
     * Obtenir la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Définir la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    public void setExam(Exam value) {
        this.exam = value;
    }

}
