/*
    ���ʵ��ѧ����Ϣ��¼��ʹ�ӡ
 */

import java.util.Scanner; 
 
public class StudentTest2 {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����ѧ����������ʹ�ñ�����¼
		System.out.println("������ѧ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.����ѧ��������׼����Ӧ��һά����
		// int[] arr = new int[3];  - ��ʾ����һ������Ϊ3Ԫ������Ϊint���͵�һά����
		// �����е�ÿ��Ԫ�ض���int���ͣ�Ҳ����˵�����е�ÿ��Ԫ�ض����Կ�����һ��int���͵ı�����ʹ���������ݽ��г�ʼ�� arr[0] = 10;
		// ����Ĵ���������һ������ΪnumԪ������ΪStudent���͵�һά����
		// �����е�ÿ��Ԫ�ض���Student���ͣ�Ҳ����˵�����е�ÿ��Ԫ�ض����Կ���Student���͵ı�����arr[0] = new Student();
		Student[] arr = new Student[num];
		
		
		// 3.��ʾ�û�����ÿ��ѧ������Ϣ(ѧ�� ����)����¼��һά������
		for(int i = 0; i < num; i++) {
			System.out.println("�������" + (i+1) + "��ѧ������Ϣ(ѧ�� ����)��");
			arr[i] = new Student(sc.nextInt(), sc.next());
		}
		
		System.out.println("-----------------------------------------------");
		// 4.��ӡ����ѧ����Ϣ
		System.out.println("�ð༶������ѧ����Ϣ�У�");
		for(int i = 0; i < num; i++) {
			//System.out.println(arr[i]);
			arr[i].show();
		}
	}
}