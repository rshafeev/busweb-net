package test.com.pgis.bus.net.models;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pgis.bus.net.models.TimeIntervalModel;

public class TimeIntervalTest {

	@Test
	public void serialTest() throws Exception {
		TimeIntervalModel model = new TimeIntervalModel(100);
		ObjectMapper mapper = new ObjectMapper();
		String jsonData = mapper.writeValueAsString(model);

		System.out.println(jsonData);

	}

}
