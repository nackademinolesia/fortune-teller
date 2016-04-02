/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author olesia
 */

//Index	Adjektiv	Substantiv	 Verb
//0       stor     en lönehöjning springa 
//1       liten    en lönesänkning   ljuga
//2        stark    en fotboja flyga
//3       svag     en katt    se
//4        mjuk     en hund  vara
//5      hård      ett hus   äta
//6      snabb  ett barn   mäta
//7      vacker  ett elstängsel   gå
//8      ljus    en dator röra
//9      mörk    ett golv   resa


public class Translator {
     //public int index;
     //public int wordClass;
     public String[][] glossary;
     public Translator(){
         glossary=fillGlossary();
     }
     
 
     private String[][] fillGlossary(){
         String[][] list={
              {"stor","en lönehöjning","springa"},
              {"liten","en lönesänkning","ljuga"},
              {"stark","en fotboja","flyga"},
              {"svag","en katt","se"},
              {"mjuk","en hund","vara"},
              {"hård","ett hus","äta"},
              {"snabb","ett barn","mäta"},
              {"vacker","ett elstängsel","gå"},
              {"ljus","en dator","röra"},
              {"mörk","ett golv","resa"},
            };
         return list;    
     }
     public String translate(int magicNum, int wordClass){
         String answer;
         //glossary=fillGlossary();
         answer=glossary[magicNum][wordClass];
         return answer;
        
     }
    
}
