package ua.edu.ucu.apps.flowerstore2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import ua.edu.ucu.apps.flowerstore.flowers.*;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(FlowerController.class)
public class FlowerstoreApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private FlowerService flowerService;

	@InjectMocks
	private FlowerController flowerController;

	@Test
	public void testGetAllFlowers() throws Exception {
		Flower rose = new Flower(1L, "Rose", 10.0, 5.0, FlowerColor.RED, FlowerType.ROSE);
		List<Flower> flowers = Arrays.asList(rose);

		when(flowerService.getAllFlowers()).thenReturn(flowers);

		mockMvc.perform(MockMvcRequestBuilders.get("/flowers"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAllFlowersWithData() throws Exception {
		Flower rose = new Flower(1L, "Rose", 10.0, 5.0, FlowerColor.RED, FlowerType.ROSE);
		Flower lily = new Flower(2L, "Lily", 8.0, 4.5, FlowerColor.WHITE, FlowerType.CHAMOMILE);
		List<Flower> flowers = Arrays.asList(rose, lily);

		when(flowerService.getAllFlowers()).thenReturn(flowers);

		mockMvc.perform(MockMvcRequestBuilders.get("/flowers"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2))
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].description").value("Rose"))
				.andExpect(MockMvcResultMatchers.jsonPath("$[1].description").value("Chamomile"));
	}
}
