package chapter1;
import java.util.HashMap;

public class AllUnique1_1 {

	public static boolean checkDataUse(String input){
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (char c:input.toCharArray()){
			
			if(map.containsKey(c)){
				return false;
			}
			else{
				map.put(c, 1);
			}
		}
		return true;
	}
		
	public static boolean check(String input){
		
		boolean[] arr=new boolean[256];
		
		for (char c:input.toCharArray()){
		
			if(arr[Character.valueOf(c)]) return false;
			arr[Character.valueOf(c)]=true;
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println(checkDataUse("arsl"));
		System.out.println(check("arslan"));

		
}

}