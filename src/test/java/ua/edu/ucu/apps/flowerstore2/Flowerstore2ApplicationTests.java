package ua.edu.ucu.apps.flowerstore2;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerController;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerService;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerType;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = ua.edu.ucu.apps.flowerstore.FlowerStoreApplication.class)
@WebMvcTest(FlowerController.class)
public class Flowerstore2ApplicationTests {

	@Mock
	private FlowerService flowerService;

	@InjectMocks
	private FlowerController flowerController;

	private MockMvc mockMvc;

	public Flowerstore2ApplicationTests() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(flowerController).build();
	}

	@Test
	public void testGetAllFlowers() throws Exception {
		Flower rose = new Flower(1L, "Rose", 10.0, 5.0, FlowerColor.RED, FlowerType.ROSE);
		List<Flower> flowers = Arrays.asList(rose);

		when(flowerService.getAllFlowers()).thenReturn(flowers);

		mockMvc.perform(get("/flowers"))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetAllFlowersWithData() throws Exception {
		Flower rose = new Flower(1L, "Rose", 10.0, 5.0, FlowerColor.RED, FlowerType.ROSE);
		Flower lily = new Flower(2L, "Chamomile", 8.0, 4.5, FlowerColor.WHITE, FlowerType.CHAMOMILE);
		List<Flower> flowers = Arrays.asList(rose, lily);

		when(flowerService.getAllFlowers()).thenReturn(flowers);

		mockMvc.perform(get("/flowers"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()").value(2))
				.andExpect(jsonPath("$[0].description").value("Rose"))
				.andExpect(jsonPath("$[1].description").value("Chamomile"));
	}
}
