import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {   Scanner keyboard = new Scanner(System.in);
        System.out.println("What number would you like to factorialize?");
        int number = keyboard.nextInt();
        int answer = factorialFinder(number);
        System.out.println(number + "factorialzed equals" + answer);
    }
    
    /**
    *Takes a number and returns its factorial
    *@param the user chosen number
    *@return the factorial
    */
    public static int factorialFinder(int number)
    {
        if (number > 1)
             number = (number * factorialFinder(--number));
        
        
        return number;
        
        
            
    }
}

//works thru 14