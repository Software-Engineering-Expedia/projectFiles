package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileIO 
{
	public void writeToFile (String strSTA, String strEND)
	{
        FileWriter fwg = null;
        try 
        {
        	// open the file in append write mode
        	fwg = new FileWriter("C:\\output.txt", true);
        }
        catch (IOException e)
        {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
        
        
   	    
        BufferedWriter bwg = new BufferedWriter(fwg);
        PrintWriter outg   = new PrintWriter(bwg);
        
        outg.println("Location Entries: " + strSTA + " - " + strEND);
        
        outg.close();
	}
}

