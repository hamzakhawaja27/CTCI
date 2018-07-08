package chapter5;

import java.util.ArrayList;

public class FlipBitToWin {
	
	public static int flipToWin(int item){
		if(item==-1) return Integer.BYTES*8;
		return longestSequence((AlternateSequence(item)));
	}
	

	public static ArrayList<Integer> AlternateSequence(int n){
		ArrayList<Integer> out = new ArrayList<Integer>();
		int currentSearch=0;
		int counter=0;
		
		for(int i=0;i<Integer.BYTES*8;i++){
			if((n & 1)!=currentSearch){
				out.add(counter);
				counter=0;
				currentSearch= n & 1;
			}

			counter++;
			n >>>= 1;
		}
		
		
		return out;
	}
	
	public static int longestSequence(ArrayList<Integer> input){
		int max=0;
		int max1=0;
		int zerolength;
		int OneRightLength;
		int OneLeftLength;
		
		for(int i=0;i<input.size();i+=2){
			zerolength=input.get(i);
			OneRightLength= i > 0 ? input.get(i-1) : 0;
			OneLeftLength= i < input.size()-1 ? input.get(i+1) : 0;
			
			if(zerolength==1){
				max1 = 1 + OneLeftLength + OneRightLength; 
			}
			else if(zerolength>1){
				max1 = 1 + Math.max(OneLeftLength, OneRightLength);
			}
			else if(zerolength==0){
				max1=Math.max(OneLeftLength, OneRightLength);
			}
			
			if(max<max1) max=max1;
			
		}
		
		
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(flipToWin(900));
	}

}
