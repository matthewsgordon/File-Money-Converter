/**
* ERDataProcessor class
*
* @pauthor  Matthew Gordon
*
*/
public class ERDataProcessor {
    double[] data;
    double averageRate;

    /**
    * Processes data file
    * 
    * @param data data for processing
    *
    */
    public void process(String data)
    {
        // Reference ThinkJava Chapter 8 Arrays
        // Splits the string data into an array of strings split by the line separator 
        String[] dataArr = data.split(System.lineSeparator());
        // initsalises data to an array of doubles of the length of the number of lines in the array 
        this.data = new double[dataArr.length];
        // Sets the total to 0, used to calculate the average 
        double total = 0;
        // Loops through the array elements 
        for (int i = 0; i < dataArr.length; i++) {
            // Converts the string into a number and sets the data array 
            this.data[i] = Double.parseDouble(dataArr[i]);
            // Adds the numbers until the end of the loop
            total = total + this.data[i];
        }   
        // Calculates the average by dividing the total by the number of elements in the array
        averageRate = total / dataArr.length;
    }

    /**
    * Returns data as a double array
    * 
    * @return the data as an array of doubles 
    *
    */
    public double[] getData()
    {
        return data; 
    }
    /**
    * returns the average exchange rate 
    * 
    * @return returns the average rate 
    *
    */
    public double getAverageRate()
    {
        return averageRate;
    }
    /**
    * Sets the average rate 
    * 
    * @param averageRate inisalises averageRate
    *
    */
    public void setAverageRate(double averageRate)
    {
        this.averageRate = averageRate;

    }
    /**
    * Converts pounds to dollars
    * 
    * @return CVonversion of pounds to dollars 
    *
    */
    public double poundToDollar(double p)
    {
        // Pound to Dollar is multiply
        return p * this.averageRate;
    }
    /**
    * converts dollars to pounds 
    * 
    * @return returns conversion of dollars to pounds
    *
    */
    public double dollarToPound(double d)
    {
        // Dollar to Pound is divide
        return d/ this.averageRate;
    }
}
