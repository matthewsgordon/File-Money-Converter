/**
 *
 * This is the CIS1112 Coursework 1.3 assignment helper file.
 *
 *
 * File name: CW1_3.java
 * Package: default
 * Created:	January 9th, 2020
 * @Author:	Dr. Robert Lyon (lyonro@edgehill.ac.uk)
 * 
 * Contact:	lyonro@edgehill.ac.uk
 * Web:		https://www.edgehill.ac.uk/computerscience/people/academic-staff/robert-lyon/
 * 
 */

/**
 * This is the coursework helper file. Do not,
 * 
 * i) rename the file.
 * ii) edit the file.
 * 
 * @author Dr. Robert Lyon
 *
 */
public class CW1_3 
{
	/**
	 * Main entry point to the application.
	 * 
	 * @param args unused command line arguments.
	 */
	public static void main(String[] args) 
	{	    
		// Modify this pass so it points to the test file on your windows/mac machine.
		String file_path = "example.cf";
		
		print("Test file path:" + file_path);
		ERFReader r = new ERFReader();
		
		String fileContents = r.getContents(file_path);
		
		if (fileContents == null)
		{
			print("Hmm, we've encountered an issue - can't read the data.");
			print("Better exit before I break anything....");
			System.exit(0); // Quits the application.
		}
		else
		{
			// Let's see what we've got from the file, if anything.
			
			print("\nFile contents: \n");
			print(fileContents);
			
			// Next we try to process the data from the file.
			ERDataProcessor edp = new ERDataProcessor();
			
			edp.process(fileContents);
			
			print("\nAverage computed: " + edp.getAverageRate());
			edp.setAverageRate(1.5);
			print("Now let's do some conversion...");
			
			double pounds = 100.00;
			double dollars = 100;
			
			print("£"+pounds + " gets us on average $" + edp.poundToDollar(pounds));
			print("$"+dollars + " gets us on average £" + edp.dollarToPound(dollars));
			
		}
			
	}
	
	/**
	 * I've wrapped the print method, to make my examples clearer.
	 * 
	 * @param text the text to print to standard output.
	 */
	private static void print(String text)
	{
		System.out.println(text);
	}
}
