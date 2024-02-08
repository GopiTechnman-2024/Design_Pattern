/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontConrtroller;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println(new Date() + " # Page requested : " + request);
    }

    public void dispatchRequest(String request) {
// Log each incoming request
        trackRequest(request);
//authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatchRequest(request);
        }
    }
}
