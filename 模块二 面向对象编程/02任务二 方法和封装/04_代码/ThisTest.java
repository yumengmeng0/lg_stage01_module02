/*
    ���ʵ��this�ؼ��ֵ�ʹ��
 */
public class ThisTest {
	
	// �Զ��幹�췽��
	ThisTest() {
		// this����ǰ���ڹ���Ķ���
		System.out.println("���췽���У�this = " + this);
	}
	// �Զ����Ա����
	void show() {
		// this����ǰ���ڵ��õĶ���
		System.out.println("��Ա�����У�this = " + this);
	}
	
	public static void main(String[] args) {
		
		// 1.����ThisTest���͵�����ָ������͵Ķ���
		ThisTest tt = new ThisTest();
		// 2.����show����
		tt.show();
		System.out.println("main�����У�tt = " + tt);
		
		
		
	}
}