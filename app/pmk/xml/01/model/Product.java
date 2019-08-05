package model;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Product {

    private class ProductHandler extends DefaultHandler {
        private String tag = "";
        private int count;

        @Override
        public void endDocument() throws SAXException {
            System.out.println("Count: " + this.count);
        }

        @Override
        public void startDocument() throws SAXException {
            this.count = 0;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            tag = qName;

            if (qName.equalsIgnoreCase("Product"))
                this.count++;

            if (attributes.getLength() > 0) {
                System.out.println("Attributes: " + attributes.getLength());
                for (int i = 0; i < attributes.getLength(); i++) {
                    System.out.println("\t" + attributes.getQName(i) + " : " + attributes.getValue(i));
                }
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            try {

                String content = new String(ch, start, length);

                if (this.tag.equalsIgnoreCase("id"))
                    System.out.println("Id: " + content);
                if (this.tag.equalsIgnoreCase("name"))
                    System.out.println("Name: " + content);
                if (this.tag.equalsIgnoreCase("price")) {
                    double price = Double.parseDouble(content);
                    System.out.println("Price: " + price);
                }
                if (this.tag.equalsIgnoreCase("quantity")) {
                    int qtn = Integer.parseInt(content);
                    System.out.println("Quantity: " + qtn);
                }
                if (this.tag.equalsIgnoreCase("weight")) {
                    double weight = Double.parseDouble(content);
                    System.out.println("Weight: " + weight);
                }
                if (this.tag.equalsIgnoreCase("date")) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = simpleDateFormat.parse(content);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
                    System.out.println("Date: " + simpleDateFormat2.format(date));
                }
                if (this.tag.equalsIgnoreCase("status")) {
                    boolean status = Boolean.parseBoolean(content);
                    System.out.println("Status: " + status);
                }
                this.tag = "";

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if(qName.equalsIgnoreCase("product"))
                System.out.println("--------------------------");
        }


        
        
        
    }
    
    public void display(String path){
        try {
            
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser =saxParserFactory.newSAXParser();
            saxParser.parse(path,new ProductHandler());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    } 

}