package com.rhaxx.models;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	private double x0 = 0.0;
	private double y0 = 0.0;

	private double x1 = 3.0;
	private double y1 = 0.0;

	private double x2 = 3.0;
	private double y2 = 4.0;

	private double hypotnuse = 5.0; // from x0, y0 to x2, y2

	private double delta = 0.000000001;

	private Point p0 = new Point();
	private Point p1 = new Point(x1, y1);
	private Point p2 = new Point(x2, y2);

	@Test
	public void pointNoArgsTest() {
		Assert.assertNotNull(p0);
	}

	@Test
	public void pointArgsTest() {
		Assert.assertNotNull(p1);
	}

	@Test
	public void getSetX() {
		p0.setX(x0);
		Assert.assertEquals(p0.getX(), x0, delta);
	}

	@Test
	public void getSetY() {
		p0.setY(y0);
		Assert.assertEquals(p0.getY(), y0, delta);
	}

	@Test
	public void distanceNoArgsTest() {
		Assert.assertEquals(p0.distance(), x0, delta); // origin
		Assert.assertEquals(p1.distance(), x1, delta); // 3 in the x
	}

	@Test
	public void distanceArgsTest() {
		Assert.assertEquals(p0.distance(p2), hypotnuse, delta);
		Assert.assertEquals(p0.distance(p1), x1, delta);
		Assert.assertEquals(p1.distance(p2), y2, delta);
	}

}
