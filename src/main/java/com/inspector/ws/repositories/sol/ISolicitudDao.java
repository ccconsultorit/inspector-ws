package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

import java.util.List;

import static com.inspector.ws.db.schema.tables.TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO;
import static com.inspector.ws.db.schema.tables.TabSolContenedor.TAB_SOL_CONTENEDOR;
import static com.inspector.ws.db.schema.tables.TabSolControlPeso.TAB_SOL_CONTROL_PESO;
import static com.inspector.ws.db.schema.tables.TabSolFinca.TAB_SOL_FINCA;
import static com.inspector.ws.db.schema.tables.TabSolProceso.TAB_SOL_PROCESO;
import static com.inspector.ws.db.schema.tables.TabSolSelloInstalado.TAB_SOL_SELLO_INSTALADO;
import static com.inspector.ws.db.schema.tables.TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA;
import static com.inspector.ws.db.schema.tables.TabSolTransportista.TAB_SOL_TRANSPORTISTA;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolicitudDao {

    List<TabSolicitudDto> getAll();

    TabSolicitudDto getSolicitudById(Long solicitudId);

    List<SolicitudCompletaDto> getSolicitudesByEstado(String estado);

    Long save(TabSolicitudDto solicitud, String estRegSol);

    void delete(Long idSolicitud);

    void updateEstado(Long idSolicitud, String estado);




}
