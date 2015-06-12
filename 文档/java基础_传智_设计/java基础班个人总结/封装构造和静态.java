//11月3号复习总结

/*class  Noname2{									//封装演示
	public static void main(String[] args) {
		Test t = new Test("zhangsan",23);
		t.speak();
	}
}


class Test{
	private String name ;							//将成员变量私有封装起来可以避免外部调用赋值时出现错误
	private int age;

	public Test(){}
	
	public Test (String name,int age)				//封装后对外提供访问的接口{
		this.name = name ;
		this.age = age;
	}

	public void speak()								//实体具有的功能：说出自己的名字与年龄{
		System.out.println(name+":::"+age);
	}
}*/


/*class Noname2{									//构造代码块演示
	public static void main (String[]a){
		Test t = new Test("zhangsan");
		t.speak();
		Test t1 = new Test("lisi");
		t1.speak();
	}
}

class Test{
	private String name;							//封装
	private int age;
	private String country;

	{
		country = "CN";								//构造代码块,对所有的对象进行初始化，在所有对象创建的时候执行；
	}												//如果衍生了一个功能：对所有对象里的相同的东西进行单独初始化

	public Test(String name  ){
		this.name = name;
	}

	public void speak (){
		System.out.println(name+":::"+country);
	}
}*/


class Noname2{										//静态演示
	public static void main(String[]a){
		/*Test t1 = new Test("zhangsan",23);
		t1.speak();
		
		Test t2 = new Test("lisi",24);
		t2.speak();
		Test.show();*/								//类直接调用静态方法
	}
}

/*class Test 
{
	private String name ;
	private int age;
	private static String country="CN";				//对成员变量进行修饰，可以被共享(对所有方法里相同的东西修饰可以节省空间),
													//静态可以被非静态访问，反向不能；
													//也就是单向的。
	public Test (String name ,int age){
		this.name = name;
		this.age = age;
	}

	public void speak (){
		System.out.println(name+":::"+age+":::"+country);
	}
	public static void show (){						//对方法进行静态修饰，可以被类直接调用；也是单例模式的一个步骤。
		System.out.println("静态方法");
	} 
}*/


class Test
{
	static
	{
		System.out.println("静态代码块");			//就是将构造代码快用静态修饰，比其更优先一级执行；
	}												//用来给类进行初始化的
													//在类加载的时候加载，只加载一次

}


静态的核心是其加载的机制
    是在类加载的时候随类一起加载，在对象创建前就已经加载了
    所以静态方法只能调用静态成员，不能调用非静态成员;
	因为静态的在前面，有静态时还没有非静态
    而非静态在后面，两种都可以访问。

由此衍生：静态中不能有this与super，因为都是对象的。

什么时候用：
	1.成员变量是否需要static。
		其在每个对象中是否相同，是，可以用；否，不能；
	2.成员方法是否需要
		当访问了成员变量时不可以用；
		没有可以用，并可以直接被类调用。
			当类中方法都为静态时，则不需要对象，可以加入强制措施：
				将构造函数私有化即可。

名称：成员变量(非静态)又称实例变量
	  静态变量(被静态修饰的成员变量)又称类变量
位置：非静态在堆
	  静态在方法区(也称数据共享区)
加载：非静态随对象
	  静态随类并优先与对象
调用：由加载决定了调用
	  非静态都能调用
	  静态只能调用静态的