package composite;

public class ��� {

	String item1;
	String item2;
	String item3;
    
	public ���() {
		this("��","�Ǵ��⽺��","�и�����");
	}
	  
		public ���(String item1) {
			this(item1,"�Ǵ��⽺��","�и�����");
		}
		public ���(String item1, String item3) {
			this(item1,null, item3); 
		}
	
	public ���(String item1, String item2, String item3) {

		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;

	}
	

	public static void main(String[] args) {
        ��� l1 = new ���("��","�Ǵ��⽺��","�и�����");  
        System.out.println(l1.item3);
         
        ��� l2 = new ���("��","�Ǵ��⽺��","�и�����");
    
       
	}
}
