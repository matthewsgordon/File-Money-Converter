import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
* ERFReader class
*
* @pauthor  Matthew Gordon
*
*/
public class ERFReader {    
    
    /**
    * Processes data file
    * 
    * @param path Path to file for processing
    * @return Processed file contents 
    */
    public String getContents(String path)
    {
        String data = "";                                   // Holds the total data in a string
        String line = "";                                   // Reads a data line at a time
        FileReader fr;                                      // Holds file ibput reader
        BufferedReader br = null;                           // Holds buffered reader
        File file = new File(path);                         // File instance
        // Handle any errors
        try {
            // Commands to open and read a text file (from Java,Java.Java p.512)
            //
            fr = new FileReader(file);                      // Create a filereader
            br = new BufferedReader(fr);                    // Gets a handle to read the file  
            // Loops through the file and reads on a line at a time until the
            // end of the file is reached which returns a null     
            while((line = br.readLine()) != null)
            {
                // System.lineSeperator is works on Windows, Mac etc as per https://www.javatpoint.com/new-line-in-java
                data = data + line + System.lineSeparator(); // Concatonates the data with each line on line separator 
            } 
            br.close(); // Closes the file 
            
        } catch (Exception e) {
            e.printStackTrace();                            // Display error
        }
        return data;
    } 
}