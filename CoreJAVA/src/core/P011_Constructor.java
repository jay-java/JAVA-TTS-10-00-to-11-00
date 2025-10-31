package core;

class User {
	int id;
	long contact;
	double salary;

	// 1.default
	User() {
		System.out.println("user defualt constructor");
	}

	// 2.parametrized
	User(int id, long contact, double salary) {
		this.id = id;
		this.contact = contact;
		this.salary = salary;
		System.out.println("inside constructor id : " + id + " contact : " + contact + " salary : " + salary);
	}

	// 3.copy

	public void showUserData() {
		System.out.println("show data in User class");
		System.out.println("in function id : " + id + " contact : " + contact + " salary : " + salary);
	}
}

public class P011_Constructor {
	public static void main(String[] args) {
		User u = new User();
		u.showUserData();

		User u1 = new User(1, 9876532, 987654.32);
		u1.showUserData();
	}
}
