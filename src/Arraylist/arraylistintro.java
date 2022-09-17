package Arraylist;

import java.awt.List;
import java.util.ArrayList;

// creating a arraylist
//syntax

//List<String> arraylistname = new ArrayList<>(2);

public class arraylistintro {

	public static void main(String[] args) {
		 ArrayList<String> cityList = new ArrayList<>(2);
		 cityList.add("London");
		 cityList.add("Paris");
		 cityList.add("Bangalore");
		 // With index
		 cityList.add(3, "Istanbul");
		 for(String name : cityList){
		 System.out.println("City Name - " + name);

	}

}
}
