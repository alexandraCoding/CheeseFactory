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
public class CheseFactory {

    public  static Cheese createCheese(String type) {
        if (type.equals(Cheese.AMFILOHIA)) {
            return new Amfilohia(7, "spicy", "hard");
            }else if (type.equals(Cheese.KALAMATA)) {
               return new Kalamata(8,"Sweet","Neutral");
                    } else if (type.equals(Cheese.PINDOS)) {
                        return new Pindos(6,"Neutral","Soft");
                    } else {
                      return null;
            
        }

    }
}