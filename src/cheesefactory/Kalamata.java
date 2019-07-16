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
public class Kalamata implements Cheese{
     private int price;
    private String flavour;
    private String type;
    
    public Kalamata(int price,String flavour,String type){
        this.price=price;
        this.flavour=flavour;
       this.type=type;
    }

    @Override
    public void eat() {
        System.out.println("This Kalamata's type cheese is awful, dont eat it");    }
    }

  

