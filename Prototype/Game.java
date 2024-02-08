/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author DELL
 */
public abstract class Game implements Cloneable {
    private String id;
    protected String type;
    abstract void render();
    
    public String getId()
    {
        return id;
    }
     public String getType()
    {
        return type;
    }
     
    /**
     *
     * @param id
     */
    public void setId(String id)
    {
        this.id=id;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Object clone=null;
        clone=super.clone();
        return clone;
    }
     
}
