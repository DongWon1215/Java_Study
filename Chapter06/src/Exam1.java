
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] scores = new int[10][3];
			
			for(int i = 0; i < scores.length; i++)
			{
				for(int j = 0; j < scores[0].length; j++)
					scores[i][j] = (int)(Math.random() * 51) + 50;
			}
			

			System.out.println("======================================================================");
			
			for(int i = 0; i < scores.length; i++)
			{
				int total = 0;
				
				for(int j = 0; j < scores[i].length; j++)
					{
						System.out.print(scores[i][j] + "\t");
						total += scores[i][j];
					}

				System.out.print(total + "\t" + (float)total/scores[i].length);
				//System.out.println("======================================================================");
				System.out.println();

				int korTotal = 0, engTotal = 0, mathTotal = 0;
				
				for(int j = 0; j < scores[i].length; j++)
					{
						if(j == 0)
							korTotal += scores[i][j];
						if(j == 1)
							engTotal += scores[i][j];
						if(j == 2)
							mathTotal += scores[i][j];

						System.out.print(korTotal + "\t" + engTotal + "\t" + mathTotal);
					}


				System.out.println();
				System.out.println("======================================================================");
			}
	}

}
