package org.edu;

public class Education extends Arts {
	
	public void ug() {
		
		System.out.println("UG Courses");
	}
	
	public void pg() {
		
		System.out.println("PG Courses");
	}

	public static void main(String[] args) {
		
		Education edu = new Education();
		
		edu.ug();
		edu.pg();
		
		edu.bsc();
		edu.bed();
		edu.ba();
		edu.bba();
		
		edu.be();
		edu.btech();
		
		edu.physiyo();
		edu.dental();
		edu.mbbs();	
	}

}
