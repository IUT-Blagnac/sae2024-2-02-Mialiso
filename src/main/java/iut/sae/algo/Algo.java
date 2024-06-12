package iut.sae.algo;


public class Algo{
    public static String RLE(String in){
        String res ="";
        int i=0;
        int frequence =1;

        while(i<in.length()-1 && in!="") {
            if (in.charAt(i)==in.charAt(i+1)){
                frequence++;
            }else{
                res=res+frequence+in.charAt(i);
                frequence=1;
            }

            if (frequence>9) {
                res=res+9+in.charAt(i);
                frequence=1;
            }
            i++;
        }

        if (in!=""){
            res=res+frequence+in.charAt(i);
        }

        return res;
    
    }

    public static String RLE(String in, int iteration) throws AlgoException{
        String res =""; 
        res = res+ RLE(in);
        for (int i = 0; i < iteration-1; i++){
            res = RLE(res);  
        }
       return res; 
    }

    public static String unRLE(String in) throws AlgoException{
        String res ="";
        int i=0;

        while(i<in.length()-1 && in!="")
        {
            int nbc=Integer.parseInt(String.valueOf(in.charAt(i)));
            for(int j= 0; j<nbc; j++)
            {
                res=res+in.charAt(i+1);
            }
            i=i+2;
        }
        return res;

    }

    public static String unRLE(String in, int iteration) throws AlgoException{
        String res = ""; 
        res= res+unRLE(in); 
        for (int i =0; i<iteration -1; i++){
            res= unRLE(res); 
        }
        return res; 
    }
}

