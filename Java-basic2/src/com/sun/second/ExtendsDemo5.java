package com.sun.second;
/**
 * 方法重写的应用场景:当父类的方法不能完全满足子类使用,这个时候子类重写父类的方法,
 * 				并可以在方法中使用super关键字调用父类方法,这样做,既可以选择父类功能,也可以拥有自己特有功能
 * 方法重写的注意事项:不能重写父类私有的方法,
 * 				重写的方法权限必须大于等于父类方法的权限
 * 
 * 注解:@Override
 * 
 * @date 2017年10月2日
 */
public class ExtendsDemo5 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call();
	}
}

class Phone {
	public void call() {
		System.out.println("打电话");
	}
}

class NewPhone extends Phone {
	@Override
	//子类重写父类call方法
	public void call() {
		System.out.println("发短信");
		//用super关键字调用父类方法
		super.call();
	}
}
