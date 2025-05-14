package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	//스캐너
    	
    	//추상 클래스 List<Goods> gList = new ArrayList<Goods>();
    	
    	//sum = 0;
    	
    	//입력 (String, int, int) --> String으로 변경
    	
    	
    	//상품을 입력해주세요(종료q)
    	
    	
    	//for문
    	//입력 시 "," 기준 배열 등록
    	
    	//사용자 입력
    	
    	//if (배열이 3개가 아닐 때)
    	
    	
    	//else if(입력한 문자가 q일 때 종료)
    	// 모든 상품의 갯수 => sum = sum + gList.get(i).getCount();
    	//입력 완료 --> ======= --> showInfo --> sum
    	//Goods
    	//배열에 setName, setPrice, setCount 넣기
    	
    	//sc.close();
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
		int sum = 0;
		
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	
    	for(int i=0; i<gList.size(); i++) {
        	String info = sc.nextLine();
        	String[] con = info.split(",");
        	
    		if(con.length != 3) {
        		
    		}else if(con.equals("q")){
    			
    			sum = sum + gList.get(i).getCount();
    			
    			System.out.println("입력완료");
    			System.out.println("=================");
    			gList.get(i).showInfo();
    			System.out.println("모든 상품의 갯수는" + sum);
    		
    		}
    		
    		Goods g01 = new Goods();
    		g01.setName(con[0]);
    		g01.setPrice(Integer.parseInt(con[1]));
    		g01.setCount(Integer.parseInt(con[2]));
    		
    	} 	
    	
    	sc.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
