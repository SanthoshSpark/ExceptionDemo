/*
 * 
 * This program throws an exception whenever balance amount is below Rs 1000
 * 
 * 
 */
package com.exceptions.examples;

public class Exception010 {
	
	 //store account information
    private static int accno[] = {1001, 1002, 1003, 1004, 1005};
 
    private static String name[] =
                 {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
 
    private static double bal[] =
         {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
 
    public static void main(String[] args) {
    	
            // display the heading for the table
            System.out.println("AccNO" + "\t" + "Customer" +
                                           "\t" + "Balance");
 
            // display the actual account information
            for (int i = 0; i < 5 ; i++)
            {
            	try  {
	                System.out.println(accno[i] + "\t" + name[i] +
	                                               "\t" + bal[i]);
	 
	                // display own exception if balance < 1000
	                if (bal[i] < 1000)
	                {
	                	//AccountException ae =
	                      // new AccountException("Balance is less than 1000");
	                    throw new AccountException("Balance is less than 1000");
	                	//throw ae;
	                }
            	} //end of try
                catch (AccountException e) {
                    //e.printStackTrace();
                	System.out.println(e.getMessage());
                }
            }
    }
}
