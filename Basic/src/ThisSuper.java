
 class subClass {

	// instance variable
	int a = 10;

	// static variable
	static int b = 20;

}

 public class ThisSuper extends subClass {
		// instance variable
		int a = 106;

		// static variable
		static int b = 205;
	 
	 
	void doSuper() {
		// referring parent class(i.e, class Parent)
		// instance variable(i.e, a)
		System.out.println(super.a);

		// referring parent class(i.e, class Parent)
		// static variable(i.e, b)
		System.out.println(super.b);
	}

	void doThis() {
		// referring current class(i.e, class RR)
		// instance variable(i.e, a)
		//this.a = 100;

		System.out.println("this.a = 100;--------->    " + a);

		// referring current class(i.e, class RR)
		// static variable(i.e, b)
		this.b = 600;

		System.out.println("this.b = 600---->   " + b);

		// referring current class(i.e, class RR)
		// instance variable(i.e, a) again
		this.a = 9000;

		System.out.println("this.a = 9000------>     " + a);
	}

	public static void main(String[] args) {
		// Uncomment this and see here you get
		// Compile Time Error since cannot use 'super'
		// in static context.
		// super.a = 700;
		System.out.println("---------------super-----------");

		new ThisSuper().doSuper();

		// Uncomment this and see here you get
		// Compile Time Error since cannot use
		// 'this' in static context.
		// this.a = 700;
		// new ThisSuper().doSuper();

		System.out.println("---------------this-----------");
		new ThisSuper().doThis();

	}
}
