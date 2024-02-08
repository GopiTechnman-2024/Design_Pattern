/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

/**
 *
 * @author DELL
 */
public class Test {
public static void main(String[] args) {
FilterManager filterManager=new FilterManager(new Target());
filterManager.addFilter(new AuthenticationFilter());
filterManager.addFilter(new LogFilter());
Client client=new Client();
client.setFilterManager(filterManager);
client.sendRequest("STUDENT");
client.sendRequest("FACULTYMEMBER");
}
}
