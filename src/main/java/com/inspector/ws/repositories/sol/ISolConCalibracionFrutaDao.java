package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolConCalibracionFrutaDto;
import com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolConCalibracionFrutaDao {

    public TabSolConCalibracionFrutaDto save(TabSolConCalibracionFrutaDto solConCalibracionFruta, String estReg);
    public void eliminarSolConCalibracionFruta(Long idSolConCalibracionFruta);
    public List<TabSolConCalibracionFrutaDto> getSolConCalibracionFrutaXIdSolCon(Long idSolConsolidadoGancho);
    public TabSolConCalibracionFrutaDto getSolConCalibracionFrutaXId(Long idSonConCalibracionFruta);
}
