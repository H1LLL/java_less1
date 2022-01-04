package hill_homeworks;

public class home1 {

	
		public static void main(String[] args) {
			
			int a =1;
			int b = 7;
			int c =10;
			double d = b * b - 4 * a * c;
			double x1, x2;
			System.out.println("ax^2 + bx + c = 0");
			
			if(a==0) {
				System.out.println("Не являється квадратним рівнянням!");
			}else if(d ==0) {
				x1=(-b)/(2*a);
				System.out.println("x1 = x2 = "+ x1);
			}else if (d<0) {
				System.out.println("Рівняння не можливо розвязати - дискримінант менше 0");
			}else {
				x1 = ((-b) + Math.sqrt(d))/2*a;
				x2 = ((-b) - Math.sqrt(d))/2*a;
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
		}
}
