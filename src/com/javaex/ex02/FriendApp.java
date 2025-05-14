package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Friend> fArray = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");

    	for(int i=0; i<3; i++) {
    		
    		
    		String info = sc.nextLine();
    		
    		String[] f = info.split(" ");
    		
    		String name = f[0];
    		String hp = f[1];
    		String school = f[2];
    		
    		Friend fri = new Friend(name, hp, school);
    		fArray.add(fri);
    		
    	}
    	
    	for(int i=0; i<3; i++) {
    		fArray.get(i).showInfo();
    	}
    
    	
    	sc.close();
    	
    	
    }

}
