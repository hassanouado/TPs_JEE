
package mypackage;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private static final QName _Compte_QNAME = new QName("http://ws/", "Compte");
    private static final QName _ConvertEuroToDH_QNAME = new QName("http://ws/", "convertEuroToDH");
    private static final QName _ConvertEuroToDHResponse_QNAME = new QName("http://ws/", "convertEuroToDHResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private static final QName _GetListeCompte_QNAME = new QName("http://ws/", "getListeCompte");
    private static final QName _GetListeCompteResponse_QNAME = new QName("http://ws/", "getListeCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ConvertEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDH }
     */
    public ConvertEuroToDH createConvertEuroToDH() {
        return new ConvertEuroToDH();
    }

    /**
     * Create an instance of {@link ConvertEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDHResponse }
     */
    public ConvertEuroToDHResponse createConvertEuroToDHResponse() {
        return new ConvertEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetListeCompte }
     * 
     * @return
     *     the new instance of {@link GetListeCompte }
     */
    public GetListeCompte createGetListeCompte() {
        return new GetListeCompte();
    }

    /**
     * Create an instance of {@link GetListeCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetListeCompteResponse }
     */
    public GetListeCompteResponse createGetListeCompteResponse() {
        return new GetListeCompteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertEuroToDH")
    public JAXBElement<ConvertEuroToDH> createConvertEuroToDH(ConvertEuroToDH value) {
        return new JAXBElement<>(_ConvertEuroToDH_QNAME, ConvertEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertEuroToDHResponse")
    public JAXBElement<ConvertEuroToDHResponse> createConvertEuroToDHResponse(ConvertEuroToDHResponse value) {
        return new JAXBElement<>(_ConvertEuroToDHResponse_QNAME, ConvertEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListeCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListeCompte")
    public JAXBElement<GetListeCompte> createGetListeCompte(GetListeCompte value) {
        return new JAXBElement<>(_GetListeCompte_QNAME, GetListeCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListeCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListeCompteResponse")
    public JAXBElement<GetListeCompteResponse> createGetListeCompteResponse(GetListeCompteResponse value) {
        return new JAXBElement<>(_GetListeCompteResponse_QNAME, GetListeCompteResponse.class, null, value);
    }

}
