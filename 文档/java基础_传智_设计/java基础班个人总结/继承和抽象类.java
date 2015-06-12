`11月5日假期总结

一：继承(重写父类方法)
	1.当类与类之间有相同的东西的时候，向上抽取产生了一个具有相同内容的体系---继承体系；由此提高了代码的复用性。
		关键字extends。
	
	2.继承内成员变量，成员方法，构造方法的特点；
		1>成员变量
		当子类，父类，子类方法内有相同的三个变量时，调用是按照就近原则，从方法内到类中方法外再到父类。
			例如
			class  Demo{
				public static void main(String[] args) {
					Zi z = new Zi();
					z.show();
				}
			}
			class Fu{
				int a = 3;
			}
			class Zi extends Fu{
				int a = 2;
				void show (){
					int a = 1;
					System.out.println(a);
				}
			}
			输出1，将a用this调用输出2，将a用super调用输出3.

		2>成员方法
			1>按照就近原则，当子父类中出现了一模一样的方法时，建立子类对象会运行子类中的方法覆盖父类的。
			2>覆盖
				1>覆盖：必须返回值，方法名，参数列表都相同并且权限比父类大，简单说就是“一模一样”
						重载只是方法名相同，参数列表的顺序，个数，类型不同。
				2>覆盖的应用
						继承了一个类获得其功能
						可以在子类中将内容(大括号里的代码)自定义
				例如
				class Demo{
					public static void main(String[]a);
						Zi z = new Zi();
						z.show();
				}
				class Fu
				{
					void show (){
						System.out.println(name);
					}
				}
				class Zi extends Fu
				{
					void show (){
						System.out.println(country);
						super.show();
					}
			}输出
			这是覆盖的最主要的应用

		3>构造函数
			1>每一个构造函数内第一行都有一个默认的 super
				super 是指向父类所属空间
				this  是本类对象的引用
			  在用子类对象调用时，会先走父类的构造函数，因为既然是继承了父类能够拿到父类的方法，那么
			  就需要知道拿的东西原本是什么样的，也就是父类的构造函数怎么初始化的；所以要先走父类的构造。
			  而父类的构造函数可以给父类和子类都进行初始化。
			
			2>一共有四种情况
				1>子类空參走 super 空參
					class Zi{
						/*
							默认的空參构造和默认的空參 super
						*/
					}
				2>子类空參走 super 有參
					class Zi{
						private void Zi(){
							super(int(类型) a(变量名))
						}
					}
				3>子类有參走 super 空參
				4>子类有參走 super 有參
				由此总结推论
					1>子类至少有一个构造指向父类
					2>当父类没有空參构造，需手动定义有參 super 访问。


二：抽象类
	1.由来：假设有一个动物类，动物具有叫声的功能(方法)，而具体每种动物的叫法不一样(方法体)
			由此需要其他类(具体动物)继承动物类再具体实现方法。
	2.定义：方法没有具体方法体，而由抽象关键字 abstract 修饰
			被 abstract 修饰的方法没有方法体，叫抽象方法
			有抽象方法的类叫抽象类，但抽象类里抽象非抽象方法都可以有，是单向的。若没有作用是不让其他类创建本类(抽象类)对象。
	3.格式：抽象方法：
			abstract 返回值 方法名(参数列表);
			抽象类:
			abstract class 类名{}
			

		 例 abstract class Animal { // 定义抽象动物类
				abstract void shout(); // 定义抽象方法shout()
			}
			class Cat extends Animal {
				void shout() {
					System.out.println("喵喵……");
				}
			}
			class Dog extends Animal {
				void shout() {
					System.out.println("汪汪……");
				}
			}
			public class Example11 {
				public static void main(String[] args) {
					Cat cat = new Cat();
					cat.shout();
					Dog dog = new Dog();
					dog.shout();
				}
			}
			运行结果如下：
			喵喵……
			汪汪……
	
	4.也就是说抽象类其实就是继承里面覆盖的应用，并对其进行了扩充
		也就具有了继承的相关特点