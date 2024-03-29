/* Code to write a program in Java to create a Player class. Inherit the classes 
Cricket Player, Football _Player and Hockey Player from Player class. */

class Player 
{
    int n;


    Player(int a) 
    {
        n = a;
    }
 
    void display(String name, int j) 
    {
        System.out.println("The name of Player is " + name + " and jersey number is " + j + ".");
        System.out.println("Number of games played: " + n);
    }
}

class Cricket_player extends Player 
{
    Cricket_player(int n) 
    {
        super(n);
    }


    void cricket() 
    {
        super.display("Virat", 18);
    }
}

class Football_player extends Player 
{
    Football_player(int n) 
    {
        super(n);
    }


    void football() 
    {
        super.display("Ronaldo", 7);
    }
}

class Hockey_player extends Player 
{
    Hockey_player(int n) 
    {
        super(n);
    }


    void hockey() 
    {
        super.display("Manpreet", 18);
    }
}

public class Exp4_2 
{
    public static void main(String[] args) 
    {
        Cricket_player c = new Cricket_player(123);
        c.cricket();
        Hockey_player h = new Hockey_player(150);
        h.hockey();
        Football_player f = new Football_player(182);
        f.football();
    }
}
