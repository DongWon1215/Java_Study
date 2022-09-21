public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] sd = new Student[10];
		String[] name = {"³ª","³Ê","±×","°Â","À÷","¾ê","±×","´ì","´Ô","¾¾"};
		
		for(int i = 0; i < sd.length; i++)
		{
			Student st = new Student(name[i],(int)(Math.random() * 101),(int)(Math.random() * 101),(int)(Math.random() * 101));
//			st.setName(name[i]);
//			st.setKoreanScore((int)(Math.random() * 101));
//			st.setEnglishScore((int)(Math.random() * 101));
//			st.setMathScore((int)(Math.random() * 101));
			
			sd[i] = st;
		}
		
		int korTotalScore = 0;
		int engTotalScore = 0;
		int mathTotalScore = 0;
		
		System.out.println("¼ºÀûÇ¥");
		System.out.println("====================================================");
		System.out.println("ÀÌ¸§\t±¹¾î\t¿µ¾î\t¼öÇÐ\tÃÑÁ¡\tÆò±Õ");
		System.out.println("====================================================");
		for(Student obj : sd)
			{
				korTotalScore += obj.getKoreanScore();
				engTotalScore += obj.getEnglishScore();
				mathTotalScore += obj.getMathScore();
				System.out.println(obj.toString());
			}
		System.out.println("====================================================");
		
		System.out.printf("°ú¸ñ ÃÑÁ¡\t" + korTotalScore + "\t"+ engTotalScore + "\t"+ mathTotalScore +" \n");
		System.out.printf("°ú¸ñ Æò±Õ\t%.2f\t%.2f\t%.2f\n",korTotalScore / 10f, engTotalScore / 10f, mathTotalScore / 10f);
		System.out.printf("ÀüÃ¼ Æò±Õ\t" + (float)(korTotalScore+engTotalScore+mathTotalScore)/30 + "\n");
	}

}
