package com.yogesh.linecomparisoncomp;

public class Linecomparison {

		int x1 ;
		int y1 ;
		int x2 ;
		int y2 ;
		String line ;

		void setPoints(int x1 , int y1 , int x2 , int y2 )
		{
			this.x1 = x1 ;
			this.y1 = y1 ;
			this.x2 = x2 ;
			this.y2 = y2 ;
		}

		double length()
		{
			return Math.sqrt(Math.pow((this.x2 - this.x1) , 2) + Math.pow((this.y2 - this.y1) , 2));
		}

	 	public void checkEquality(Linecomparison linecomparison2) {
	 		if(this.length() == linecomparison2.length()) {
	 			System.out.println("Both Lines Are Same");
	 		}
	 		else
	 		{
	 			System.out.println("Lines Are  not Same");
	 		}
	 	}
	public static void main(String[] args)
	{

		 Linecomparison linecomparison1 = new  Linecomparison();
		 linecomparison1.setPoints(90, 50, 10, 20);

		 Linecomparison linecomparison2 = new  Linecomparison();
		 linecomparison2.setPoints(40, 50, 10, 20);

		 linecomparison1.checkEquality(linecomparison2);


	}


}
