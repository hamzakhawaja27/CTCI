package chapter1;

public class RotationString {
	
	public static boolean isSubstring(String x,String y){	
		
		for(int i=0;i<x.length()-y.length();i++){
			if(x.substring(i, i+y.length()).equals(y)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean MYisRotation(String x,String y){
		
		if(x.length()==y.length()){
			int count=0;
			while(count<x.length()){
				String q = x.substring(0,1);
				String z=x.substring(1, x.length()).concat(q);
				if(z.equals(y)){
					return true;
				}
				x=z;
				count++;
			}
		}
		return false;
	}
	
	public static boolean isRotation(String x,String y){
	
		String xx=x.concat(x);
		if(isSubstring(xx, y)){
			return true;
		}
	return false;
	}
	
	public static void main(String[] args){
		String x="waterbottle";
		String y="erbottlewat";
		
		System.out.println(MYisRotation(x,y));
		System.out.println(isRotation(x,y));
	}
	
}
