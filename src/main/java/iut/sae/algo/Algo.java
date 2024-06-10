package iut.sae.algo;


public class Algo{
    public static String RLE(String in){
        String res = ""; 
        int frequence = 0; 
        /*char tab [] =  new char[in.length()+1]; 
        int i;
        for (i =0 ; i < in.length(); i++) {
           tab[i]= in.charAt(i); 
        }
        for (i = 0; i< tab.length; i++){
            while (tab[i] == tab[i+1]){
                frequence ++; 
            }
            res = res + frequence +tab[i]; 
        }
        System.out.println(tab);
        return res; */
        int i = 0; 
        int taille = in.length() +1 ; 
        while(i < taille){ 
            while (in.charAt(i) == in.charAt(i+1)) {
                frequence ++;  
                i++; 
            }
            res = res + frequence + in.charAt(i); 
            i = frequence; 
        }
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

