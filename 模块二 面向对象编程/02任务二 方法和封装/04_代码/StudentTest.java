/*
    ���ʵ��Student��Ĳ���
 */
public class StudentTest {
	
	public static void main(String[] args) {
		
		// 1.����Student���͵�����ָ��Student���͵Ķ���
		Student s1 = new Student();
		// 2.�Գ�Ա�������и�ֵ����ӡ
		//s1.id = -1001;
		//s1.name = "�ŷ�";
		s1.setId(-1001);
		s1.setName("�ŷ�");
		s1.show(); // 1001 �ŷ�
		
		System.out.println("----------------------------------------------------");
		// 3.ʹ���вη�ʽ������󲢴�ӡ����
		Student s2 = new Student(-1001, "�ŷ�");
		s2.show(); 
	}
}