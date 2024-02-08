/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone;

/**
 *
 * @author DELL
 */
public class Test {
public static void main(String[] args) {
Logger logger1=Logger.getInstance();
Logger logger2=Logger.getInstance();
System.out.println("Object references:\nlogger1="+logger1+"\nlogger2="+logger2);
}
}
