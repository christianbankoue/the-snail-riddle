package com.company;

import java.util.Scanner;

public class Main {



  public static void nombredejour(int nbJour, int nbPJour, int nbPasH, int nbPasA, int nbPasB){

        if(nbPasA>=nbPasH) {
            nbJour = 1;
            System.out.println(nbJour);
        }
        else if(2*nbPasA-nbPasB > nbPasH ) {
            System.out.println(nbJour); // nbJour = 2 car nbJour est initialisé a 2 dans le main.
        }
        else{
            if(nbPJour + nbPasA >=nbPasH  ){
                System.out.println(nbJour); // nbJour = 2;
            }
            else {
            nbJour += 1;
            nbPJour += nbPasA - nbPasB ;

            nombredejour(nbJour,nbPJour,nbPasH,nbPasA,nbPasB);
            }

        }
    }



    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("H");
        int H = scanner.nextInt();
        System.out.println("A");
        int A = scanner.nextInt();
        System.out.println("B");
        int B = scanner.nextInt();

        int nbJour= 2;
        int  nbPJour = A - B;

        nombredejour(nbJour,nbPJour,H,A,B);


    }

}
