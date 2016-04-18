package homeworkassignment17;

public class Driver 
{
	public static void main(String[] args)
	{
		int s = 17;
		int g = 15;
		System.out.println(Driver.decToBase(s, g));
	}
	
	// converts integers to characters
	static char intToChar(int c)
	{
		String s = c + "";
		return (char) "0123456789ABCDEFGHIJKLMNOPQRSTEVWXYZ".indexOf(s);
	}
	
//  converts decimal answers to base answers
	static int decToBase (int number, int radix)
	{
		int currentValue = number;
		char that = 0;
		int counter = currentValue%radix; //14/8 = 1 r [6]
		for (int finalValue = currentValue; currentValue > 0; finalValue = (finalValue + currentValue)*10)
		{
			currentValue = currentValue / radix; // 14/8 = [1] r 6
			that = (char) ((that + intToChar(currentValue))*10);
		}
		return (that + 10*counter)/10;
	}

	static int stringToInt(String s)
	{
		int place = 1;
		int total = 0;
		char currChar;
		for(int i = s.length()-1; i >= 0; i--)
		{
			currChar = s.charAt(i);
			if(currChar == '-')
			{
				return total * -1;
			}
			else
			{
				total += (Driver.charToInt(currChar) * place);
				place *= 10;
			}
		}
		return total;
	}
	static int charToInt(char c)
	{
		return "0123456789".indexOf(c);
	}
	

}
