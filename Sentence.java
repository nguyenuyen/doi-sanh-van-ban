/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Visitors.*;

/**
 *
 * @author huong
 */
public class Sentence {
    public ArrayList<Word> list = new ArrayList<Word>();
    //public ArrayList<ArrayList<int>> matrix = new ArrayList<ArrayList<int>>();
    public int [][] matrix;
    
    public void IntializeMatrix(Sentence s)
    {
        matrix = new int[this.list.size() + 1][s.list.size() + 1];
        for(int i = 0; i < this.list.size() + 1; i++)
        {
            matrix[i][0] = 0;
        }
        
        for(int j = 0; j < s.list.size() + 1; j++)
        {
            matrix[0][j] = 0;
        }
    }
    
    public void check(Sentence s)
    {
        for(int i = 0; i < this.list.size(); i++)
        {
            for(int j = 0; j < s.list.size(); j++)
            {
                Visitor v= VisitorFactory.getVisitor(this.list.get(i), s.list.get(j));
                v.matrix = this.matrix;
                v.indexX = i+1; v.indexY = j+1;
                s.list.get(j).accept(v);
            }
        }
    }
}
