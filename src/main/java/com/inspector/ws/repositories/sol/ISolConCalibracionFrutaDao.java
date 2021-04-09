package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolConCalibracionFrutaDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolConCalibracionFrutaDao {

    public TabSolConCalibracionFrutaDto save(TabSolConCalibracionFrutaDto solConCalibracionFruta, String estReg);
}
