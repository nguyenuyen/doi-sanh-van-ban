/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Visitors.Visitor;

/**
 *
 * @author huong
 */
public class SimpleWord extends Word{
    
    public SimpleWord(){}
    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
