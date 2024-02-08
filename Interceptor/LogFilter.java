/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class LogFilter implements Filter{
@Override
public void execute(String request) {
System.out.println(new Date()+ " # Logging request : "+ 
request);
} 
}