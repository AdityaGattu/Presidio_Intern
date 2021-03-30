package day17;

import java.io.FileInputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.DocumentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class XMLSaxDemo {
	public static void main(String[] args) throws Exception{
		SAXParserFactory spf=SAXParserFactory.newInstance();
		
		SAXParser sp=spf.newSAXParser();
		
		sp.parse(new FileInputStream("books.xml"),new MyProcessingHandler());
	}
}
class MyProcessingHandler extends DefaultHandler{
	@Override
	public void startDocument() throws SAXException {
		System.out.println("parsing started....");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("parsing finished....");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
		int length=attributes.getLength();
		for(int i=0;i<length;i++) {
			System.out.print(attributes.getQName(i)+"=\"");
			System.out.print(attributes.getValue(i)+"\"");
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s=new String(ch,start,length);
		System.out.print(s);
	}
	
}
/*
	*<invoice invno="1010a">
	*	<items>
	*		<item id="a001">
	*			<itemname>daal</itemname>
	*			<unit>kg</unit>
	*			<price>12-</price>
	*			<qty>2</qty>
	*		</item>
			<item id="a001">
	*			<itemname>daal</itemname>
	*			<unit>kg</unit>
	*			<price>12-</price>
	*			<qty>2</qty>
	*		</item>
	*</items>
	*</invoice>
	*
	*<reportcard>
	*	<studentname></studentname>
	*	<subject>
	*		<subjectname>physics</subjectname>
	*		<marks>50</marks>
	*	</subject>
	*
	*</reportcard>
*/