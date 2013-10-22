package org.getopt.util.hash;

public class Usage {

	public static void main(String[] args) {
		String[] strArr = {"Pizza","Pizzeria","Pizzo","Pizsa","Pissa","Pizza Hut"};
		FNV1a32 hashGen = new FNV1a32(); 
		for(String str: strArr){
			hashGen.update(str);
			System.out.println(hashGen.getHash());
		}

	}

}
