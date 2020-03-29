package Home_Work_03;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle () {
		this.length = 100;
		this.width = 50;
	}
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	
	public void areaRectangle () {
		System.out.print("Площа прямокутника = ");
		System.out.println(length * width);
		
	}
	
	public void perimeterRectangle () {
		System.out.print("Периметр прямокутника = ");
		System.out.println((length + width) * 2);
	}

}
