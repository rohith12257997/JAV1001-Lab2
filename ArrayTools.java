/*
Name: G S V Rohit
StudentID: A00245384
Program description: This code encrypts and decrypts the string given by the User. Also has a method that accepts the array and Calculates the average of the array and also reversing an array. 
Also, a method that searches the given value and gives an output whether the value is present in the array or not.

*/
package arrayTools;

import java.util.Scanner;

public class ArrayTools {
	
	//giving the letter to know the index of alphabets
	 public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	 
	    public static String encrypt(String plainText, int shiftKey)
	    {
	    	//converting to lower case
	        plainText = plainText.toLowerCase();
	        String cipherText = "";                             // to store the result
	        for (int i = 0; i < plainText.length(); i++)
	        {
	            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
	            int keyVal = (shiftKey + charPosition) % 26;            //formula
	            char replaceVal = ALPHABET.charAt(keyVal);
	            cipherText += replaceVal;
	        }
	        return cipherText;
	    }
	 
	    public static String decrypt(String cipherText, int shiftKey)
	    {
	        cipherText = cipherText.toLowerCase();
	        String plainText = "";
	        for (int i = 0; i < cipherText.length(); i++)
	        {
	            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
	            int keyVal = (charPosition - shiftKey) % 26;
	            if (keyVal < 0)
	            {
	                keyVal = ALPHABET.length() + keyVal;
	            }
	            char replaceVal = ALPHABET.charAt(keyVal);
	            plainText += replaceVal;
	        }
	        return plainText;
	    }
	    
	    
		
		  public static double avg(double arr[]) {
			  double sum = 0;
			 
			  for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];                         //adding all elements in the array
		
			  
			  }
			  
				
			  
			  return (sum/arr.length);    // Returning the avg directly
			  
		  }
		  
		  //checking for the elements found in array or not
		  public static boolean search(double arr[],double num) {
			
			  boolean val = false;
			  for(int i=0;i<arr.length;i++) {
				  
				  
				  if(arr[i]==num) {
					 val=true;
				  }else
				  {
					  val=false;
				  }
			  }
			return val;
			  
		  }
		  
		  // reverse the array
		  public static void rev(double arr[]) {
			  System.out.println("Reversed Array is \n");
			  for(int i=arr.length-1;i>=0;i--) {
				  
				  System.out.println(arr[i]);
			  }
		  }
		  
		  // finding the index optional method
		  public static void index(double arr[],double num) {
			  int in = 0;
			  for(int i=0;i<arr.length;i++) {
				  
				  if(arr[i]==num) {
					  
					  System.out.println("The Index of "+num+" is "+in);
				  }
				  
			  in++;
			  }
		  }
		 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String en="";                                // to store the encrypted value
		
        System.out.println("Enter the String for Encryption: ");
        String message = new String();                      
        message = sc.next();
        System.out.println("Enter the keyvalue\n");
        int key=sc.nextInt();                             //shift value
        en=encrypt(message, key);
        System.out.println("The encrypted String is  "+ en);
        String de= decrypt(en, key);
        System.out.println("The decrypted String is  "+ de);
        
        System.out.println("Enter the number of array elements\n");
        int n =sc.nextInt();                        // no of elements 
        double[] arr=new double[n];
        System.out.println("Enter the elements\n");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextDouble();
        }
        double avg=avg(arr);
        System.out.println("Average of the elements"+avg);
        System.out.println("Enter the number you want to search\n");
        double num=sc.nextDouble();
        boolean val=search(arr, num);
        System.out.println("The element Found is "+val);
        rev(arr);
        System.out.println("enter the element that you want to the index of \n");
        double num1=sc.nextDouble();
        index(arr, num1);
        
        sc.close();                                     // closing the scanner class
	
	
	}
	}
	


