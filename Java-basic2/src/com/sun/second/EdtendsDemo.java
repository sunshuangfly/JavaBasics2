package com.sun.second;
/**
 * 继承:多个类有共同的成员变量和成员方法,抽取到另一个类中(父类),
 * 		再让多个类去继承这个类,我们就可以获得父类中的成员了.
 * 
 * @date 2017年10月1日
 */
public class EdtendsDemo {
	public static void main(String[] args) {
		//创建Data对象,因为继承了Game,所以继承了Game中的成员变量及方法
		Data d = new Data();
		d.start();
		d.stop();
		
		LOL l = new LOL();
		l.start();
		l.stop();
	}
}
//游戏
class Game {
	String name;
	double version; //版本
	String agent;//代理商
	
	public void start() {
		System.out.println("游戏开启");
	}
	
	public void stop() {
		System.out.println("游戏结束");
	}
}

//Data游戏
class Data extends Game{
	/*String name;
	double version; //版本
	String agent;//代理商
	
	public void start() {
		System.out.println("游戏开启");
	}
	
	public void stop() {
		System.out.println("游戏结束");
	}*/
}

//LOL游戏
class LOL extends Game{
	/*String name;
	double version; //版本
	String agent;//代理商
	
	public void start() {
		System.out.println("游戏开启");
	}
	
	public void stop() {
		System.out.println("游戏结束");
	}*/
}