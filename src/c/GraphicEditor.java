//package c;
//
//import java.util.Scanner;
//
//public abstract class Shape{
//	private Shape next; 
//	public Shape() {
//		next = null;
//	}
//	public void setNext(Shape obj) { 
//		next = obj;
//	}//��ũ ���� 
//	public Shape getNext() {
//		return next;
//	}
//	public abstract void draw(); //�߻� �޼ҵ�
//}
//
//class Line extends Shape{
//	String name = line;
//	public void draw() {
//		System.out.println("Line");
//	}
//}
//
//class Rect extends Shape{ 
//	 String name = rect;
//	public void draw() {
//		System.out.println("Rect");
//		
//	}
//}
//
//class Circle extends Shape{ 
//	String name = circle;
//	public void draw() {
//		System.out.println("Circle");
//		
//	}
//}
//public class GraphicEditor{ 
//	private Shape head, tail;
//	private Scanner sc; 
//	public GraphicEditor() {
//		head = null; //���� ��� 
//		tail = null; // �� ��� 
//		sc = new Scanner(System.in);
//	}
// public void run() { 
//	 System.out.println("�׷��� ������ beauty�� �����մϴ�.");
//	 while(true) { 
//		 System.out.println("����(1),����(2),��κ���(3),����(4)>>");
//		 int num = sc.nextInt();
//		 switch (num) {
//		case 1:
//             System.out.println("Line(1),Rect(2),Circle(3)>>");
//             num = sc.nextInt(); 
//             insert(num);
//             break;
//		case 2:
//			System.out.println("������ ������ ��ġ>>");
//			num = sc.nextInt();
//			delete(num);
//            break;
//		case 3: 
//			print(); 
//			break; 
//			
//		case 4:
//			System.out.println("beauty�� �����մϴ�.");
//			sc.close();
//			return;
//		}
//		 
//	 }
// }
//
//
//public void insert(int draw) {// ��� ����
//	Shape grapic; 
//	switch (draw) {
//	case 1:
//		grapic = new Line();
//		break;
//	case 2: 
//		grapic = new Rect(); 
//	case 3: 
//		grapic = new Circle();
//		break;
//	default:
//		System.out.println("�ٽ� �Է��� �ּ���.");
//		return;
//	}
//    if(head==null) { //head�� �ƹ��͵� ����Ű�� ������ 
//    	head = grapic;// head�� tail�� ���ο� ��带 ����Ŵ
//    	tail = grapic;
//    }
//    else { 
//    	tail.setNext(grapic);// �� ��忡 ���ο� ��带 �����ϰ�
//    	tail = grapic; //�� ���� ���� ������� ��带 ����Ű�� �� 
//    }
//}
//public void print() { 
//	Shape s = head; 
//	while(s!=null) {
//		s.draw();
//		s=s.getNext();
//	}
//
//}
//public void delete(int num) { //num�� ���° �������
//    Shape cur = head; //���� ��� 
//    Shape tmp = head; 
//    int i; 
//    if(num==1) { //ù��° ��带 �����ϴ� ��� 
//    	if(head==tail) { //��尡 �Ѱ� �� ��� 
//    		head = null; 
//    		tail = null; 
//    		return;
//    	}
//    	else {//��尡 �ΰ� �̻� 
//    		head = head.getNext();
//    		return;
//    	}
//    }
//    for (int j = 0; j < num; j++) {
//		tmp = cur;//���� ��带 ������ (��, ���� ���)
//		cur = cur.getNext(); //���� ���� �̵� 
//		if(cur ==null) { 
//			System.out.println("������ �� �����ϴ�.");
//			return;
//		}
//	}
//    if(i==num) {// �� ��带  ����ų��
//    	tmp.setNext(cur.getNext());
//    	tail = tmp;
//    }
//    else //�� ��尡 �ƴ϶�� ������尡 ���� ��带 ����Ŵ(�� ���� ��� ����)
//      tmp.setNext(cur.getNext());
// }
//}
//
//
//
//	public static void main(String[] args) {
//	  GraphicEditor editor = new GraphicEditor();
//	  editor.run();
//	}
//
//}
