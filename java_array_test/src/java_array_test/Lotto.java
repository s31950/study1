package java_array_test;

public class Lotto {

	public static void main(String[] args) {
		int lottoNum[] = new int[45];

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i+1;
		}

		
		
		
		
		
		int tempNum = 0;
		int changeIndex = 0;

		for (int i = 0; i < lottoNum.length * 2; i++) {
			changeIndex = (int) (Math.random() * lottoNum.length);
			tempNum = lottoNum[changeIndex];
			lottoNum[changeIndex] = lottoNum[0];
			lottoNum[0] = tempNum;
		}
		

	/*학생3명의 이름과 국/영/수 점수를 입력받아 각각의 학생의 
	평균을 출력하는 프로그램을 작성하시오
	실행경과)
	1번         
	이름:kim
	국어:65
	영어:45
	수학:56
	1번 kim 평균 : 59점 ...등 3개를 만들어라
	*/
	
     String[][] studentArray=new String[3][4];
     Scanner scan = new Scanner(System.in);
     for(int num=1;num<studentArray.length+1;num++){}
    	 //입력
    	 for(int num=0;num<studentArray.length+1;num++){
    		 System.out.println(num+"번 학생");
    		 System.out.print("이름: ");
    		 studentArray[num][0]=scan.nextLine();
    		 System.out.print("국어: ");
    		 studentArray[num][1]=scan.nextLine();
    		 System.out.print("영어: ");
    		 studentArray[num][2]=scan.nextLine();
    		 System.out.print("수학: ");
    		 studentArray[num][3]=scan.nextLine();
    		 
    	 }
    	 
    	 //출력
    	 int total=0;
    	 for(int num=1;num<studentArray.length+1;num++){
    		 total = Integer.parseInt(studentArray[num][1])
    				 +Integer.parseInt(s)
    
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
	}

}
