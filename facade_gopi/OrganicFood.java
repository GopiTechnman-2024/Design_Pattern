/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_gopi;

/**
 *
 * @author DELL
 */
public class OrganicFood {
    private String name;
    private String status;
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status){
        this.status=status;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
}
