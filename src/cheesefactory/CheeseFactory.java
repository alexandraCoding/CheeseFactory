/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheesefactory;

/**
 *
 * @author alexa
 */
public class CheeseFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cheese cheese1=CheseFactory.createCheese(Cheese.AMFILOHIA);
      cheese1.eat();
      Cheese cheese2=CheseFactory.createCheese(Cheese.KALAMATA);
      cheese2.eat();
      Cheese cheese3=CheseFactory.createCheese(Cheese.PINDOS);
      cheese3.eat();
      
        
    }
    
}
