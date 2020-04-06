package ch04;

import java.util.Scanner;

class Rectangle {
      private int Width;
      private int Height;
  
	

	public int getArea() {
		return Width * Height;
	}



	public void setWidth(int width) {
		this.Width = width;
	}



	public void setHeight(int height) {
		this.Height = height;
	}
   
	
}

public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();// 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		rect.setWidth (scanner.nextInt());
		rect.setHeight (scanner.nextInt());
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();

	}

}
