package Java8_new_feature;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File f=new File("./Laptop.xml");
		String path = f.getAbsolutePath();
		Document document = builder.parse(new File("C:/Users/Adarsh/Desktop/AppiumClassWork/AppiumEclipse/JavaPractice/src/Laptop.xml"));
		document.getDocumentElement().normalize();
		NodeList nodes = document.getElementsByTagName("laptop");
		System.out.println(nodes.getLength());
		for(int i=0;i<nodes.getLength();i++)
		{
			Node laptop = nodes.item(i);
			if(laptop.getNodeType()==Node.ELEMENT_NODE)
			{
				Element lappyEle = (Element)laptop;
				System.out.println("Laptop name is : "+lappyEle.getAttribute("name"));
				NodeList childLappy = lappyEle.getChildNodes();
				for(int j=0;j<childLappy.getLength();j++)
				{
					Node detail = childLappy.item(j);
					if(detail.getNodeType()==Node.ELEMENT_NODE)
					{
						Element specs = (Element)detail;
						System.out.println("....................");
						System.out.println(specs.getTagName()+"...-->>>>"+specs.getAttribute("value"));
					}
				}
			}
		}

	}

}
