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
 * @author huong
 * Lớp này đại diện cho thuật toán so sánh 2 word, với một bên 
 * firstWord là một đối tượng của AbbreviateWord (từ viết
 * tắt không nhập nhằng) 
 * hàm visit(SimpleWord w) sẽ đối sánh firstWord
 * với từ w là một SimpleWord
 */
public class AbbreviateWordVisitor extends Visitor{
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
         this.visit(this.firstWord.content, w.content);
    }
    
    public void visit(AmbiguousWord w)
    {
        ///Day se la noi cai dat cac thuat toan
    }
}
