package sn.ahmedgueye;

import sn.ahmedgueye.controller.Controller;

public class App 
{
    public static void main( String[] args )
    {
        Controller co = new Controller();
        co.insertData("Ousmane","Sembene",80);
        co.insertData("Aliou","Sall",44);
        co.insertData("Moussa","Mboup",52);
        co.insertData("Aissatou","Youm",20);
        co.insertData("Daba","Diouf",31);
        co.updateData(1,"Ahmed","Gueye",24);
        co.readData();

    }
}
