package com.gla.workshop;

class SoftwareEngineer implements employee {

    public String getName() {
        return "Software Engineer";
    }
}

public class functionalinterfacee {
    static void main(String[] args) {

        employee obj = () -> "SoftwareEngineer";
        System.out.println(obj.getName());

        employee obj2 = () -> "Doctor";
        System.out.println(obj2.getName());

        employee obj3 = () -> "MechanicalEngineer";
        System.out.println(obj3.getName());

        employee obj4 = () -> "Pilot";
        System.out.println(obj4.getName());
    }

}
