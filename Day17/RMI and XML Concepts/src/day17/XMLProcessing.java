package day17;

import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
public class XMLProcessing {
	public static void main(String[] args)throws Exception {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document dom=db.parse(new FileInputStream("books.xml"));
		
		Element e=dom.getDocumentElement();
		
		System.out.println("Root Element Name...:"+e.getNodeName());
		System.out.println("has child nodes...:"+e.hasChildNodes());
		Node n=e.getFirstChild();
		System.out.println(n.getFirstChild().getNodeType());
		for(int i=0;i<e.getChildNodes().getLength();i++) {
			for(int j=0;j<e.getChildNodes().item(i).getChildNodes().getLength();j++) {
				System.out.println(e.getChildNodes().item(i).getChildNodes().item(j).getFirstChild().getNodeValue());
			}
		}
		
		
	}
}

/*
dtd-document type defination..
PCDATA-passed charcter name...
*/
/*
 *Documnet
 *	documentElement - Element(RootElement)
 *  getElementsByTagName(n) - NodeList
 *  createElement(e)-n
 *  createTextNode(e)-n
 *  createAttribute(e)-n
 *
 * Element  (kind of Node)
 *
 * Node
 * 	getNodeName()-String
 *  getNodeValue() - String
 *  getNodeType() - int
 *  getChildNodes()- NodeList
 *  attributes - NamedNodeMap
 *  hasChildNodes() - boolean
 *  getChildNodes() - NodeList
 *  previousSibling() - node
 *  nextSibling() - node
 *  getLastChild() - node
 *  getFirstChild() - node
 *  appendChild(n)-n
 *  insertBefore(n,n)-n
 *  cloneNode(n)-n
 *  removeNode(n)-n
 *  getElementsByTagName(n) - NodeList
 *
 * NodeList
 *  length() - int
 *  item(i) - node
 *
 * NamedNodeMap
 * 	length() - int
 * 	getNamedItem() - node
 	setNamedItem()-node
 	removeNamedItem()-node
*/