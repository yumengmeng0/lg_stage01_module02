/*
    ���ʵ�ַ������еļ��㲢��ӡ  ������/��װ��
 */
public class Fee {
	
	// �Զ����Ա����ʵ�ַ��������е�n����ֵ�ļ��㲢���أ�n�ɲ���ָ��
	// 1 1 2 3 5 8 13  21 ....
	int show(int n) { // int n = 5; int n = 4; int n = 3; int n = 2; int n = 1;
		// 1.ʹ�õݹ�ķ�ʽ���м���
		/*
		// ��n=1����n=2ʱ�������1
		if(1 == n || 2 == n) {
			return 1;
		}
		// ��������ǰ����ĺ�
		return show(n-1) + show(n-2);
		// show(5) => return show(4) + show(3); => 5
		// show(4) => return show(3) + show(2); => 3
		// show(3) => return show(2) + show(1); => 2
		// show(2) => return 1;                 => 1
		// show(1) => return 1;                 => 1
		*/
		// 2.ʹ�õ��Ƶķ�ʽ���м���
		int ia = 1;
		int ib = 1;
		for(int i = 3; i <= n; i++) {
			int ic = ia + ib;
			ia = ib;
			ib = ic;
		}
		return ib;
	}
}