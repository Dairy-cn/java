package com.dairui.designpattern;



public class AbstractFactoryPattern {
	public static void main(String[] args) {
		FactoryProduct fp=new FactoryProduct();
		AbstractFactory abstractFactory =fp.getFactory("Shape");
		AbstractFactory abstractFactory2=fp.getFactory("Color");
		Color color=abstractFactory2.getColor("Red");
		color.fill();
		Shape shape2=abstractFactory.getShape("Square");
		
		shape2.draw();
	}

}

interface Color {
	void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Fill Red");
	}

}

class Green implements Color {

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Fill Green");
	}

}

class Bule implements Color {

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Fill Bule ");
	}

}

class ColorFactory extends AbstractFactory{
	public Color getColor(String ColorType) {
		if (ColorType.equalsIgnoreCase("Bule")) {
			return new Bule();

		}
		if (ColorType.equalsIgnoreCase("Red")) {
			return new Red();

		} else {
			return new Green();
		}
	}

	@Override
	public Shape getShape(String ShapeType) {
		// TODO Auto-generated method stub
		return null;
	}


}
abstract class AbstractFactory {
	public abstract Color getColor(String ColorType);
	void getShape() {
		// TODO Auto-generated method stub
		
	}
	public abstract Shape getShape(String ShapeType);


	
}
 class FactoryProduct{
	public AbstractFactory getFactory(String FactoryType) {
		if(FactoryType.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		}else if(FactoryType.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		return null;
	}
}