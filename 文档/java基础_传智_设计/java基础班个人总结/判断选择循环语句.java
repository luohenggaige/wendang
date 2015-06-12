11月1号第一次总结

	一：判断与选择语句
	1.判断语句
	  if语句

	  1>第一种格式
		if	(小括号为判断条件)	相当与如果	
			{大括号为执行语句或某些判断运算，如 System 输出语句，==号等}
		else{}	相当与否则

	  2>第二种格式
		if	()  
			{}
		else if	()	相当与在 else 里面嵌套了一个if，可以理解为将 else 的｛｝换成了if语句。
				{}
		else{}

	  3>第三种格式
	    if	()
			{}
		else if ()
				{}
		else if ()
				{}
				... 同样可以理解为将多个 else 的｛｝换成了if语句。
		else {}


	 2.选择语句
	   switch语句
	   个人认为某些时候可以当做判断语句来理解。

	   1>格式
		 switch (选择条件)
		 {
		 case 判断条件:
			执行语句；
			 break；
		 
		 case
			...
		 default:
			执行语句；
		 }
		 switch 语句执行顺序：
			1>判断  选择条件是否满足判断条件的某一个，满足执行某一个 case ，否则执行默认 default 。
			2>满足  case 时，执行完需有 break 终止 switch 运行，否则会按顺序执行下面的case到default再到结束。
			3>终止  当有运行到 break 时即为终止 case 也为终止 switch ，否则会按1>执行到 default 再到 switch 末尾结束。



	二：循环语句
		1.while 循环
			1>格式
			int x = 10;    声明数据
			while (判断条件)
			{
				执行语句；
					循环控制；
			}

		2.do while 
			1>格式
			do
			{执行语句；
				循环控制；	
			}
			while (判断条件);

			两者的区别可以理解为就是将 while 的大括号执行语句拿到了 while 前面，也就不用判断也会按顺序至少执行一次；
			也就是 do while 至少执行一次。

		
		3.for (声明数据; 判断条件;循环控制 )
		{
			执行语句；
		}

			for 与 while 的区别就是 while 的数据在外面，可以用作它用，而 for 将诸多控制全部整合在了 for 里面；
			单纯用循环用 for 更方便；数据会用作其它用途用 while 更严谨。



		二.冒泡与选择排序
			1.冒泡排序
				冒泡排序是从第一个数开始到末尾数，两两比较依次顺延;并且从末尾位置开始到第一个位置逐个确定；
				
				如果 arr[y] < arr[y+1] 交换后，将小的往后移，排序结果为 从大到小；
				如果 arr[y] > arr[y+1] 交换后，将大的往后移，排序结果为 从小到大；
					public static void main(String[] args) 
						{
							int[] temp = {33,22,44,66,55,11};
							bubble_Sort(temp);								用 bubble_Sort 方法对 arr 进行排序
							sop(temp);										用 sop 方法对排序过的数组 arr 进行打印
						}
						
					int [] arr = {33,55,22,66,11,44};
					public static void bubble_Sort(int []arr)				定义一个方法
						{
							for (int x=0;x<arr.length-1 ; x++)				确定比较轮数，从最后一个位置开始每一轮确定一个位置
							{
								for (int y= 0;y<arr.length-x-1 ;y++ )		确定比较次数，第一轮有六个数比较五次，依次类推。
								{											
									if (arr[y]>arr[y+1])					大的往后，排序从小到大
									{
										int temp = arr[y];					
										arr [y] = arr [y+1];
										arr [y+1] = temp;
									}
								}
							}
						}
					public static void sop(int []arr){
						for (int x= 0;x<arr.length ;x++ )
						{
							System.out.print(arr[x]+" ");
						}
					}


			1.选择排序
				选择排序是从第一个数开始，每一个数都与这个数后面的所有被比较数比较
				
					public static void main(String[] args) 
						{
							int [] temp = {33,55,22,66,11,44};
							xuanZhe(temp);
						}


						public static void xuanZhe(int []arr)         
						{
							for (int x =0 ;x<arr.length-1 ;x++ )			比较五轮，从第一个位置开始每一轮确定一个位置，也就是
							{												说，第一轮确定了第一个位置的数，第二轮就从第二个数
																			开始依次与后面的数比较。至于确定的位置上的数是大是小
																			取决于 arr[x]与arr[y] 怎么比较比较
								
								for (int y = x;y<arr.length ;y++ )			每轮比较次数，虽然比较次数也是依次降低，但根据选择
																			排序的模式;   x 代表比较数，y 代表被比较数，被比较	
																			在比较数的后面，比较数在依次往后移，被比较数也在随
																			之变化，  y随x变化所以  y = x。
									{										
										if (arr[x]<arr[y])					比较
										{
											int temp = arr[x];				交换
											arr [x] = arr [y];
											arr [y] = temp;
										}
									}
								}
							for (int x=0;x<arr.length ;x++ )				遍历
							{
								System.out.print(arr[x]+" ");				打印
							}		
						}

						无返回值有输出语句的方法调用用	将方法用静态修饰；如果在文件类(主线程)中，可以隐藏“类名.”
							在其它类中不行。
						有返回值的方法用	方法名(实参)，再调用有输出语句的方法，如冒泡；这样有助与程序维护，俗称一个萝卜
							一个坑，一个螺丝一个钉。