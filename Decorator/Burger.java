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
public class Burger implements BreadItem{

    /**
     *
     * @return
     */
    @Override
    public float cost()
    {
        return 40;
    }
}
