package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolSelloInstaladoDao {

    TabSolSelloInstaladoDto getSolSelloInstaladoById(Long idSolicitud);

    public TabSolSelloInstaladoDto save(TabSolSelloInstaladoDto solSelloInstalado, String estReg);

}
