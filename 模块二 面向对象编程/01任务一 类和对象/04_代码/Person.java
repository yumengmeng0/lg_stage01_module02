/*
    ���ʵ��Person��Ķ���
 */
public class Person {

	// �������� ��Ա������ = ��ʼֵ;   - ����=��ʼֵ ͨ����ʡ�Բ�д
	String name; // �������������ĳ�Ա����
	int age;     // ������������ĳ�Ա����

    // �Զ����Ա����ʵ�����г�Ա�����Ĵ�ӡ
    // ����ֵ���� ��������(�β��б�) { ������; }	
	void show() {
		// ��Ա�����ͳ�Ա�������������ڲ��ĳ�Ա����˿���ֱ�ӷ��ʳ�Ա��������Ҫ�ټ�����.��ǰ׺
		System.out.println("����" + name + "������" + age + "���ˣ�");
	}
    // �Զ����Ա����ʵ�ֽ������޸�Ϊ����ָ����ֵ����Ϊ
	// String s = "guanyu";
	void setName(String s) {
		name = s;
	}
	// �Զ����Ա����ʵ�ֽ������޸�Ϊ����ָ����ֵ����Ϊ
	// int i = 35;
	void setAge(int i) {
		age = i;
	}
    // �Զ����Ա����ʵ�ֽ������������޸�Ϊ����ָ����ֵ����Ϊ  ����ķ������Ƽ�ʹ��
	// String s = "liubei";    
	// int i = 40;
	void setNameAge(String s, int i) {
		name = s;
		age = i;
	}
    // �Զ����Ա����ʵ�ֿɱ䳤������ʹ��  ����һά����ʹ�ü���  0 ~ n��
	void showArgument(int num, String... args) {
		System.out.println("num = " + num);
		for(int i = 0; i < args.length; i++) {
			System.out.println("��" + (i+1) + "������Ϊ��" + args[i]);
		}
	}
	// �Զ����Ա����ʵ��������ֵ�Ļ�ȡ�����ص���Ϊ
	String getName() {
		return name; // �������ݲ�������ǰ����
		// ...   ִ�в�����
	}
	// �Զ����Ա����ʵ��������ֵ�Ļ�ȡ�����ص���Ϊ
	int getAge() {
		return age;
	}

    public static void main(String[] args) {
		
		// 1.����Person���͵�����ָ��Person���͵Ķ���
		// ��������(����) ���ñ����� = new ����();
		Person p = new Person();
		// 2.��ӡ�����еĳ�Ա����ֵ
		// ���ñ�����.��Ա������
		//System.out.println("����" + p.name + "������" + p.age + "���ˣ�"); // null 0
		// ���ñ�����.��Ա������(ʵ���б�);
		// ���÷����ı��ʾ��Ǹ��ݷ�������ת��ȥִ�з����������ת�����λ��
		p.show();
		
		System.out.println("-----------------------------------------------------");
		// 3.�޸ĳ�Ա��������ֵ
		p.name = "zhangfei";
		p.age = 30;
		// 4.�ٴδ�ӡ�޸ĺ����ֵ
		//System.out.println("����" + p.name + "������" + p.age + "���ˣ�"); // zhangfei 30
		p.show();
		
		System.out.println("-----------------------------------------------------");
		// 5.ͨ����Ա�����ĵ���ʵ�ֳ�Ա�������޸�
		p.setName("guanyu");
		p.setAge(35);
		p.show(); // guanyu  35
		
		System.out.println("-----------------------------------------------------");
		// 6.ͨ����Ա����ͬʱ�޸�����������
		//p.setNameAge("liubei", 40);
		int ia = 40;
		p.setNameAge("liu"+"bei", ia);
		p.show(); // liubei 40
		
		System.out.println("-----------------------------------------------------");
		// 7.ͨ����Ա����ʵ�ֿɱ䳤�����Ĵ�ӡ
		p.showArgument(0);
		System.out.println("-----------------------------------------------------");
		p.showArgument(1, "����1");
		System.out.println("-----------------------------------------------------");
		p.showArgument(2, "����1", "����2");
		
		System.out.println("-----------------------------------------------------");
		// 8.ͨ����Ա�����ĵ���ʵ�ֳ�Ա������ֵ�Ļ�ȡ����ӡ
		String str1 = p.getName();
		System.out.println("��ȡ���������ǣ�" + str1); // liubei
		int ib = p.getAge();
		System.out.println("��ȡ���������ǣ�" + ib); // 40
	}	
}