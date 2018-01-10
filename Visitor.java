/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import Model.AbbreviateWord;
import Model.*;

/**
 *
 * @author huong
 */
public class Visitor {
    
    public int [][] matrix;
    public int indexX, indexY;
    public Word firstWord;
    
    public void visit(String a,String b)
    {
        if(a.equals(b))
        {
            matrix[indexX][indexY] = matrix[indexX - 1][indexY - 1] + 1;
        }
        else{
            int max = Math.max(matrix[indexX][indexY - 1], 
                                    matrix[indexX - 1][indexY]
                                );
            matrix[indexX][indexY] = max;
        }
    }
    public void visit(SimpleWord w)
    {
        ///Day se la noi cai dat cac thuat toan
    }
    
    public void visit(AbbreviateWord w)
    {
        ///Day se la noi cai dat cac thuat toan
    }
    
    public void visit(AmbiguousWord w)
    {
        ///Day se la noi cai dat cac thuat toan
    }

   

  
}
