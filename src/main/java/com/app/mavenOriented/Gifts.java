package com.app.mavenOriented;
import java.util.ArrayList;

public class Gifts {
    public static ArrayList<Integer> totalwt=new ArrayList<Integer>();
    public int getWeight(){
    	int totalweight=0;
    	for(int i=0;i<totalwt.size();i++){
    		totalweight+=totalwt.get(i);
    	}
    	return totalweight;
    }
	
}