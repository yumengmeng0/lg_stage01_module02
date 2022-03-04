/*
    ���ʵ��Point��Ķ���
 */
public class Point {
	
	int x; // ��������������ĳ�Ա����
	int y; // ��������������ĳ�Ա����
	
	// �Զ����޲ι��췽��
	Point() {}
    // �Զ����вι��췽��
    Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	
	// �Զ����Ա����ʵ�������Ĵ�ӡ
	void show() {
		System.out.println("�������ǣ�" + x + "���������ǣ�" + y);
	}
	// �Զ����Ա����ʵ���������1����Ϊ
	void up() {
		y--;
	}
	// �Զ����Ա����ʵ���������ȥ����ָ����ֵ����Ϊ
	void up(int y) {
		this.y -= y;
	}
	
	public static void main(String[] args) {
		
		// 1.ʹ���޲η�ʽ������󲢴�ӡ����
		Point p1 = new Point();
		p1.show(); // 0 0
		
		// 2.ʹ���вη�ʽ������󲢴�ӡ����
		Point p2 = new Point(3, 5);
		p2.show(); // 3 5
		
		System.out.println("------------------------------------");
		// 3.�������صĳ�Ա����
		p2.up();
		p2.show(); // 3 4
		p2.up(2);
		p2.show(); // 3 2
	}
}