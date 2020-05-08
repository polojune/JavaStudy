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
//	}//링크 연결 
//	public Shape getNext() {
//		return next;
//	}
//	public abstract void draw(); //추상 메소드
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
//		head = null; //시작 노드 
//		tail = null; // 끝 노드 
//		sc = new Scanner(System.in);
//	}
// public void run() { 
//	 System.out.println("그래픽 에디터 beauty를 실행합니다.");
//	 while(true) { 
//		 System.out.println("삽입(1),삭제(2),모두보기(3),종료(4)>>");
//		 int num = sc.nextInt();
//		 switch (num) {
//		case 1:
//             System.out.println("Line(1),Rect(2),Circle(3)>>");
//             num = sc.nextInt(); 
//             insert(num);
//             break;
//		case 2:
//			System.out.println("삭제할 도형의 위치>>");
//			num = sc.nextInt();
//			delete(num);
//            break;
//		case 3: 
//			print(); 
//			break; 
//			
//		case 4:
//			System.out.println("beauty을 종료합니다.");
//			sc.close();
//			return;
//		}
//		 
//	 }
// }
//
//
//public void insert(int draw) {// 노드 삽입
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
//		System.out.println("다시 입력해 주세요.");
//		return;
//	}
//    if(head==null) { //head가 아무것도 가리키지 않으면 
//    	head = grapic;// head랑 tail이 새로운 노드를 가리킴
//    	tail = grapic;
//    }
//    else { 
//    	tail.setNext(grapic);// 끝 노드에 새로운 노드를 연결하고
//    	tail = grapic; //끝 노드는 새로 만들어진 노드를 가리키게 함 
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
//public void delete(int num) { //num은 몇번째 노드인지
//    Shape cur = head; //현재 노드 
//    Shape tmp = head; 
//    int i; 
//    if(num==1) { //첫번째 노드를 삭제하는 경우 
//    	if(head==tail) { //노드가 한개 일 경우 
//    		head = null; 
//    		tail = null; 
//    		return;
//    	}
//    	else {//노드가 두개 이상 
//    		head = head.getNext();
//    		return;
//    	}
//    }
//    for (int j = 0; j < num; j++) {
//		tmp = cur;//현재 노드를 저장후 (즉, 이전 노드)
//		cur = cur.getNext(); //다음 노드로 이동 
//		if(cur ==null) { 
//			System.out.println("삭제할 수 없습니다.");
//			return;
//		}
//	}
//    if(i==num) {// 끝 노드를  가리킬때
//    	tmp.setNext(cur.getNext());
//    	tail = tmp;
//    }
//    else //끝 노드가 아니라면 이전노드가 다음 노드를 가리킴(즉 현재 노드 삭제)
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
