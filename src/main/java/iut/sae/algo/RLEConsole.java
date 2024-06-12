package iut.sae.algo;

import java.util.Scanner;

public class RLEConsole{

    public static void main(String[] args){
        String in=""; 
        if(args.length>0){
            in=args[0];
        }
        else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chaine à transformer : ");
            in = scanner.next();
            scanner.close();
        }

        System.out.println("Entrée : "+in);
        String res = Algo.RLE(in); 
        System.out.println("Sortie : "+ res);
        
        try{
            System.out.println("Inverse de in : "+ Algo.unRLE(res));
            String val3 = Algo.RLE(in, 3); 
            System.out.println("REL avec iteration : " + val3);
            System.out.println("retourner avec iteration : "+ Algo.unRLE(val3, 3));
        }catch (AlgoException e){
            System.out.println("Erreur");
        }
        
    }
}