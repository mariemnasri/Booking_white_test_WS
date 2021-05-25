

package de.tekup.whitetest.soap.ws.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "id",
    "name",
    "address"
})
public class Student {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Student.Address address;


	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	/**
     * Obtenir la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définir la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtenir la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définir la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtenir la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link Student.Address }
     *     
     */
    public Student.Address getAddress() {
        return address;
    }

    /**
     * Définir la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link Student.Address }
     *     
     */
    public void setAddress(Student.Address value) {
        this.address = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="poste-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "street",
        "city",
        "posteCode"
    })
    public static class Address {

        @XmlElement(required = true)
        protected String street;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(name = "poste-code", required = true)
        protected String posteCode;

        /**
         * Obtenir la valeur de la propriété street.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreet() {
            return street;
        }

        /**
         * Définir la valeur de la propriété street.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreet(String value) {
            this.street = value;
        }

        /**
         * Obtenir la valeur de la propriété city.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Définir la valeur de la propriété city.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Obtenir la valeur de la propriété posteCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosteCode() {
            return posteCode;
        }

        /**
         * Définir la valeur de la propriété posteCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosteCode(String value) {
            this.posteCode = value;
        }

    }

}
