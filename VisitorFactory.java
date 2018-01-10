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
public class VisitorFactory {
    public static Visitor getVisitor(Word w1, Word w2)
    {
        
        Visitor v = null;
        if(w1 instanceof SimpleWord)
        {
            v = new SimpleWordVisitor();
            v.firstWord = w1;
            return v;
        }
        
        if(w1 instanceof AbbreviateWord)
        {
            v = new AbbreviateWordVisitor();
            v.firstWord = w1;
            return v;
        }
        if(w1 instanceof AmbiguousWord)
        {
            v= new AmbiguousWordVisitor();
            v.firstWord=w1;
            return v;
        }
        return null;
    }
}
