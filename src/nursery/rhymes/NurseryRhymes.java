/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        farm("cow", "moo");
        farm("duck", "quack");
        farm("pig", "oink");
        farm("bird", "chirp");
        farm("horse", "hdsifij");
        // TODO: add another animal to the farm here
        hickory_dickory(1);
        hickory_dickory(2);
        // TODO: make the clock strike three here
        
        // TODO: call your new methods here ( you must write them first! ) 
        monkeys(10);
        monkeys(9);
        monkeys(8);
        monkeys(7);
        monkeys(6);
        monkeys(5);
        monkeys(4);
        monkeys(3);
        monkeys(2);
        monkeys(1);
        
    }
    
    
    
    public static void farm(String animal, String sound){
        // TODO: write your code here
      System.out.println("Old McDonald had a farm");
      System.out.println("eieieio e-i-e-i-o");
      System.out.println("And​ ​on​ ​that​ ​farm​ ​he​ ​had​ ​a " + animal + " e-i-e-i-o");
      System.out.println("with a " + sound + " " + sound +" here");
      System.out.println("                                       ");
        
        
    }
    
    public static void monkeys(int number){
        // TODO: write your code here
    System.out.println(number+" little monkeys jumping on the bed");
    }
    
    public static void hickory_dickory(int time){
        // TODO: write your code here
    System.out.println("hickory dickory dock");
    System.out.println("The mouse ran up the clock");
    System.out.println("The clock struck" + time+"");
    System.out.println("                                    ");
    }
    
    // TODO add your new methods here
    
}
