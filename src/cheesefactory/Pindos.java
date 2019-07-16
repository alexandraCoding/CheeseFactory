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
public class Pindos implements Cheese{
    private int price;
    private String flavour;
    private String type;
    
    public Pindos(int price,String flavour,String type){
        this.price=price;
        this.flavour=flavour;
       this.type=type;
    }

    @Override
    public void eat() {
        System.out.println("This Pindo's type cheese is great, so eat it with bread");    }
    }

   
    

