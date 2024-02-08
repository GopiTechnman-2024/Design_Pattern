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

//Facade class
public class OrganicFoodWebsite {
    private BuyOrganicFood vegetableRetailer;
    private BuyOrganicFood cerealRetailer;
    
    public OrganicFoodWebsite()
    {
        vegetableRetailer=new VegetableRetailer();
        cerealRetailer=new CerealRetailer();
    }
    public void buyVegetable(Vegetable vegetable)
    {
        vegetableRetailer.buy(vegetable);
    }
    
    public void buyCereal(Cereal cereal)
    {
        cerealRetailer.buy(cereal);
    }
}
