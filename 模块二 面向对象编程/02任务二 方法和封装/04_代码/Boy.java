/*
    ���ʵ��Boy��Ķ���
 */
public class Boy {
	
	String name; // �������������ĳ�Ա����
	
	// �Զ��幹�췽��
	Boy() {
		// ���ñ����е��вι��췽��
		//this("����");
		System.out.println("�޲ι��췽����");
	}
	Boy(String name) {
		// ���ñ����е��޲ι��췽��
		this();
		System.out.println("=========�вι��췽����");
		this.name = name;
	}
	// �Զ����Ա����ʵ�������Ĵ�ӡ
	void show() {
		System.out.println("�ҵ������ǣ�" + name);
	}
	
	public static void main(String[] args) {
		
		// 1.ʹ���޲η�ʽ������󲢴�ӡ����
		Boy b1 = new Boy();
		b1.show(); // null
		
		System.out.println("-----------------------------------");
		// 2.ʹ���вη�ʽ������󲢴�ӡ����
		Boy b2 = new Boy("�ŷ�");
		b2.show(); // �ŷ�
		
		System.out.println("-----------------------------------");
		// 3.���ñ�������ֵ����Ϊ��
		//Boy b3 = null;
		//b3.show(); // ����ok�����лᷢ��NullPointerException��ָ���쳣   �����쳣�������±�Խ���쳣
		Boy b3 = b2;
		b3.show(); // �ŷ�
	}
}