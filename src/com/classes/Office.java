package com.classes;

import java.util.List;

public class Office implements Room {
    private int officeCapacity;

    private int officeRoomNo;
    private List<String> officeEmployees;


    public void addEmployee(String employee){
        officeEmployees.add(employee);
    }
    public void removeEmployee(String employee){
        officeEmployees.remove(employee);
    }

    public boolean checkIfEmployeeIsPresent(String employee){
        for(int i = 0; i < officeEmployees.size(); i++){
            if(officeEmployees.get(i).equals(employee)){
                return true;
            }
        }
        return false;
    }

    public int getAvailableSeats(){
        return this.officeCapacity - officeEmployees.size();
    }


    @Override
    public String getRoomType() {
        return "Office";
    }

    @Override
    public int getRoomCapacity() {
        return this.officeCapacity;
    }

    @Override
    public int roomNo() {
        return officeRoomNo;
    }

    public int getOfficeCapacity() {
        return officeCapacity;
    }

    public void setOfficeCapacity(int officeCapacity) {
        this.officeCapacity = officeCapacity;
    }

    public int getOfficeRoomNo() {
        return officeRoomNo;
    }

    public void setOfficeRoomNo(int officeRoomNo) {
        this.officeRoomNo = officeRoomNo;
    }

    public List<String> getOfficeEmployees() {
        return officeEmployees;
    }

    public void setOfficeEmployees(List<String> officeEmployees) {
        this.officeEmployees = officeEmployees;
    }

    public Office(int officeCapacity, int officeRoomNo, List<String> officeEmployees) {
        this.officeCapacity = officeCapacity;
        this.officeRoomNo = officeRoomNo;
        this.officeEmployees = officeEmployees;
    }
}
