import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

class VendaRenovacaoTest {

    @Test
    void deveRetornarComissaoVendaRenovacaoComResidencial() {
        Segmento segmento = new Residencial();
        VendaRenovacao venda = new VendaRenovacao(2000.0f);
        venda.setSegmento(segmento);
        assertEquals(2000.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaRenovacaoComPequenaEmpresa() {
        Segmento segmento = new PequenaEmpresa();
        VendaRenovacao venda = new VendaRenovacao(2000.0f);
        venda.setSegmento(segmento);
        assertEquals(2200.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaRenovacaoComMediaEmpresa() {
        Segmento segmento = new MediaEmpresa();
        VendaRenovacao venda = new VendaRenovacao(2000.0f);
        venda.setSegmento(segmento);
        assertEquals(2400.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaRenovacaoComGrandeEmpresa() {
        Segmento segmento = new GrandeEmpresa();
        VendaRenovacao venda = new VendaRenovacao(2000.0f);
        venda.setSegmento(segmento);
        assertEquals(2600.0f, venda.calcularComissao(), 0.01f);
    }

}