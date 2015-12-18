package QuestionC;

public class Rectangle extends Shape {

	double Area = 0;
	
	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		try{
			Area = this.getX() * this.getY();
			
		}catch(IllegalRectangle e){
			e.printStackTrace();
		}
		
		return Area;

	}

}
