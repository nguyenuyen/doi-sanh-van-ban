/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doisanhvanban;

import Model.*;
import Model.WordFactory;

/**
 *
 * @author huong
 */
public class DoiSanhVanBan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sentence s1 = new Sentence();
        Sentence s2 = new Sentence();
        String firstStr = "'d has a love";
        String secondStr = "'d 's fock true love singer";
        String [] arr1 = firstStr.split(" ");
        String [] arr2 = secondStr.split(" ");
        for(int j = 0; j < arr1.length; j++)
        {
            Word t = WordFactory.getWord(arr1[j]);
            s1.list.add(t);
        }
        
        for(int j = 0; j < arr2.length; j++)
        {
            Word t = WordFactory.getWord(arr2[j]);
            s2.list.add(t);
        }
        
        s1.IntializeMatrix(s2);
        s1.check(s2);
        System.out.println(
                "Kich thuoc xau con chung dai nhat: " +
                s1.matrix[s1.list.size()][s2.list.size()]);
    }
    
}
