package returningValue;

public class highscore {
	public static void main(String[]args){
		int highscore = calculatedhighscore(1500);
		displayhighscore("kishan" , highscore);
		
		 highscore = calculatedhighscore(900);
		displayhighscore("ram" , highscore);
		
		 highscore = calculatedhighscore(400);
		displayhighscore("sita" , highscore);
		
		 highscore = calculatedhighscore(50);
		displayhighscore("gita" , highscore);
		
	}
	public static void displayhighscore(String playername, int highscore){
		System.out.println(playername +
				+highscore);
		
	}
	public static int calculatedhighscore(int playerscore){
		if (playerscore>1000){
			return 1;
			
		} else if (playerscore>500 && playerscore<1000){
			return 2;
		}else if (playerscore>100 && playerscore<500){
			return 3;
		}else{
			return 4;
		}
	}

}
