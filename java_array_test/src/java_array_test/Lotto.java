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
		

	/*�л�3���� �̸��� ��/��/�� ������ �Է¹޾� ������ �л��� 
	����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	������)
	1��         
	�̸�:kim
	����:65
	����:45
	����:56
	1�� kim ��� : 59�� ...�� 3���� ������
	*/
	
     String[][] studentArray=new String[3][4];
     Scanner scan = new Scanner(System.in);
     for(int num=1;num<studentArray.length+1;num++){}
    	 //�Է�
    	 for(int num=0;num<studentArray.length+1;num++){
    		 System.out.println(num+"�� �л�");
    		 System.out.print("�̸�: ");
    		 studentArray[num][0]=scan.nextLine();
    		 System.out.print("����: ");
    		 studentArray[num][1]=scan.nextLine();
    		 System.out.print("����: ");
    		 studentArray[num][2]=scan.nextLine();
    		 System.out.print("����: ");
    		 studentArray[num][3]=scan.nextLine();
    		 
    	 }
    	 
    	 //���
    	 int total=0;
    	 for(int num=1;num<studentArray.length+1;num++){
    		 total = Integer.parseInt(studentArray[num][1])
    				 +Integer.parseInt(s)
    
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
	}

}
