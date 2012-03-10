import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class aToi {
	aToi(){
		
	}
	public static void main(String[] args){
		
		aToi a1 = new aToi();
		System.out.println("Enter input number in string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String num = br.readLine();
			int result = a1.convertStringToInt(num);
			System.out.println("The converted output is "+result);
		}
		catch(IOException ex){
			
		}
		}
	
	int convertStringToInt(String num){
		int result=0;
		int zeroAscii='0';
		//System.out.println("The ascii value of 0 is "+zeroAscii);
		int nineAscii='9';
		//System.out.println("The ascii value of 9 is "+nineAscii);
		
		for(char c: num.toCharArray()){
			if(c>=zeroAscii && c<=nineAscii){
				result=result*10+(c-zeroAscii);
			}else
				return -1;
		}
		return result;
	}
}
