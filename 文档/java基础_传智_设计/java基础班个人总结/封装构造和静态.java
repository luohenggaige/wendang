//11��3�Ÿ�ϰ�ܽ�

/*class  Noname2{									//��װ��ʾ
	public static void main(String[] args) {
		Test t = new Test("zhangsan",23);
		t.speak();
	}
}


class Test{
	private String name ;							//����Ա����˽�з�װ�������Ա����ⲿ���ø�ֵʱ���ִ���
	private int age;

	public Test(){}
	
	public Test (String name,int age)				//��װ������ṩ���ʵĽӿ�{
		this.name = name ;
		this.age = age;
	}

	public void speak()								//ʵ����еĹ��ܣ�˵���Լ�������������{
		System.out.println(name+":::"+age);
	}
}*/


/*class Noname2{									//����������ʾ
	public static void main (String[]a){
		Test t = new Test("zhangsan");
		t.speak();
		Test t1 = new Test("lisi");
		t1.speak();
	}
}

class Test{
	private String name;							//��װ
	private int age;
	private String country;

	{
		country = "CN";								//��������,�����еĶ�����г�ʼ���������ж��󴴽���ʱ��ִ�У�
	}												//���������һ�����ܣ������ж��������ͬ�Ķ������е�����ʼ��

	public Test(String name  ){
		this.name = name;
	}

	public void speak (){
		System.out.println(name+":::"+country);
	}
}*/


class Noname2{										//��̬��ʾ
	public static void main(String[]a){
		/*Test t1 = new Test("zhangsan",23);
		t1.speak();
		
		Test t2 = new Test("lisi",24);
		t2.speak();
		Test.show();*/								//��ֱ�ӵ��þ�̬����
	}
}

/*class Test 
{
	private String name ;
	private int age;
	private static String country="CN";				//�Գ�Ա�����������Σ����Ա�����(�����з�������ͬ�Ķ������ο��Խ�ʡ�ռ�),
													//��̬���Ա��Ǿ�̬���ʣ������ܣ�
													//Ҳ���ǵ���ġ�
	public Test (String name ,int age){
		this.name = name;
		this.age = age;
	}

	public void speak (){
		System.out.println(name+":::"+age+":::"+country);
	}
	public static void show (){						//�Է������о�̬���Σ����Ա���ֱ�ӵ��ã�Ҳ�ǵ���ģʽ��һ�����衣
		System.out.println("��̬����");
	} 
}*/


class Test
{
	static
	{
		System.out.println("��̬�����");			//���ǽ����������þ�̬���Σ����������һ��ִ�У�
	}												//����������г�ʼ����
													//������ص�ʱ����أ�ֻ����һ��

}


��̬�ĺ���������صĻ���
    ��������ص�ʱ������һ����أ��ڶ��󴴽�ǰ���Ѿ�������
    ���Ծ�̬����ֻ�ܵ��þ�̬��Ա�����ܵ��÷Ǿ�̬��Ա;
	��Ϊ��̬����ǰ�棬�о�̬ʱ��û�зǾ�̬
    ���Ǿ�̬�ں��棬���ֶ����Է��ʡ�

�ɴ���������̬�в�����this��super����Ϊ���Ƕ���ġ�

ʲôʱ���ã�
	1.��Ա�����Ƿ���Ҫstatic��
		����ÿ���������Ƿ���ͬ���ǣ������ã��񣬲��ܣ�
	2.��Ա�����Ƿ���Ҫ
		�������˳�Ա����ʱ�������ã�
		û�п����ã�������ֱ�ӱ�����á�
			�����з�����Ϊ��̬ʱ������Ҫ���󣬿��Լ���ǿ�ƴ�ʩ��
				�����캯��˽�л����ɡ�

���ƣ���Ա����(�Ǿ�̬)�ֳ�ʵ������
	  ��̬����(����̬���εĳ�Ա����)�ֳ������
λ�ã��Ǿ�̬�ڶ�
	  ��̬�ڷ�����(Ҳ�����ݹ�����)
���أ��Ǿ�̬�����
	  ��̬���ಢ���������
���ã��ɼ��ؾ����˵���
	  �Ǿ�̬���ܵ���
	  ��ֻ̬�ܵ��þ�̬��