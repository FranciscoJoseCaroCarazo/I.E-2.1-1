//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.07 a las 12:35:17 PM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Datoscentro_QNAME = new QName("", "datoscentro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoDatoscentro }
     * 
     */
    public TipoDatoscentro createTipoDatoscentro() {
        return new TipoDatoscentro();
    }

    /**
     * Create an instance of {@link TipoProfesor }
     * 
     */
    public TipoProfesor createTipoProfesor() {
        return new TipoProfesor();
    }

    /**
     * Create an instance of {@link TipoProfesores }
     * 
     */
    public TipoProfesores createTipoProfesores() {
        return new TipoProfesores();
    }

    /**
     * Create an instance of {@link TipoCentro }
     * 
     */
    public TipoCentro createTipoCentro() {
        return new TipoCentro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDatoscentro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datoscentro")
    public JAXBElement<TipoDatoscentro> createDatoscentro(TipoDatoscentro value) {
        return new JAXBElement<TipoDatoscentro>(_Datoscentro_QNAME, TipoDatoscentro.class, null, value);
    }

}
