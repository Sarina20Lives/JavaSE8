package com.nabenik.inmutable;
public class TalkAboutString{
	public static void main (String[] args){
		//String name = "Sarina";
		//name = new String("Esvin");	
		//System.out.println(name);

		String custName = "Steve Smith";
		String firstName = "";
		int spaceIdx;
		
		spaceIdx = custName.indexOf(' ');
		if(spaceIdx >= 0)
			firstName = custName.substring(0, spaceIdx);
		System.out.println(firstName);

		StringBuilder sb = new StringBuilder(firstName);
		sb.append(" Smith");
		System.out.println(sb.toString());



	}


}
