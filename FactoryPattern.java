package com.dairui.designpattern;


public class FactoryPattern {
  public static void main(String[] args) {
	  ShapeFactory shapeFactory=new ShapeFactory();
	  Shape shape1=shapeFactory.getShape("Renctangle");
	  Shape shape2=shapeFactory.getShape("Square");
	  shape1.draw();
	  shape2.draw();
	
}
}
interface Shape{
	public  void draw();
	
}
 class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
	
}
 class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square");
	}
	 
 }
 class Renctangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Renctangle");
		
	}
	 
 }
 //创建工厂实例
 class ShapeFactory extends AbstractFactory{
	 public Shape getShape(String ShapeType) {
		if(ShapeType.equalsIgnoreCase("Renctangle")) {
			return new Renctangle();
		}if(ShapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}else {
			return new Circle();
		}
		
	 }

	@Override
	public Color getColor(String ColorType) {
		// TODO Auto-generated method stub
		return null;
	}
 }
