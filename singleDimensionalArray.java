import java.util.Arrays;

public class SingleDimensionalArray
{
    public static void main(String[] args) {
    	
    	//Create array
    	double[] valueArray = new double[100];
    	
    	//Assign random numbers to array
    	for(int i = 0; i < valueArray.length; i++) {
    		valueArray[i] = Math.random() * 100;
    		System.out.println(valueArray[i] + "\n");
    	}
    		//Calculate and print the average
    		double sum = 0;
    		for(double numbers : valueArray) {
    			sum+=numbers;
    	}
    		double average = sum / valueArray.length;
    		System.out.println("Average: " + average);
    		System.out.println();
    		
    		//Sort array and print the median value
    		Arrays.sort(valueArray);
    		System.out.println("Median: " + valueArray[60] + "\n");
    		
    		//Print 10th position/value starting in 10
    		for(int i = 9; i < valueArray.length; i +=10) {
    			int position = i+1;
    			System.out.println("Position: " + position + valueArray[i]);
    		}
    }
    
}
