/* Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, 
urgent or lightning. The charges depend on the duration and the type of the call. 
Write a program using the concept of polymorphism in Java to calculate the charges. */


import java.util.*;

class TrunkCalls 
{
    double rate(String type) 
    {
        if (type.equals("Ordinary")) 
        {
            return 5.2;
        } 
        else if (type.equals("Urgent")) 
        {
            return 3.2;
        }
        else if (type.equals("Lightning")) 
        {
            return 2.5;
        } 
        else 
        {
            return 0;
        }
    }
}

class Charges extends TrunkCalls 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        double duration;
        String type;
        System.out.println("Enter the type(Ordinary/Urgent/Lightning) and duration of call: ");
        type = Sc.nextLine();
        duration = Sc.nextDouble();
        Charges obj = new Charges();
        System.out.println("Type of call: " + type);
        System.out.println("Duration of call: " + duration);
        System.out.println("Charges of call: " + obj.rate(type) * duration);
    }
}
