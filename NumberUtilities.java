
import java.util.*;
public class NumberUtilities {

    public static String getRange(int stop) {
        String strRange = "";
        for(int i=0; i<stop;i++)
        {
            strRange += i;
        }
        return strRange;
    }


    public static String getRange(int start, int stop) {
        String strRange="";
        for(int i=start;i<stop;i++)
        {
            strRange +=i;
        }
        return strRange;
    }


    public static String getRange(int start, int stop, int step) {
        String strRange="";
        for(int i=start;i<stop;i=i+step)
        {
            strRange +=i;
        }
        return strRange;
    }

    public static String getEvenNumbers(int start, int stop) {
       
        String strRange="";
        for(int i=start;i<stop;i++)
        {  
            if(i%2==0)
            {    
        strRange+=i;
    }
        }
        return strRange;
    }


    public static String getOddNumbers(int start, int stop) {
        String strRange="";
        for(int i=start;i<stop;i++)
        {
            if(i%2==1)
            {
                strRange+=i;
            }
        }
        return strRange;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        int result;
        String strRange="";
        for(int i=start;i<=stop;i++)
        {
           result=(int)Math.pow(i,exponent);
           strRange+=result;
        }
        return strRange;
    }
}
