/*
    ���ʵ�ֲ������ݵĲ��� 
 */
public class ArgumentTest {
	
	// �Զ����Ա������ӡ�����������������
	// int ia = ib = 10;
	void show1(int ia) {
		ia = 200;
		System.out.println("show�����У�ia = " + ia); // 10  200
	}
	// �Զ����Ա������ӡ�����������������
	void show2(int[] arr1) {
		arr1 = new int[2];  // ���ϸ��д�����൱���ڶ���������������һ���ڴ�ռ�
		arr1[0] = 200;
		System.out.println("show�����У�arr1[0] = " + arr1[0]); // 10  200  200
	}
	
	public static void main(String[] args) {
		
		// 1.����ArgumentTest���͵�����ָ������͵Ķ���
		ArgumentTest at = new ArgumentTest();
		// 2.ʹ�����ñ�������show1�������в���
		int ib = 10;
		at.show1(ib);
		System.out.println("main�����У�ib = " + ib); // ib = 10 
		
		System.out.println("-------------------------------------------------");
		// 3.����show2�������в���
		int[] arr2 = new int[]{10, 20};
		at.show2(arr2);
		System.out.println("main�����У�arr2[0] = " + arr2[0]); // 10 200 10
	}
}