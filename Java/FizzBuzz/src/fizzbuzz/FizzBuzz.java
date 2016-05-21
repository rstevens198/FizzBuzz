package fizzbuzz;

/**
 *author: Ryan Stevens
 *5/21/16
 * A simple fizz buzz program. in this program a counter will increase from 0 to 100 and if the counter
 * is divisible by 3 it will output fizz to the screen if it is divisible by 5 it will output buzz
 * and if it i divisible by 3 and 5 it will output Fizz Buzz. Even though this can be done in one main function it must
 * include at least two functions. Even though we can use a for loop and i must declare a variable.
 * 
 * This is a timed assignment with 10 minutes to complete. Because of this we do not care about efficiency.
 * 
 * Lessons Learned: After not doing java for a year it was a little struggle getting used to the syntax.
 * I had to google different sntax and also I have never used netbeans for java and am used to eclipse so
 * I ran into a issue with netbeans finding the main function. 
 * 
 */
public class FizzBuzz {

    
    public static void main(String[] args) {
        int counter = 0;
        
        while (counter <= 100)
        {
            FizzBuzzMethod(counter);
            counter++;
        }
    }
    
    public static void FizzBuzzMethod(int count){
        if((count % 5 == 0) && (count % 3 == 0))
        {
            System.out.println(count + ": FizzBuzz");
        }
        else if(count % 5 == 0)
        {
            System.out.println(count + ": Buzz");
        }
        else if(count % 3 == 0)
        {
            System.out.println(count + ": Fizz");
        }
    }
    
}
