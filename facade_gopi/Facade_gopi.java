/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_gopi;

/**
 *
 * @author DELL
 */
public class Facade_gopi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        OrganicFoodWebsite organicfoodWebsite=new OrganicFoodWebsite();
        Vegetable v1=new Vegetable();
        v1.setName("Cabbage");
        v1.setStatus("shipping");
        Cereal c1=new Cereal();
         c1.setName("Wheat");
        c1.setStatus("shipping");
        System.out.println("Organic Food status:");
        System.out.println(v1.getName()+" is "+v1.getStatus());
        System.out.println(c1.getName()+" is "+c1.getStatus());
        System.out.println("Organic foods are sent for delivery");
         organicfoodWebsite.buyCereal(c1);
         organicfoodWebsite.buyVegetable(v1);
         System.out.println("OrganicFood status after delivery:");
         System.out.println("you have purchased "+v1.getStatus());
         System.out.println("you have purchased "+c1.getStatus());
    }
    
}
