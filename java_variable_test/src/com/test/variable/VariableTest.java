package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor; // �������� 90��
		int eng; // �������� 80��
		int math; // �������� 100��

		// Quiz 3)
		// �ԷµǴ� ���� 0~100������ ������ ����;
		// '����Ͻðڽ��ϴ�?(y/n)' �޼����� ����ϰ�
		// 'n' �϶����� �ݺ�.

		System.out.print("�������� : ");
		kor = Integer.parseInt(scan.nextLine()); // kor=scan.nextLine(); ��Ʈ����
													// ���ڿ��� �޶� �ڴ� ���ڿ��ε� ����
													// ��Ʈ���̶� ������
		System.out.print("�������� : ");
		eng = Integer.parseInt(scan.nextLine());
		System.out.print("�������� : ");
		math = Integer.parseInt(scan.nextLine());

		int total = kor + eng + math; // ���� 90+80+100 = 270

		float avg = total / 3;

		// ���� ������ ������� �ϸ� ��������̹Ƿ� 270/3 = 90��
		// ������� float�� ���� ������ ������� ������ �������� �����¼��� �ʹ� ũ�⶧���� �Ҽ����� ì������� float�� ��

		System.out.println("���� : " + total); // ���� 270��
		System.out.println("��� : " + avg); // ��� 90.0

		// Quiz 2)
		// ����� 90�̻� : A
		// ����� 80�̻� : B
		// ����� 80�̸� : F
		// �� ����Ͻÿ�.

		char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F'); // �������� �ƴ϶�
																	// ĳ������
		System.out.println("���� : " + grade);

		String gradeIf = "";
		if (avg >= 90) {
			gradeIf = "A";
			if (avg >= 95) {
				gradeIf = gradeIf + "+";
			}
		} else if (avg >= 80) {
			gradeIf = "B";
			if (avg >= 85) {
				gradeIf = gradeIf + "+";
			}
		} else {
			gradeIf = "F";
		}

		System.out.println("���� : " + gradeIf);

		int avg1 = 85; // ��� ����

		System.out.println("��� ���� : " + ((avg1 >= 90) ? "A " : ((avg1 >= 80) ? "B" : "F")));

		// 90���� ũ�ų������� A, 90���� �۰� 80���� ũ�ų������� B, 80���� ������ F

	}

}
