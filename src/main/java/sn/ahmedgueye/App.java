package sn.ahmedgueye;

import sn.ahmedgueye.controller.Controller;

public class App 
{
    public static void main( String[] args )
    {
        Controller co = new Controller();
        //co.insertData("Daba","Diouf",31);
        //co.updateData(1,"Ahmed","Gueye",24);
        co.deleteData(4);
        co.deleteData(9);
        co.deleteData(14);
        co.deleteData(5);
        co.deleteData(10);
        co.deleteData(15);
        co.deleteData(6);
        co.deleteData(11);
        co.deleteData(7);
        co.deleteData(8);
        co.deleteData(12);
        co.deleteData(13);
        co.deleteData(17);
        co.deleteData(18);
        co.readData();

    }
}
