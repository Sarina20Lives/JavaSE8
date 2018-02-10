public class TestClass{
	public static void main (String args[]){
		int x=4, y=9;
		if(y/x<3)
			x+=y;
		else
			x*=y;
		System.out.println("After if stmt, x = " + x);

		x = ((y/x)<3)?(x+=y):(x*=y);
		System.out.println("After ternary op, x = " + x);

		dayInMonths(1, false);
		dayInMonths(2, false);
		dayInMonths(3, false);
		dayInMonths(4, false);
		dayInMonths(5, false);
		dayInMonths(6, false);
		dayInMonths(7, false);
		dayInMonths(8, false);
		dayInMonths(9, false);
		dayInMonths(10, false);
		dayInMonths(11, false);
		dayInMonths(12, false);
	}

	public static void dayInMonths(int month, boolean isLeapYear){
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			System.out.println("31 days in the months");
		}else{
			if(month == 2){
				if(isLeapYear){
					System.out.println("28 days in the month");
				}else{
					System.out.println("29 days in the month");
				}		
			}else{
				if(month==4 || month==6 || month == 9 || month == 11){
					System.out.println("30 days in the month");
				}
			}
		}

	}
}
