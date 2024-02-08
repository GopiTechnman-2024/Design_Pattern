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
public class Client {
private FilterManager filterManager;
public void setFilterManager(FilterManager filterManager){
this.filterManager=filterManager;
}
public void sendRequest(String request){
filterManager.filterRequest(request);
}
}