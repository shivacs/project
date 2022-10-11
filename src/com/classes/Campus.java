package com.classes;

import java.util.ArrayList;
import java.util.List;

public class Campus {
    private String campusName;
    private String address;
    private String phone;
    private List<Building> buildings;

    public Campus(){
        buildings = new ArrayList<>();
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public void removeBuilding(Building building){
        buildings.remove(building);
    }


    private Building getBuildingByBuildingNumber(int number){
        for(Building building : buildings){
            if(building.getBuildingNumber() == number){
                return building;
            }
        }
        return null;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public Campus(String campusName, String address, String phone) {
        this.campusName = campusName;
        this.address = address;
        this.phone = phone;
        this.buildings = new ArrayList<>();
    }
}
