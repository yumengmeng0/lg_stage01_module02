/*
    ���ʵ��Student��ķ�װ  ��װ��
 */
public class Student {
	
	// 1.˽�л���Ա������ʹ��private�ؼ�������
	// private�ؼ������α�ʾ˽�еĺ��壬Ҳ���Ǹó�Ա����ֻ���ڵ�ǰ����ڲ�ʹ��
	private int id;       // ��������ѧ�ŵĳ�Ա����
	private String name;  // �������������ĳ�Ա���� 
	
	// 3.�ڹ��еĹ��췽���е���set�������к���ֵ���ж�
	public Student() {}
	public Student(int id, String name) {
		//this.id = id;
		//this.name = name;
		setId(id);
		setName(name);
	}
	
	// 2.�ṩ���е�get��set���������ڷ������н��к���ֵ���ж�
	// ʹ��public�ؼ������α�ʾ���еĺ��壬Ҳ���Ǹ÷�������������λ��ʹ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		} else {
			System.out.println("ѧ�Ų�����Ŷ������");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// �Զ����Ա����ʵ�������Ĵ�ӡ
	// ʲô���η���û�н���Ĭ�ϵķ���Ȩ�ޣ��������private��public֮��
	public void show() {
		//System.out.println("����" + name + "���ҵ�ѧ����" + id);
		System.out.println("����" + getName() + "���ҵ�ѧ����" + getId());
	}
}