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
public class FoodTest {
    public static void main(String[] args) {
        System.out.println("Price of SandWich:"+new SandWich().cost());
        System.out.println("Price of Burger:"+new Burger().cost());
        System.out.println("Price of SandWich with butter spread:"+new ButterSpread(new SandWich()).cost());
        BreadItem burger=new Burger();
        BreadItem burgerWithCheeseSpread=new CheeseSpread(burger);
        BreadItem burgerWithCheeseAndButterSpread=new ButterSpread(burgerWithCheeseSpread);
        System.out.println("Price of burger with Cheese and butter spread:"+burgerWithCheeseAndButterSpread.cost());
    }
   
}
