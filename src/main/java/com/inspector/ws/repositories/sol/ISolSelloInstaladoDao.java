package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolSelloInstaladoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolSelloInstaladoDao {

    public TabSolSelloInstaladoDto save(TabSolSelloInstaladoDto solSelloInstalado, String estReg);

}
