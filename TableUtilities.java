 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return  getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
       //StringBuffer sbf = new StringBuffer("");
       String str = "";
       for (int i = 1; i <= tableSize; i++) {
        
         for (int j = 1; j <= tableSize; j++) {
             //sbf.append("  "+i*j).append(" |");
             
             str += String.format("%3d |" ,i * j);
             
         
         }
         str +="\n";
         //sbf.append("\n");
         
        }
        System.out.print(str);
        return str;
    }
}
