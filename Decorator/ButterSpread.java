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
public class ButterSpread extends BreadItemDecorator {

    public ButterSpread(BreadItem breadItem) {
        super(breadItem);
    }
    @Override
    public float cost()
    {
        return breadItem.cost()+5;
    }
}
