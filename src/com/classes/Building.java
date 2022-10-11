package com.classes;

import java.util.List;

public class Building {
    private int buildingNumber;
    private String buildingName;
    private int noOfFloors;
    private List<Room> rooms;

    public void addRoom(Room room){
        rooms.add(room);
    }
    public void removeRoom(Room room){
        rooms.remove(room);
    }
    public Room getRoomDetails(int roomNo){
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).roomNo() == roomNo){
                return rooms.get(i);
            }
        }
        return null;
    }

    public boolean checkRoomPresentInBuilding(int roomNo){
      for(int i = 0; i < rooms.size(); i++){
          if(rooms.get(i).roomNo() == roomNo){
              return true;
          }
      }
        return false;
    }

    public int totalBuildingCapacity(){
        int capacity = 0;
        for(Room room : rooms){
            capacity += room.getRoomCapacity();
        }
        return capacity;
    }


    public int getBuildingNumber() {
        return buildingNumber;
    }

    public Building(int buildingNumber, String buildingName, int noOfFloors, List<Room> rooms) {
        this.buildingNumber = buildingNumber;
        this.buildingName = buildingName;
        this.noOfFloors = noOfFloors;
        this.rooms = rooms;
    }


    public Building(int buildingNumber, String buildingName, int noOfFloors) {
        this.buildingNumber = buildingNumber;
        this.buildingName = buildingName;
        this.noOfFloors = noOfFloors;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Building() {
    }




}
