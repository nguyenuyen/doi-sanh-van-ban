/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import Model.AbbreviateWord;
import Model.AmbiguousWord;
import Model.SimpleWord;

/**
 *
 * @author nguyen_uyen
 */
public class AmbiguousWordVisitor extends Visitor{
     public void visit(SimpleWord w)
    {
        Visitor v = new SimpleWordVisitor();
        v.firstWord = w;
        v.indexX = this.indexX;
        v.indexY = this.indexY;
        v.matrix = this.matrix;
        this.firstWord.accept(v);
    }
    
    public void visit(AbbreviateWord w)
    {
        ///Day se la noi cai dat cac thuat toan
    }
    
    public void visit(AmbiguousWord w)
    {
        this.visit(this.firstWord.content, w.content);
    }
}
