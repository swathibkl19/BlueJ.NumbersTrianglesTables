 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String str="";
        {
            for(int i=0;i<numberOfStars;i++)
            str+="*";
            
        }
        return str;
    }
    
    public static String getTriangle(int numberOfRows) {
        String str="";
        
            for(int i=1;i<=numberOfRows;i++)
            {
                str= str + getRow(i) + "\n";
             }
        return str;
    }


    public static String getSmallTriangle() {
       
        return getTriangle(4) ;
    }

    public static String getLargeTriangle() {
        return getTriangle(9) ;
    }
}
