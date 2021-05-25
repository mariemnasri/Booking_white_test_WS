package de.tekup.whitetest.soap.ws.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentId",
    "examCode"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    protected int studentId;
    @XmlElement(required = true)
    protected String examCode;

    /**
     * Obtenir la valeur de la propriété studentId.
     * 
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Définir la valeur de la propriété studentId.
     * 
     */
    public void setStudentId(int value) {
        this.studentId = value;
    }

    /**
     * Obtenir la valeur de la propriété examCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamCode() {
        return examCode;
    }

    /**
     * Définir la valeur de la propriété examCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamCode(String value) {
        this.examCode = value;
    }

}
