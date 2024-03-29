/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author DELL
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentname() {
        return model.getName();
    }

    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }

    public int getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.displayDetails(model.getName(), model.getRollNo());
    }
}
