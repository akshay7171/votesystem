

class cont {
	cont(int i) {
		System.out.println("A");
	}

}

class XYZ extends cont {
	XYZ()

	{
		super(10);
		System.out.println("B");
	}

	public static void main(String args[]) {
		cont a = new cont(10);
		XYZ x = new XYZ();
	}
}