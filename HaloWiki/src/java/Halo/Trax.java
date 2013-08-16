/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Halo;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author kev
 */
public class Trax{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TransformerConfigurationException, TransformerException {
        // TODO code application logic here


        /**
         * Creating the sources *
         */
        String enemiesInput = "enemies.xml";
        StreamSource enemiesStreamSource = new StreamSource(enemiesInput);
        
        String mapsInput = "maps.xml";
        StreamSource mapsStreamSource = new StreamSource(mapsInput);
        
        String indexInput = "index.xml";
        StreamSource indexStreamSource = new StreamSource(indexInput);
        
        String vehiclesInput = "vehicles.xml";
        StreamSource vehiclesStreamSource = new StreamSource(vehiclesInput);
        
        String weaponsInput = "weapons.xml";
        StreamSource weaponsStreamSource = new StreamSource(weaponsInput);
        
        

        /**
         * Creating the results *
         */
        String enemiesOutput = "enemies.html";
        StreamResult enemiesResult = new StreamResult(enemiesOutput);

        String mapsOutput = "maps.html";
        StreamResult mapsResult = new StreamResult(mapsOutput);
        
        String indexOutput = "index.html";
        StreamResult indexResult = new StreamResult(indexOutput);
        
        String weaponsOutput = "weapons.html";
        StreamResult weaponsResult = new StreamResult(weaponsOutput);
        
        String vehiclesOutput = "vehicles.html";
        StreamResult vehiclesResult = new StreamResult(vehiclesOutput);
        /**
         * Create a Transform Factory *
         */
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Source EnemiesXSL = new StreamSource("enemies.xsl");
        Source mapsXSL = new StreamSource("maps.xsl");
        Source indexXSL = new StreamSource("index.xsl");
        Source weaponsXSL = new StreamSource("weapons.xsl");
        Source vehiclesXSL = new StreamSource("vehicles.xsl");
        
        

        /**
         * Determining the XSL Style sheets based on the processing instruction
         * in the source documents
         */
        Source enemiesstylesheet = transformerFactory.getAssociatedStylesheet(enemiesStreamSource,
                null,
                null,
                null);
    
        Source mapsstylesheet = transformerFactory.getAssociatedStylesheet(mapsStreamSource,
                null,
                null,
                null);
        
        Source indexstylesheet = transformerFactory.getAssociatedStylesheet(indexStreamSource,
                null,
                null,
                null);

        Source weaponsstylesheet = transformerFactory.getAssociatedStylesheet(weaponsStreamSource,
                null,
                null,
                null);
        
        Source vehiclesstylesheet = transformerFactory.getAssociatedStylesheet(vehiclesStreamSource,
                null,
                null,
                null);
        /**
         * Create the Transformers *
         */
        Transformer enemiestransformer = transformerFactory.newTransformer(enemiesstylesheet);
        Transformer mapstransformer = transformerFactory.newTransformer(mapsstylesheet);
        Transformer indextransformer = transformerFactory.newTransformer(indexstylesheet);
        Transformer weaponstransformer = transformerFactory.newTransformer(weaponsstylesheet);
        Transformer vehiclestransformer = transformerFactory.newTransformer(vehiclesstylesheet);
        /**
         * Use the transform() method of the transformers to transform sources
         * into results
         */
        enemiestransformer.transform(enemiesStreamSource, enemiesResult);
        mapstransformer.transform(mapsStreamSource, mapsResult);
        indextransformer.transform(indexStreamSource, indexResult);
        weaponstransformer.transform(weaponsStreamSource, weaponsResult);
        vehiclestransformer.transform(vehiclesStreamSource, vehiclesResult);
    }
}
