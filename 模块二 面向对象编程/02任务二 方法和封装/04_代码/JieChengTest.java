/*
    ���ʵ���۳˻��ļ��㲢��ӡ
 */
public class JieChengTest {
	
	// �Զ����Ա����ʵ�ֽ�����n�Ľ׳˼������������
	// 1! = 1;     2! = 1*2;   3! = 1*2*3;   ...   n! = 1*2*3*...*n;
	int show(int n) { // int n=5; int n = 4; int n = 3; int n = 2;  int n = 1;
		// ���Ƶķ�ʽ 
		/*
		int num = 1;
		for(int i = 1; i <= n; i++) {
			num *= i;
		}
		return num;
		*/
		/*
		    5! = 5 * 4 * 3 * 2 * 1;
			4! = 4 * 3 * 2 * 1;
			3! = 3 * 2 * 1;
			2! = 2 * 1;
			1! = 1;
			
			5! = 5 * 4!;
			4! = 4 * 3!;
			3! = 3 * 2!;
			2! = 2 * 1!;
			1! = 1;
			
			n! = n * (n-1)!;
		  
		*/
		// �ݹ�ķ�ʽ
		// ��n����ֵΪ1ʱ����׳˵Ľ������1
		/*
		if(1 == n) {
			return 1;
		}
		*/
		if(1 == n) return 1;
		// ����׳˵Ľ������ n*(n-1)!
		return n*show(n-1);
		// show(5) => return 5*show(4); => 120
		// show(4) => return 4*show(3); => 24 
		// show(3) => return 3*show(2); => 6
		// show(2) => return 2*show(1); => 2
		// show(1) => return 1;         => 1
	}
	
	public static void main(String[] args) {
		
		// 1.����JieChengTest���͵�����ָ������͵Ķ���
		JieChengTest jct = new JieChengTest();
		// 2.���÷������м��㲢��ӡ
		int res = jct.show(5);
		System.out.println("���յļ������ǣ�" + res); // 120
	}
}