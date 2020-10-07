package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import generated.*;
/**
 * 
 * @author Curro Caro
 *
 */
public class Main {

	private static final String MIARCHIVO_XML = "./micentro.xml";

	public static void main(String[] args) {
		
		//Creamos el ObjectFactory
		ObjectFactory factory = new ObjectFactory();
		

		//Creamos los profesores
		TipoProfesor p1 = new TipoProfesor();
		p1.setCodigoprofesor("1A");
		p1.setNombreprofesor("Manolo");
		TipoProfesor p2 = new TipoProfesor();
		p2.setCodigoprofesor("1B");
		p2.setNombreprofesor("Andres");
		TipoProfesor p3 = new TipoProfesor();
		p3.setCodigoprofesor("1C");
		p3.setNombreprofesor("Antonio");
		//Creamos el centro y asignamos un profesor como director
		TipoCentro c1 = new TipoCentro();
		c1.setCodigocentro("SVQ1");
		c1.setNombrecentro("Salesianas Nervion");
		c1.setDireccion("Calle: Hola, Sevilla");
		c1.setDirector(p1);
		//Creamos profesores y metemos los profesores
		TipoProfesores tps = new TipoProfesores();
		tps.getProfesor().add(p1);
		tps.getProfesor().add(p2);
		tps.getProfesor().add(p3);
		//Creamos el tipo datoscentro
		TipoDatoscentro tcd = new TipoDatoscentro();
		tcd.setCentro(c1);
		tcd.setProfesores(tps);

		//Creamos el JAXBelement y lo asignamos con el ObjectElement
		JAXBElement<TipoDatoscentro> elemento = factory.createDatoscentro(tcd);

		try {
			//Creamos el contexto, el marshaler y se crea el archivo
			JAXBContext contexto = JAXBContext.newInstance(ObjectFactory.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(elemento, new FileOutputStream(MIARCHIVO_XML));
			System.out.println("Fichero creado");
			m.marshal(elemento, System.out);

		} catch (JAXBException jb) {
			jb.printStackTrace();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}

	}

}
