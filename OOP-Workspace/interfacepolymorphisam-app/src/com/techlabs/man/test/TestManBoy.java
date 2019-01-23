package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotionable;
import com.techlabs.man.IMannerable;
import com.techlabs.man.Man;

public class TestManBoy {

	public static void main(String[] args) {
		Man man=new Man();
		Boy boy=new Boy();
		
		atTheParty(man);
		atTheParty(boy);
		
		atTheMovies(boy);
		//atTheMovies(man);//compile time error
		
	}
	public static void atTheParty(IMannerable manner) {
		System.out.println("At the party ");
		manner.wish();
		manner.depart();
	}
	public static void atTheMovies(IEmotionable emotional) {
		System.out.println("At the Movie ");
		emotional.cry();
		emotional.laugh();
	}

}
