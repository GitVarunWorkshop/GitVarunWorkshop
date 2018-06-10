package com.nt.test;

public class SampleApp {
	public static int sum(int x,int y){
		return x+y;
		}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("hello");
		  for(int i=1;i<=10;++i){
			System.out.println(i);
		}
		  System.out.println("add=="+SampleApp.sum(100,200));
		  WishGenerator generator= new  WishGenerator();
		  System.out.println("Msg::"+generator.generateWishMessage("raja"));
		  new ListCountries().displayCountries();
     //hi
		//hello
	}

}
