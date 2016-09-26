package loop.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LoopController
{
public void start()
    {
	whileLoopTest();
	
	forLoopTest();
	enhancedForLoopTest();
    }

     
      private void whileLoopTest()
    {
	int count = 0;
	while (count < 12)
	{
		System.out.println("Count is: " + count);
		
		count++;
    }
	    System.out.println("Its like 1:00AM, but I love code!:))");
    
     
     {
	int loopCount = 0;
	while (loopCount < 4 )
	{
		System.out.println("I believe this is the " + loopCount + "th time though the loop");
		
		loopCount++;
	}
	
	System.out.println("This is for all you geeks out there!");
	
     }
     
  }
      
	  private void forLoopTest()
	{	
		System.out.println("Im KIDDING, you're not Geeks, just FREAKS! ;)");
	for(int b = 0; b < 6; b++)
		System.out.println("SEE THAT RHYME?!?! I could be a rhyme machine!!!!!!!!!!!!!!!!");
		{
	for(int c = 1; c < 3; c++)
		System.out.println("Im going to do this until I think of a ryhme.");
		}
	    System.out.println("I got it, im like a roket! ;))");
	    }
   
	  private void enhancedForLoopTest()
	    {
	    
	    	ArrayList<String> ryhmeMachine = new ArrayList<String>();
	    	ryhmeMachine.add("My ryhmes are as sour as limes.");
	    	ryhmeMachine.add("You're not a dime, cause your moms a crime.");
	    	ryhmeMachine.add("You look like a hog the size if a log!");
	    	ryhmeMachine.add("Gotta scat-Rat!");
	    	for(String currentRyhme : ryhmeMachine)
	    	{
	    		JOptionPane.showMessageDialog(null, "The current rhyme is:" + currentRyhme);
	    	}
	    	
	    	
	   }
  }

	
		


