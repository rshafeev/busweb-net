package test.com.pgis.bus.net.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pgis.bus.net.helpers.GeoHelper;
import com.pgis.bus.net.models.geom.PointModel;

public class GeoHelperTest {

	@Test
	public void getDistanceFromPointToLineTest1() {
		PointModel p = new PointModel(50, 36.00001);

		PointModel p1 = new PointModel(50, 36);
		PointModel p2 = new PointModel(40, 30);

		double distance1 = GeoHelper.getDistance(p.getLat(), p.getLon(), p1.getLat(), p1.getLon(), p2.getLat(),
				p2.getLon());
		double distance2 = GeoHelper.getDistance(p1.getLat(), p1.getLon(), p2.getLat(), p2.getLon());
		System.out.println(distance1 - distance2);
		System.out.println(distance1);
		System.out.println(distance2);
		assertTrue(distance1 >= 0);
		assertTrue(distance2 >= 0);
		assertEquals(0, distance1 - distance2, 1);
	}

	@Test
	public void getDistanceTest() {
		PointModel p1 = new PointModel(50, 36);
		PointModel p2 = new PointModel(50, 36.1);

		double distance = GeoHelper.getDistance(p1.getLat(), p1.getLon(), p2.getLat(), p2.getLon());
		System.out.println(distance);
		assertTrue(distance >= 0);
	}

}
