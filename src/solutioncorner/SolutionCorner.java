/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutioncorner;

/**
 *
 * @author Christopher
 */
public class SolutionCorner {
//ny edit
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SolutionCorner().testisUnique();
    }
   
    
    void testisUnique()
    {
        int[] a = { 1, 2, 4, 6, 3, 5};
        int[] b = { 2, 4, 9, 12, 4, 5, 6, 7, 8};
        if ( isUnique(a))
            System.out.println("OK");
        else
            System.out.println("DUER IKKE");
        
        if ( isUnique(b) == false)
            System.out.println("OK");
        else
            System.out.println("DUER IKKE");
    }
    boolean isUnique(int[] a) 
    {
        for (Integer x : a)
        {
            if (count(a, x) >= 2)
                return false;
            
        }
        return true;
    }

    /**
     * Compute the number of occurrences of x in a
     * @param a = the array to search for x
     * @param x = the value we count
     * @return the number of occurrences of x in a
     */
    private int count(int[] a, Integer x) {
        
        int resultat = 0;
        for (Integer aValue : a)
            if (aValue == x )
                resultat++;
        return resultat;
    }
    
}
