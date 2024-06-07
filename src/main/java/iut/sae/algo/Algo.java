package iut.sae.algo;


public class Algo{
    public static String RLE(String in){
        String res = ""; 
        int frequence = 0; 
        char tab [] =  new char[in.length()]; 
        int i;
        for (i =0 ; i < in.length(); i++) {
           tab[i]= in.charAt(i); 
        }
        for (i = 0; i< tab.length; i++){
            if (tab[i]== tab[i+1]){
            frequence ++; 
            res = res + tab[i] + frequence; 
           }
        }
        System.out.println(tab);
        return res; 
    }

    public static String RLE(String in, int iteration) throws AlgoException{
        // Provide your algo here
        return "NotYetImplemented";
    }

    public static String unRLE(String in) throws AlgoException{
        // Provide your algo here
        return "NotYetImplemented";

    }

    public static String unRLE(String in, int iteration) throws AlgoException{
        // Provide your algo here
        return "NotYetImplemented";

    }
}

