package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Friend> fArray = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	Friend f01 = new Friend();
    	Friend f02 = new Friend();
    	Friend f03 = new Friend();
    	
    	
    	fArray.add(f01);
    	fArray.add(f02);
    	fArray.add(f03);
    	//////////////한 줄에 공백 입력되게 다시 하기
    	f01.setName(sc.nextLine());
    	f01.setHp(sc.nextLine());
    	f01.setSchool(sc.nextLine());
    	
    	f02.setName(sc.nextLine());
    	f02.setHp(sc.nextLine());
    	f02.setSchool(sc.nextLine());
    	
    	f03.setName(sc.nextLine());
    	f03.setHp(sc.nextLine());
    	f03.setSchool(sc.nextLine());

    	for(int i=0; i<fArray.size(); i++) {
    		fArray.get(i).showInfo();
    	}
    
    	
    	sc.close();
    	
    	
    }

}
