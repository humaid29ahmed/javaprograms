import java.io.*;
class VechicleDemo
{ //main method for class vechile
  public static void main(String args[])
  {
    int range;
    vechicle minivan=new vechicle(); //creation of object of class vechicle
    minivan.passengers=5;
    minivan.fuelcap=16;             // assigned value for 3 data
    minivan.mpg=21;
    range=minivan.fuelcap*minivan.mpg; // calculate the range of the vechile
    System.out.println("Minivan can carry: "+minivan.passengers +"\n"+"Minivan range :"+range);
  }
}
class vechicle
{
 int passengers;//size of the car
 int fuelcap;  //data of fuelcap
 int mpg;      // data of miles per gallon
}
