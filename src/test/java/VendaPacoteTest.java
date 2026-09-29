import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

class VendaPacoteTest {

    @Test
    void deveRetornarComissaoVendaPacoteComResidencial() {
        Segmento segmento = new Residencial();
        VendaPacote venda = new VendaPacote(50.0f);
        venda.setSegmento(segmento);
        venda.setQtdPlanos(2);
        assertEquals(100.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaPacoteComPequenaEmpresa() {
        Segmento segmento = new PequenaEmpresa();
        VendaPacote venda = new VendaPacote(50.0f);
        venda.setSegmento(segmento);
        venda.setQtdPlanos(2);
        assertEquals(110.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaPacoteComMediaEmpresa() {
        Segmento segmento = new MediaEmpresa();
        VendaPacote venda = new VendaPacote(50.0f);
        venda.setSegmento(segmento);
        venda.setQtdPlanos(2);
        assertEquals(120.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaPacoteComGrandeEmpresa() {
        Segmento segmento = new GrandeEmpresa();
        VendaPacote venda = new VendaPacote(50.0f);
        venda.setSegmento(segmento);
        venda.setQtdPlanos(2);
        assertEquals(130.0f, venda.calcularComissao(), 0.01f);
    }

}