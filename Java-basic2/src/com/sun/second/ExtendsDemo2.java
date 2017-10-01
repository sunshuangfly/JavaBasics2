package com.sun.second;
/**
 * java中的继承的特点:
 * 		java语言只支持单一继承,只能继承一个父类 
 * 		java语言支持多层继承
 * 
 * @date 2017年10月1日
 */
public class ExtendsDemo2 {
	public static void main(String[] args) {
		LOLGame lg = new LOLGame();
		lg.update();
		
		//LOLGame的父类PCGame可以继续继承Games类
		lg.start();
		lg.stop();
	}
}

class Games {
	public void start() {
		System.out.println("游戏启动了");
	}
	public void stop() {
		System.out.println("游戏结束了");
	}
}

//PC端更新
class PCGame extends Games{
	public void update() {
		System.out.println("PCGame更新了");
	}
}

//Mobile端
class MobileGame extends Games{
	public void update() {
		System.out.println("MobileGame更新了");
	}
}

//一个类只能继承一个父类
class LOLGame extends PCGame{
	
}