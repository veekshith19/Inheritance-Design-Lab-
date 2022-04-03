package Inheritancedesignlab;
public class HospitalEmployee {
protected String name;
protected int number;
 HospitalEmployee(String name, int number)
{
	this.name=name;
	this.number=number;
	}
 public String getName() { return name;
 }
 public int getNumber() { return number;
 }

 public void setName(String N)
 {

     // This keyword refers to current instance itself
     this.name = N;
 }
 public void setNumber(int num)
 {

     // This keyword refers to current instance itself
     this.number = num;
 }

}
