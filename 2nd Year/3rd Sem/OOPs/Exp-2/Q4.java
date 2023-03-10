/* Code to take input as DD MM YYYY(04 08 2021) in command line and calculate number of days 
since 1 January 1970.  */

public class DaysBetweenDates {
    public static void main (String args[])
    {
        int d = Integer.parseInt (args[0]);;
        int m = Integer.parseInt (args[1]);;
        int y = Integer.parseInt (args[2]);;

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("The numbers of days from 1 January 1970 to "+d+"."+m+"."+y);

        int rd = 0;
        int rm = 0;
        int ry = 0;
        int lp = 0;

        // loop to calculate the number of leap years
        for (int year = 1970; year <= y; year++) {
            if (year % 400 == 0)
                lp = lp + 1;
            else if (year % 100 == 0)
                lp = lp;
            else if (year % 4 == 0)
                lp = lp + 1;
            else
                lp = lp;
        }

        // to calculate the number of days between 01-01-1970 and date entered at run time
        if (y >= 1970) {
            ry = (y - 1970) * 365;
            for(int i=0; i<(m-1); i++)
                rm = rm + monthDays[i];
            //System.out.println(rm);
            //rm = (m - 1) * 30;
            rd = d - 1;
            System.out.println (ry + rm + rd + lp);
        }
        else {
            System.out.println ("Invalid date");
        }
    }
}
