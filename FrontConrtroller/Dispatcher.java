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
import java.util.HashMap;

public class Dispatcher {

    private HashMap<String, View> requestMap = new HashMap<>();
    private HashMap<String, View> errorMap = new HashMap<>();

    public void addRequestMapping(String viewName, View viewObject) {
        requestMap.put(viewName, viewObject);
    }

    public void addErrorMapping(String viewName, View viewObject) {
        errorMap.put(viewName, viewObject);
    }

    public void dispatchRequest(String request) {
        View requestView;
        if ((requestView = requestMap.get(request)) != null) {
            requestView.showView();
        } else if ((requestView = errorMap.get("NOPAGE")) != null) {
            requestView.showView();
        } else if ((requestView = errorMap.get("DEFAULT")) != null) {
            requestView.showView();
        }
    }
}
