/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author DELL
 */
public abstract class BreadItemDecorator implements BreadItem {
    protected BreadItem breadItem;
    
    public BreadItemDecorator(BreadItem breadItem)
    {
        this.breadItem=breadItem;
    }
    
    /**
     *
     * @return
     */
    @Override
    public float cost()
    {
        return breadItem.cost();
    }
    
}
