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
public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle(10,10,20);
        System.out.println(circle);
        CircleTransfer circletransfer=circle.getCircleTransferObject();
        CircleDAO circleDAO=DAOFactory.getCircleDAO("RDBMS");
        circleDAO.insertCircle(circletransfer);
    }
}
