/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateMappingEntity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Srikanth
 */
@Entity
@Table(name="emp")
public class Employee {
@Id
private String serialNo;
private String employeeNme;

    public Employee() {
    }

    public Employee(String serialNo, String employeeNme) {
        this.serialNo = serialNo;
        this.employeeNme = employeeNme;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getEmployeeNme() {
        return employeeNme;
    }

    public void setEmployeeNme(String employeeNme) {
        this.employeeNme = employeeNme;
    }

}
