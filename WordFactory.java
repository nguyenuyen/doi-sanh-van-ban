/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author huong
 */
public class WordFactory {
    public static Word getWord(String w)
    {
        Word t = null;
        if("'ll".equals(w))
        {
            t = new AbbreviateWord();
            t.content = w;
            t.semantic = "will";
            return t;
        }
        if("'ve".equals(w))
        {
            t=new AbbreviateWord();
            t.content=w;
            t.semantic="have";
            return t;
        }
        if("'re".equals(w))
        {
            t=new AbbreviateWord();
            t.content=w;
            t.semantic="are";
            return t;
        }
         if("'m".equals(w))
        {
            t=new AbbreviateWord();
            t.content=w;
            t.semantic="am";
            return t;
        }
        if("'s".equals(w))
        {
            t = new AmbiguousWord();
            t.content = w;
            t.semantic = w;
            return t;
        }
        if("'d".equals(w))
        {
            t = new AmbiguousWord();
            t.content = w;
            t.semantic = w;
            return t;
        }
        t = new SimpleWord();
        t.content = w;
        t.semantic = w;
        return t;
    }
}
