package com.rhaxx.models;

public class Triangle {

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle() {
		this.p1 = new Point();
		this.p2 = new Point();
		this.p3 = new Point();
	}

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
	}

	public double getPerimeter() {
		return this.p1.distance(p2) + this.p2.distance(p3) + this.p3.distance(p1);
	}

	public double getArea() {
		double d1 = this.p1.distance(this.p2);
		double d2 = this.p2.distance(this.p3);
		double d3 = this.p1.distance(this.p3);
		/*
		 * 
		 * double ai = this.p2.getX() - this.p1.getX(); double bi = this.p3.getX() -
		 * this.p1.getX(); double aj = this.p2.getY() - this.p1.getY(); double bj =
		 * this.p3.getY() - this.p1.getY(); double top = ai * bi + aj * bj; double bot =
		 * Math.sqrt(ai * ai + aj * aj) * Math.sqrt(bi * bi + bj * bj); double theta =
		 * Math.acos(top / bot); double sinTheta = Math.sin(theta); double h = sinTheta
		 * * d3; System.out.println("d1: " + d1 + " d3: " + d3 + " ai: " + ai + " bi: "
		 * + bi + " aj: " + aj + " bj: " + bj + " top: " + top + " bot: " + bot +
		 * " theta: " + theta + " h: " + h); double area = d1 * h / 2;
		 */
		double s = this.getPerimeter() / 2;
		double area2 = Math.sqrt(s * (s - d1) * (s - d2 * (s - d3)));
		return area2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

}
