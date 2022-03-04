/*
    ���ʵ�ַ���������Ҫ��ʽ�Ĳ���
 */
public class OverloadTest {
	
	// �Զ����Ա����
	void show() {
		System.out.println("show()");
	}
	void show(int i) { // ok  �����ڷ��������ĸ�����ͬ
		System.out.println("show(int)");
	}
	void show(int i, double d) { // ok  �����ڷ��������ĸ�����ͬ
		System.out.println("show(int, double)");
	}
	void show(int i, int j) { // ok  �����ڷ������������Ͳ�ͬ
		System.out.println("show(int, int)");
	}
	void show(double d, int i) { // ok  �����ڷ���������˳��ͬ
		System.out.println("show(double, int)");
	}
	/*
	void show(double a, int b) { // error ������������޹�
		System.out.println("show(double, int)");
	}
	*/
	/*
	int show(double d, int i) { // error, �뷵��ֵ�����޹�
		System.out.println("show(double, int)");
	}
	*/
	
	public static void main(String[] args) {
		
		// 1.����OverloadTest���͵�����ָ������͵Ķ���
		OverloadTest ot = new OverloadTest();
		// 2.����show����
		ot.show();
		ot.show(66);
		ot.show(66, 3.14);
		ot.show(66, 118);
		ot.show(3.14, 118);
		//ot.show(3.14, 66);
	}
}