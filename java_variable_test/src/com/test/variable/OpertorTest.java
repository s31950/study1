package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {

		//���׿�����
		int i=0; //������ int�� ����
		// ++i, i++
		i++; // ;�� ��ġ�� �ڿ��پ��־ ������ �ٷγ����⶧���� 1�� �������� ���´�

		System.out.println("i="+i); // i=1

		i--; // --i, i-- // ;�� ���Ʊ⶧���� 1�� ���ش�
		System.out.println("i-1="+i); // i-1=0

		//���������
		int x = 10, y = 2; //������ int�� ����
		char ch = 'A'; // �ƽ�Ű�ڵ�
		ch = 65; //

		int sum = x + y; // 10+2=12
		int sub = x - y; // 10-2=8
		int multi = x * y; // 10*2=20
		float div = x / (y * 1.0f); // 10/2=5 ������ float�� �Ǽ��϶� ���⶧���� 5.0(������ ��ü�̱⶧���� ���ʿ� ������Ѵ�)
		int mock = x / y; // ���� 5
		int namuji = x % y; // �������� 0

		int chSumInt = ch + 3; // ������ char�� 65�̰� 3������ 68�� �ƽ�Ű�ڵ�� D
		char chSumInt2 = (char) chSumInt;

		System.out.println("x+y=" + sum); // x+y=12
		System.out.println("x-y=" + sub); // x-y=8
		System.out.println("x*y=" + multi); // x*y=20
		System.out.println("x/y=" + div); // x/y=5.0
		System.out.println("��:x/y=" + mock); // x/y=5 (���� �ٸ����� ���� float������ �Ǽ����±� ������ �Ҽ����� �ٴ´�)
		System.out.println("������ : x/y=" + namuji); // x/y=0
		System.out.println("������ char + int =" + chSumInt2); // ������ char + int = D(�ƽ�Ű�ڵ�)

		// Quiz 1)
		// 1234.56789 �� ���� �Ҽ��� ��°�ڸ����� ��
		// �ø��Ͻÿ�.
		// hint)
		System.out.println((int) 1.452654);
		
		// Ǯ��
		
		// x=1234.56789
		// x*100=123456.789		
		
		System.out.println((int) 123456.789); // 123456
		
		//123456 + 1
		int A = 123457, B = 100;
		
		float div1 = (float)A / (float)B;
		
		System.out.println("A/B=" + div1);
		// �ٸ�Ǯ��
		float C = 1234.56789f;
		System.out.println(((int) (C * 100f + 0.5f)) / 100f);
		// ������
		float roundNum=1234.56789f;
		roundNum=((int)((roundNum+0.005f)*100f))/100f;
		
		System.out.println("��°�ڸ� �ݿø� : "+roundNum);
		
		//roundNum=((int)((roundNum+0.005f;)*100f))/100f;
		
		//System.out.println("��°�ڸ� �ݿø� : "+roundNum);
		
		//roundNum=(int)(roundNum*100f);
		//roundNum/=100f;
		
		
		

		System.out.println("x > y :" + (x > y)); // true 10>2 o
		System.out.println("x >= y :" + (x >= y)); // true 10>=2 o
		System.out.println("x < y :" + (x < y)); // false 10<2 x
		System.out.println("x <= y :" + (x <= y)); // false 10<=2 x
		System.out.println("x == y :" + (x == y)); // false 10=2 x
		System.out.println("x != y :" + (x != y)); // true 10!=2 o

		// ���׿�����
		// (���ǽ�) ? A(true) : B(false)
		int kor = 92; // �������� 92��

		System.out.println("�������� ���� :" + ((kor >= 90) ? "A " : "F")); // 90������ ���ų� ũ�� A�̱⶧���� 92������ A

		// ��������
		int k = 9; //������ int�� ����
		int l = 10; //������ int�� ����

		System.out.println(k >= 9 && (l = 11) > 10); // true (k>=9�� false�⶧���� �ڿ��Ŀ��� �ѹ��� Ȯ�����Ͽ� l�� 10�� �ƴ� 11���� ��µȴ�.)
		System.out.println(l); // l=11
		
		l = 10;

		System.out.println(k > 9 || (l = 11) > 10); // true (�̹����� k>9�� ���������ʱ⶧���� �ڿ��� Ȯ���� �ؿ� l=11 > 10 �� ���̱⿡ 11���� ���)
		System.out.println(l); // l=11
		
		// ���Կ�����

		int m = 0; // m�� 0
		m = m + 1; // m = 0 + 1; m = 1
		m = m + 1; // m = 1 + 1; m = 2
		m = m + 1; // m = 2 + 1; m = 3
		m = m + 1; // m = 3 + 1; m = 4 (m�� ó���� 0������ ����ؼ� 1�� �������� ���� 1�� �þ��)
		System.out.println("m=m+1 : " + m); // m�� ���� 1�� 4�� �þ���Ƿ� ���� 4���ȴ�
		
		
	}

}
