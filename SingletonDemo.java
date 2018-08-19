package com.dairui.designpattern;

public class SingletonDemo {

	public static void main(String[] args) {
		SingletonClass singletonClass = SingletonClass.getInstanceSingletonClass();
		singletonClass.draw();

	}
}

class SingletonClass {
	private static SingletonClass singleton = null;

	public static SingletonClass getInstanceSingletonClass() {
		if (singleton == null) {
			synchronized (SingletonClass.class) {
				return new SingletonClass();
			}
		}
		return singleton;

	}

	private SingletonClass() {

	}

	public void draw() {
		System.out.println("read");
	}
}

// 登记式
class SingletonStatic {
	private SingletonStatic() {

	}

	private static class SingletonHandle {
		private static final SingletonStatic INSTANCE = new SingletonStatic();
	}

	public static final SingletonStatic getInsance() {
		return SingletonHandle.INSTANCE;
	}

}
