package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
		int sum = 0;
		
    	System.out.println("상품을 입력해주세요(종료 q)");
    	

    	while(true) { 
    		
    		String info = sc.nextLine();
    		
    		String[] gArray = info.split(",");
    		
    		if(info.equals("q")) {
    			break;
    		}
    		/*
    		Goods g01 = new Goods();
    		g01.setName(gArray[0]);
    		g01.setPrice(Integer.parseInt(gArray[1]));
    		g01.setCount(Integer.parseInt(gArray[2]));
    		*/
    		String name = gArray[0];
    		int price = Integer.parseInt(gArray[1]);
    		int count = Integer.parseInt(gArray[2]);
    		
    		Goods goods = new Goods(name, price, count);
    		gList.add(goods);
    		
    		sum = sum + count; 
    		
    	}
    	
    	System.out.println("[입력완료]");
    	System.out.println("=====================");
    	
    	for(Goods g : gList) {
    		g.showInfo();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + sum + " 개입니다.");
    	
    	sc.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
