/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import Model.*;

/**
 *
 * @author huong
 */
public class SimpleWordVisitor extends Visitor {
    
    @Override
    public void visit(SimpleWord w)
    {
       
       this.visit(this.firstWord.content,w.content);
    }
    
    public void visit(AbbreviateWord w)
    {
          this.visit(this.firstWord.content,w.semantic);
    }
    
    public void visit(AmbiguousWord w)
    {
        if(
                (firstWord.content.equals("has")
                || "is".equals(firstWord.content)
                || "was".equals(firstWord.content)
                || "us".equals(firstWord.content)
                )
                && w.content.equals("'s")
                )
        {
            matrix[indexX][indexY] = matrix[indexX - 1][indexY - 1] + 1;
        }
        else  if(("had".equals(firstWord.content)
                || "would".equals(firstWord.content))
                && w.content.equals("'d")
                )
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
}
