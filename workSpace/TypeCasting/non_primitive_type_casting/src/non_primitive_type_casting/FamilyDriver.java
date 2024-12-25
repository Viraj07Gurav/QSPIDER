package non_primitive_type_casting;

public class FamilyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		Child c=new Child();
		Parent upcasting=new Child();
		Parent upCast=c;
		
//		System.out.println("Parent Address "+p);
//		System.out.println("Upcasting "+upCast);
//		System.out.println("Upcasting "+upcasting);
		
		System.out.println("Parent "+upCast.p);
	

	}

}
