/*
    ���ʵ��Point��Ķ���
 */
public class Point {
	
	int x; // ��������������ĳ�Ա����
	int y; // ��������������ĳ�Ա����
	
	// �Զ����Ա����ʵ�ֳ�Ա������ֵ�Ĵ�ӡ
	void show() {
		System.out.println("�������ǣ�" + x + "���������ǣ�" + y);
	}
	// �Զ����Ա����ʵ�ֽ��������޸�Ϊ����ָ����ֵ����Ϊ
	// int i = 10;
	void setX(int i) {
		x = i;
	}
	// �Զ����Ա����ʵ�ֽ��������޸�Ϊ����ָ����ֵ����Ϊ
	// int j = 20;
	void setY(int j) {
		y = j;
	}
	// �Զ����Ա����ʵ��int���͵Ŀɱ䳤����ʹ��
	void showArgument(int... args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + args[i]);
		}
	}
	// �Զ����Ա����ʵ�ֻ�ȡ��������ֵ�����ص���Ϊ
	int getX() {
		return x;
	}
	// �Զ����Ա����ʵ�ֻ�ȡ��������ֵ�����ص���Ϊ
	int getY() {
		return y;
	}
	
	public static void main(String[] args) {
		
		// 1.����Point���͵�����ָ��Point���͵Ķ���
		Point p = new Point();
		// ��ӡ��Ա��������ֵ
		//System.out.println("�������ǣ�" + p.x + "���������ǣ�" + p.y); // 0 0
		p.show();
		
		System.out.println("-----------------------------------------------");
		// 2.�����������޸�Ϊ3��5���ٴδ�ӡ
		p.x = 3;
		p.y = 5;
		//System.out.println("�������ǣ�" + p.x + "���������ǣ�" + p.y); // 3 5
		p.show();
		
		System.out.println("-----------------------------------------------");
		// 3.ͨ�����ó�Ա����ʵ�ֺ���������޸�
		p.setX(10);
		p.setY(20);
		p.show(); // 10 20
		
		System.out.println("-----------------------------------------------");
		// 4.ͨ����Ա����ʵ�ֿɱ䳤������ʹ��
		p.showArgument(1, 2, 3, 4, 5);
		
		System.out.println("-----------------------------------------------");
		// 5.ͨ����Ա��������ʵ�ֺ�������Ļ�ȡ
		int ia = p.getX();
		System.out.println("��ȡ���ĺ������ǣ�" + ia); // 10
		int ib = p.getY();
		System.out.println("��ȡ�����������ǣ�" + ib); // 20
	}
}