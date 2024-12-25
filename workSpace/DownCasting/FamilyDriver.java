class FamilyDriver{
	public static void main(String[] args){
	Parent p=new Child();
	Child c=(Child) p;
	
	
	
	System.out.println("downCasting"+c.p);
System.out.println("downCasting"+c.c);
	}
}