/*
 * Student Name: Brayden Hermann
 * Lab Professor: David Haley
 * Due Date: 2/10/2023
 * Modified: 2/7/2023
 * Description: Assignment 1 - Cylinder Class
 */
public class Cylinder {
	// initialize variables
	private double radius, height;

	// constructors
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public Cylinder() {
		this.radius = 0.0;
		this.height = 0.0;
	}

	// getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// calculate the cylinder's curved surface area
	public double getCurvedSurfaceArea() {
		/* curved surface area of a cylinder: 2πrh
		 * Toppr, “Cylinder: Surface Area, Volume of a Cylinder, Videos, Formulas, Examples.”
		 * https://www.toppr.com/guides/maths/mensuration/cylinder/#:~:text=Area%20of%20the%20curved%20surface%20will%20be%20%3D%202%CF%80r%20%C3%97%20h%20%3D%202%CF%80rh
		 * (accessed February 7th, 2023)
		*/
		return 2 * Math.PI * this.radius * this.height;
	}
	
	// calculate the cylinder's total surface area
	public double getTotalSurfaceArea() {
		/* total surface area of a cylinder: 2πr (r+h)
		 * Toppr, “Cylinder: Surface Area, Volume of a Cylinder, Videos, Formulas, Examples.”
		 * https://www.toppr.com/guides/maths/mensuration/cylinder/#:~:text=Area%20of%20the%20curved%20surface%20will%20be%20%3D%202%CF%80r%20%C3%97%20h%20%3D%202%CF%80rh
		 * (accessed February 7th, 2023)
		*/
		return 2 * Math.PI * this.radius * (this.radius + this.height);
	}
}
