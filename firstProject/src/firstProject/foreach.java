package firstProject;

public class foreach {
	public static void main(String[] args) {
		foreach obj = new foreach();
		System.out.println(obj.umnoj(5,3));
		obj.isEvent(6);
		obj.isEvent(10);
	}
	public int umnoj(int a,int b) {
		int result = a * b;
		return result;
	}
	public void isEvent(int a) {
		if (a%2==0) {
			System.out.println("chetnoe");
		} else {
			System.out.println("nechetnoe");
		}
	}
}
