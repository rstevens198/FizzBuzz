/*
    Ryan Stevens
    FizzBuzz

    This program is a simple fizz buzz program. If a number from 0 to 100 is divisble by three then wqe write Fizz, if its divisble by 5 we write Buzz, and if its divisble by both we write FizzBuzz.
    
    For this version we can write it all in one main method. This is a bad prgramming practice but we are fdoing this to see how fast we can write the code. 
*/
using System;


namespace FizzBuzz
{
    class Program
    {
        static void Main()
        {
            for(int i = 0; i < 101; i++)
            {
                if ((i % 5 == 0) && (i % 3 == 0))
                {
                    Console.WriteLine(i + ": FizzBuzz.");
                }
                else if ((i % 5 == 0))
                {
                    Console.WriteLine(i + ": Buzz.");
                }
                else if ((i % 3 == 0))
                {
                    Console.WriteLine(i + ": Fizz.");
                }
                else
                    Console.WriteLine(i + ":");
            }
        }
    }
}
