

import com.classes.*;

import java.util.ArrayList;
import java.util.List;

public class MeristMain {
    public static void main(String[] args) {





        Campus college = new Campus("Combia University","Texas","+1020-382");


        Course distributedSystems = new Course("CS001","Distributed Systems", "Jophery",100,35);
        Course systemDesign = new Course("CS002","System Design","Tom",60,30);
        Course highLevelDesign = new Course("CS003","High Level Design", "Jemi",100,35);
        Course lowLeveldesign = new Course("CS004","Low Level design","Cook",60,30);


        List<Course> classRoomCourses1 = new ArrayList<>();
        classRoomCourses1.add(distributedSystems);

        List<Course> classRoomCourses2 = new ArrayList<>();
        classRoomCourses2.add(systemDesign);

        List<Course> classRoomCourses3 = new ArrayList<>();
        classRoomCourses3.add(highLevelDesign);

        List<Course> classRoomCourses4 = new ArrayList<>();
        classRoomCourses4.add(lowLeveldesign);


        ClassRoom classRoom1 = new ClassRoom(101,1,30,classRoomCourses1);
        ClassRoom classRoom2 = new ClassRoom(402,4,90,classRoomCourses2);

        ClassRoom classRoom3 = new ClassRoom(603, 6, 100, classRoomCourses3);
        ClassRoom classRoom4 = new ClassRoom(404, 4, 200, classRoomCourses4);

        List<String> office1Employees = new ArrayList<>();
        office1Employees.add("John");
        office1Employees.add("Peter");

        List<String> office2Employees = new ArrayList<>();
        office2Employees.add("John");
        office2Employees.add("Peter");

        Office office = new Office(10, 302, office1Employees);
        Office office1 = new Office(20,  403,office2Employees);

        List<Room> building1Rooms  = new ArrayList<>();
        building1Rooms.add(classRoom1);
        building1Rooms.add(classRoom2);
        building1Rooms.add(office);

        List<Room> building2Rooms  = new ArrayList<>();
        building2Rooms.add(classRoom2);
        building2Rooms.add(classRoom3);
        building2Rooms.add(office1);

        Building buildingBlock53 = new Building(53, "Computer Research", 4, building1Rooms);
        Building buildingBlock55 = new Building(55, "Advanced Computer", 4, building2Rooms);



        college.addBuilding(buildingBlock53);
        college.addBuilding(buildingBlock55);



        for(int i = 0; i < college.getBuildings().size(); i++){
            Building building = college.getBuildings().get(i);
            System.out.println("Building Name "+building.getBuildingNumber());
            for(int j = 0; j < building.getRooms().size(); j++){
                Room room = building.getRooms().get(j);
                System.out.println(" Room No : "+room.roomNo() + " Room Type : "+ room.getRoomType());
                if(room.getRoomType().equals("ClassRoom")){
                    ClassRoom classRoom = (ClassRoom) room;
                    for(int k = 0; k < classRoom.getCourses().size(); k++){
                        System.out.println(classRoom.getCourses().get(k).getCourseName());
                    }
                }
            }
        }









    }
}