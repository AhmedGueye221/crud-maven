package sn.ahmedgueye;

import sn.ahmedgueye.controller.Controller;

public class App 
{
    public static void main( String[] args )
    {
        Controller co = new Controller();
        co.insertData("Pape Sidi","Fall",37);
        co.readData();

    }
}
