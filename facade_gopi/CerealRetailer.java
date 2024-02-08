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
public class CerealRetailer implements BuyOrganicFood{
    
    public void buy(OrganicFood organicfood)
    {
         Cereal cereal=(Cereal)organicfood;
        System.out.println("Delivering your"+cereal.getClass().getName());
        cereal.setStatus("purchased");
        System.out.println("Your "+cereal.getClass().getName()+" delivered");
    }
}
