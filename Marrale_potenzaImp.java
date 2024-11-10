/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marrale_potenzaimp; 
import java.util.Scanner; 

/**
 *
 * Marrale Lorenzo 4INFD
 * Scrivere un programma che simula il funzionamento della funzione potenza che si studia in matematica
 * 
 */

/*

variabili:

Base
esponente
risultato

richiesta:

richiesta base
richiesta esponente

cosa fare:

for che moltiplica la base tot volte quante l'esponente

stampa a schermo

*/

public class Marrale_potenzaImp {


    
    public static void main(String[] args) {
        
        
        //inizialzzazione variabili 
        int base;
        int esponente;
        int prodotto = 1;
        
        //richiedo tramite metodo scanner all'utente di inserire un valore sia per la base sia per l'esponente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci valore base: ");
        base = scanner.nextInt();
        System.out.print("Inserisci valore esponente: ");
        esponente = scanner.nextInt();
        
        //stampa valore base e esponente
        System.out.println("la base e' " + base);
        System.out.println("l'esponente e' " + esponente);
        
    
        //for che simula il funzionamento della funzione potenza, questo ciclo si ripete tot volte quanto il valore dell'esponente
        for(int i = 0; i < esponente; i++)
        {
            
            //operazione per calcolare il prodotto
            prodotto = prodotto*base;
            
        }
        
        //stampa risultato della potenza
        System.out.println("il risultato della potenza e' " + prodotto);
        
    }
    
}
