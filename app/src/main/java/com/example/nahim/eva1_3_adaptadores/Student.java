package com.example.nahim.eva1_3_adaptadores;

import java.util.ArrayList;

/**
 * Created by Nahim on 08/02/2018.
 */

public class Student {
    private int id;
    private String name;
    private boolean isPass;

    public Student(int id, String name, boolean isPass) {
        this.id = id;
        this.name = name;
        this.isPass = isPass;
    }
    ///////////////////////////////////
    //GETTERS                       
    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public boolean isPass() {
        return isPass;
    }
    ///////////////////////////////////

    @Override
    public String toString(){
        return name;
    }

    ///// METODO ARRAY-LIST //////////////////////////////
    public static ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));

        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        students.add(new Student(1,"Bernal",true));
        students.add(new Student(1,"Chavira",true));
        students.add(new Student(1,"De los Angeles",true));
        students.add(new Student(1,"Gallegos",true));
        students.add(new Student(1,"Herrera",true));
        students.add(new Student(1,"Marquez",true));
        students.add(new Student(1,"Rodriguez",true));
        return students;
    }
    //Fin del metodo ///////////////////////////////////////
}
