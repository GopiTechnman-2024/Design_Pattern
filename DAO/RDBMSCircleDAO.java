/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author DELL
 */
public class RDBMSCircleDAO implements CircleDAO{

    @Override
    public void insertCircle(CircleTransfer circle) {
        System.out.println("insertCircle implementation");
    }
    @Override
    public CircleTransfer findCircle(int id) {
       return null;
    }

    @Override
    public void deleteCircle(int id) {
       
    }
    
}
