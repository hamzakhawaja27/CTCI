package chapter5;

public class DrawLine {
	
	public void drawLine(byte[] screen, int width, int x1, int x2, int y){
		int row=(width/8) * y;
		int FirstFullByte = x1 / 8;
		int FirstPartial = x1 % 8;
		if(FirstPartial != 0){
			FirstFullByte++;
		}
		
		int LastFullByte = x2 / 8;
		int LastPartial = x2 % 8;
		
		if(LastPartial!=7){
			LastFullByte--;
		}
		
		for(int i=FirstFullByte; i <=LastFullByte ; i++ ){
			screen[row + i] = (byte) 0xFF;
			
		}
		
		byte mask1 = (byte) ( 0xFF >> (FirstPartial)); 
		byte mask2 = (byte)~(0xFF >> (LastPartial));
		
		if(x1/8 == x2/8){
			byte mask=(byte) (mask1 & mask2);
			screen[row + (x1/8)] = (byte) (screen[row + (x1/8)] | mask);	
			}
		
		else{
			if(FirstPartial!=0){
				screen[row + (x1/8)] |=mask1;
			}
			
			if(LastPartial!=7){
				screen[row + (x2/8)] |=mask2;
			}
			

		}
				
	}
	
}
