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
		Rectangle rect = new Rectangle();// ��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		rect.setWidth (scanner.nextInt());
		rect.setHeight (scanner.nextInt());
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();

	}

}
