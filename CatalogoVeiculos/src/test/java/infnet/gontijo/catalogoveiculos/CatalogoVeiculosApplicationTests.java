package infnet.gontijo.catalogoveiculos;


import infnet.gontijo.catalogoveiculos.model.Veiculo;
import infnet.gontijo.catalogoveiculos.repository.VeiculoRepository;
import infnet.gontijo.catalogoveiculos.service.VeiculoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
//@AutoConfigureMockMvc
class CatalogoVeiculosApplicationTests {
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private VeiculoRepository veiculoRepository;
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//    @Autowired
//    @MockBean
//    private VeiculoService veiculoService;
//
//    @BeforeEach
//    public void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    void contextLoads() {
//    }
//
//    @Test
//    public void testeAdd() throws Exception {
//        Veiculo veiculo = new Veiculo();
//        veiculo.setMarca("Fiat");
//        veiculo.setModelo("Palio");
//        veiculo.setAno("2018");
//        veiculo.setCor("Branco");
//
//        when(veiculoService.save(any(Veiculo.class))).thenReturn(veiculo);
//
//        mockMvc.perform(post("/api/veiculos").contentType(MediaType.APPLICATION_JSON)
//                .content("{\"marca\":\"Fiat\", \"modelo\":\"Palio\", \"ano\":\"2018\", \"cor\":\"Branco\"}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.marca").value("Fiat"))
//                .andExpect(jsonPath("$.modelo").value("Palio"))
//                .andExpect(jsonPath("$.ano").value("2018"))
//                .andExpect(jsonPath("$.cor").value("Branco"));
//    }
//
//    @Test
//    public void testeGetAll() throws Exception {
//        mockMvc.perform(get("/api/veiculos")).andExpect(status().isOk());
//    }
//
//    @Test
//    public void testGetById() throws Exception {
//        Veiculo veiculo = new Veiculo();
//        veiculo.setMarca("Fiat");
//        veiculo.setModelo("Palio");
//        veiculo.setAno("2018");
//        veiculo.setCor("branco");
//
//        when(veiculoService.findById(1)).thenReturn(Optional.of(veiculo));
//        mockMvc.perform(get("/api/veiculos/{id}", 1)).andExpect(status().isOk())
//                .andExpect(jsonPath("$.marca").value("Fiat"))
//                .andExpect(jsonPath("$.modelo").value("Palio"))
//                .andExpect(jsonPath("$.ano").value("2018"))
//                .andExpect(jsonPath("$.cor").value("branco"));
//    }
//
//    @Test
//    public void testeDelete() throws Exception {
//        Veiculo veiculo = new Veiculo();
//        veiculo.setMarca("Fiat");
//        veiculo.setModelo("Palio");
//        veiculo.setAno("2018");
//        veiculo.setCor("branco");
//
//        when(veiculoService.findById(1)).thenReturn(Optional.of(veiculo));
//        mockMvc.perform(delete("/api/veiculos/1"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        Veiculo veiculo = new Veiculo();
//        veiculo.setMarca("Marca 1");
//        veiculo.setModelo("Modelo 1");
//        veiculo.setAno("Ano 1");
//        veiculo.setCor("Cor 1");
//
//        when(veiculoService.findById(1)).thenReturn(Optional.of(veiculo));
//        when(veiculoService.save(any(Veiculo.class))).thenReturn(veiculo);
//
//        mockMvc.perform(put("/api/veiculos/1")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"marca\":\"Fiat\", \"modelo\":\"Palio\", \"ano\":\"2018\", \"cor\":\"branco\"}"))
//                .andExpect(jsonPath("$.marca").value("Fiat"))
//                .andExpect(jsonPath("$.modelo").value("Palio"))
//                .andExpect(jsonPath("$.ano").value("2018"))
//                .andExpect(jsonPath("$.cor").value("branco"))
//                .andExpect(status().isOk());
//
//    }

}
