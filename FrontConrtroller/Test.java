/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontConrtroller;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Creating dispatcher");
        Dispatcher dispatcher = new Dispatcher();
        System.out.println("Initialize Pages");
        dispatcher.addRequestMapping("STUDENT", new StudentView());
        dispatcher.addRequestMapping("FACULTYMEMBER", new FacultyMemberView());
        System.out.println("Initialize Error Pages");
        dispatcher.addErrorMapping("DEFAULT", new DefaultView());
        dispatcher.addErrorMapping("NOPAGE", new NoPageErrorView());
        FrontController frontController = new FrontController(dispatcher);
        System.out.println("Sending request for page: STUDENT");
        frontController.dispatchRequest("STUDENT");
        System.out.println("Sending request for page: FACULTYMEMBER");
        frontController.dispatchRequest("FACULTYMEMBER");
        System.out.println("Sending request for page: DOCTOR");
        frontController.dispatchRequest("DOCTOR");
    }
}
