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
public class VegetableRetailer implements BuyOrganicFood{
     public void buy(OrganicFood organicfood)
    {
        Vegetable vegetable=(Vegetable)organicfood;
        System.out.println("Delivering your"+vegetable.getClass().getName());
        vegetable.setStatus("purchased");
        System.out.println("Your "+vegetable.getClass().getName()+" delivered");
    }
}
