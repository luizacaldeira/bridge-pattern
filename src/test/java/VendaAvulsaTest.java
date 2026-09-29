import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

class VendaAvulsaTest {

    @Test
    void deveRetornarComissaoVendaAvulsaComResidencial() {
        Segmento segmento = new Residencial();
        VendaAvulsa venda = new VendaAvulsa(1000.0f);
        venda.setSegmento(segmento);
        assertEquals(1000.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaAvulsaComPequenaEmpresa() {
        Segmento segmento = new PequenaEmpresa();
        VendaAvulsa venda = new VendaAvulsa(1000.0f);
        venda.setSegmento(segmento);
        assertEquals(1000.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaAvulsaComMediaEmpresa() {
        Segmento segmento = new MediaEmpresa();
        VendaAvulsa venda = new VendaAvulsa(1000.0f);
        venda.setSegmento(segmento);
        assertEquals(1000.0f, venda.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoVendaAvulsaComGrandeEmpresa() {
        Segmento segmento = new GrandeEmpresa();
        VendaAvulsa venda = new VendaAvulsa(1000.0f);
        venda.setSegmento(segmento);
        assertEquals(1000.0f, venda.calcularComissao(), 0.01f);
    }

}