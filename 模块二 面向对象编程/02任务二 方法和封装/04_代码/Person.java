/*
    ���ʵ��Person��Ķ���
 */
public class Person {
	
	String name; // �������������ĳ�Ա����
	int age;     // ������������ĳ�Ա����
	
	// �Զ��幹�췽��
	// String s = "�ŷ�";
	// int i = 30;
	// String s = "����";
	// int i = 35;
	// �ͽ�ԭ��  ����ԭ��  
	Person(String name, int age) {
		//System.out.println("�Ҿ����Զ���Ĺ��췽����");
		//name = "�ŷ�";
		//age = 30;
		this.name = name;
		this.age = age;
	}
	// �Զ����޲ι��췽��
	Person() {
	}
	
	// �Զ����Ա����ʵ�����������Ĵ�ӡ  ������this�ؼ���,this�ؼ��ִ���ǰ���ڵ��õĶ���
	// Person this = p1;   this.name = p1.name = �ŷ�
	// Person this = p2;   this.name = p2.name = ����
	void show() {
		// ÿ����ӡ��Ա��������ֵʱ������������һ��
		//this.grow();
		//grow();
		//System.out.println("����" + this.name + "������" + this.age + "���ˣ�");
		System.out.println("����" + name + "������" + age + "���ˣ�");
	}
	// �Զ����Ա����ʵ����������һ�����Ϊ
	void grow() {
		age++;
	}
	// �Զ����Ա����ʵ��������������ָ����ֵ����Ϊ
	void grow(int age) {
		this.age += age;
	}
	// �Զ����Ա����ʵ��Person���Ͷ���Ļ�ȡ�����ص���Ϊ
	//String getName(){}
	Person getPerson() {
		// ���ص�ǰ���ö�����  Person tp = new Person();  return tp;
		return this;
	} 
	
	public static void main(String[] args) {
		
		// 1.����һ��Person���͵�����ָ��Person���͵Ķ���
		// ������û���ṩ���췽��ʱ�����������Ĭ�Ϲ��췽�����������ṩ���췽������������������ṩ�İ汾
		Person p1 = new Person("�ŷ�", 30);
		// ����ӡ����
		p1.show();  // null 0  �ŷ�  30
		
		Person p2 = new Person("����", 35);
		p2.show();  // ���� 35
		
		Person p3 = new Person();
		p3.show(); // null 0
		
		System.out.println("----------------------------------------------------");
		// 2.ʵ�����ط����ĵ��úͲ���
		p1.grow();
		p1.show(); // �ŷ� 31
		p1.grow(3);
		p1.show(); // �ŷ� 34
		
		System.out.println("----------------------------------------------------");
		// 3.���ó�Ա������ȡ����
		Person p4 = p1.getPerson();
		System.out.println("p1 = " + p1);
		System.out.println("p4 = " + p4);
		
	}
}