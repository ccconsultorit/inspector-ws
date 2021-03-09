/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema;


import com.inspector.ws.db.schema.tables.TabSolCalCalibre;
import com.inspector.ws.db.schema.tables.TabSolCalDefectoSeleccion;
import com.inspector.ws.db.schema.tables.TabSolCalLargoDedo;
import com.inspector.ws.db.schema.tables.TabSolCalPackingList;
import com.inspector.ws.db.schema.tables.TabSolCalPesoCluster;
import com.inspector.ws.db.schema.tables.TabSolCalidad;
import com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta;
import com.inspector.ws.db.schema.tables.TabSolConsolidadoGancho;
import com.inspector.ws.db.schema.tables.TabSolContenedor;
import com.inspector.ws.db.schema.tables.TabSolControlPeso;
import com.inspector.ws.db.schema.tables.TabSolFinca;
import com.inspector.ws.db.schema.tables.TabSolImagen;
import com.inspector.ws.db.schema.tables.TabSolProceso;
import com.inspector.ws.db.schema.tables.TabSolProductor;
import com.inspector.ws.db.schema.tables.TabSolSelloInstalado;
import com.inspector.ws.db.schema.tables.TabSolSelloLlegada;
import com.inspector.ws.db.schema.tables.TabSolTransportista;
import com.inspector.ws.db.schema.tables.TabSolicitud;
import com.inspector.ws.db.schema.tables.TabUsuario;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index TAB_SOL_CAL_CALIBRE_PKEY = Indexes0.TAB_SOL_CAL_CALIBRE_PKEY;
    public static final Index TAB_SOL_CAL_DEFECTO_SELECCION_PKEY = Indexes0.TAB_SOL_CAL_DEFECTO_SELECCION_PKEY;
    public static final Index TAB_SOL_CALIDAD_PKEY = Indexes0.TAB_SOL_CALIDAD_PKEY;
    public static final Index TAB_SOL_CAL_LARGO_DEDO_PKEY = Indexes0.TAB_SOL_CAL_LARGO_DEDO_PKEY;
    public static final Index TAB_SOL_CAL_PACKING_LIST_PKEY = Indexes0.TAB_SOL_CAL_PACKING_LIST_PKEY;
    public static final Index TAB_SOL_CAL_PESO_CLUSTER_PKEY = Indexes0.TAB_SOL_CAL_PESO_CLUSTER_PKEY;
    public static final Index TAB_SOL_CON_CALIBRACION_FRUTA_PKEY = Indexes0.TAB_SOL_CON_CALIBRACION_FRUTA_PKEY;
    public static final Index TAB_SOL_CONSOLIDADO_GANCHO_PKEY = Indexes0.TAB_SOL_CONSOLIDADO_GANCHO_PKEY;
    public static final Index TAB_SOL_CONTENEDOR_PKEY = Indexes0.TAB_SOL_CONTENEDOR_PKEY;
    public static final Index TAB_SOL_CONTROL_PESO_PKEY = Indexes0.TAB_SOL_CONTROL_PESO_PKEY;
    public static final Index TAB_SOL_FINCA_PKEY = Indexes0.TAB_SOL_FINCA_PKEY;
    public static final Index TAB_SOLICITUD_PKEY = Indexes0.TAB_SOLICITUD_PKEY;
    public static final Index TAB_SOL_IMAGEN_PKEY = Indexes0.TAB_SOL_IMAGEN_PKEY;
    public static final Index TAB_SOL_PROCESO_PKEY = Indexes0.TAB_SOL_PROCESO_PKEY;
    public static final Index TAB_SOL_PRODUCTOR_PKEY = Indexes0.TAB_SOL_PRODUCTOR_PKEY;
    public static final Index TAB_SOL_SELLO_INSTALADO_PKEY = Indexes0.TAB_SOL_SELLO_INSTALADO_PKEY;
    public static final Index TAB_SOL_SELLO_LLEGADA_PKEY = Indexes0.TAB_SOL_SELLO_LLEGADA_PKEY;
    public static final Index TAB_SOL_TRANSPORTISTA_PKEY = Indexes0.TAB_SOL_TRANSPORTISTA_PKEY;
    public static final Index TAB_USUARIO_PKEY = Indexes0.TAB_USUARIO_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index TAB_SOL_CAL_CALIBRE_PKEY = Internal.createIndex("tab_sol_cal_calibre_pkey", TabSolCalCalibre.TAB_SOL_CAL_CALIBRE, new OrderField[] { TabSolCalCalibre.TAB_SOL_CAL_CALIBRE.ID_SOL_CAL_CALIBRE }, true);
        public static Index TAB_SOL_CAL_DEFECTO_SELECCION_PKEY = Internal.createIndex("tab_sol_cal_defecto_seleccion_pkey", TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION, new OrderField[] { TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION.ID_SOL_CAL_DEFECTO_SELECCION }, true);
        public static Index TAB_SOL_CALIDAD_PKEY = Internal.createIndex("tab_sol_calidad_pkey", TabSolCalidad.TAB_SOL_CALIDAD, new OrderField[] { TabSolCalidad.TAB_SOL_CALIDAD.ID_SOL_CALIDAD }, true);
        public static Index TAB_SOL_CAL_LARGO_DEDO_PKEY = Internal.createIndex("tab_sol_cal_largo_dedo_pkey", TabSolCalLargoDedo.TAB_SOL_CAL_LARGO_DEDO, new OrderField[] { TabSolCalLargoDedo.TAB_SOL_CAL_LARGO_DEDO.ID_SOL_CAL_LARGO_DEDO }, true);
        public static Index TAB_SOL_CAL_PACKING_LIST_PKEY = Internal.createIndex("tab_sol_cal_packing_list_pkey", TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST, new OrderField[] { TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.ID_SOL_CAL_PACKING_LIST }, true);
        public static Index TAB_SOL_CAL_PESO_CLUSTER_PKEY = Internal.createIndex("tab_sol_cal_peso_cluster_pkey", TabSolCalPesoCluster.TAB_SOL_CAL_PESO_CLUSTER, new OrderField[] { TabSolCalPesoCluster.TAB_SOL_CAL_PESO_CLUSTER.ID_SOL_CAL_PESO_CLUSTER }, true);
        public static Index TAB_SOL_CON_CALIBRACION_FRUTA_PKEY = Internal.createIndex("tab_sol_con_calibracion_fruta_pkey", TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA, new OrderField[] { TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.ID_SOL_CON_CALIBRACION_FRUTA }, true);
        public static Index TAB_SOL_CONSOLIDADO_GANCHO_PKEY = Internal.createIndex("tab_sol_consolidado_gancho_pkey", TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO, new OrderField[] { TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO.ID_SOL_CONSOLIDADO_GANCHO }, true);
        public static Index TAB_SOL_CONTENEDOR_PKEY = Internal.createIndex("tab_sol_contenedor_pkey", TabSolContenedor.TAB_SOL_CONTENEDOR, new OrderField[] { TabSolContenedor.TAB_SOL_CONTENEDOR.ID_SOL_CONTENEDOR }, true);
        public static Index TAB_SOL_CONTROL_PESO_PKEY = Internal.createIndex("tab_sol_control_peso_pkey", TabSolControlPeso.TAB_SOL_CONTROL_PESO, new OrderField[] { TabSolControlPeso.TAB_SOL_CONTROL_PESO.ID_SOL_CONTROL_PESO }, true);
        public static Index TAB_SOL_FINCA_PKEY = Internal.createIndex("tab_sol_finca_pkey", TabSolFinca.TAB_SOL_FINCA, new OrderField[] { TabSolFinca.TAB_SOL_FINCA.ID_SOL_FINCA }, true);
        public static Index TAB_SOLICITUD_PKEY = Internal.createIndex("tab_solicitud_pkey", TabSolicitud.TAB_SOLICITUD, new OrderField[] { TabSolicitud.TAB_SOLICITUD.ID_SOLICITUD }, true);
        public static Index TAB_SOL_IMAGEN_PKEY = Internal.createIndex("tab_sol_imagen_pkey", TabSolImagen.TAB_SOL_IMAGEN, new OrderField[] { TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_IMAGEN }, true);
        public static Index TAB_SOL_PROCESO_PKEY = Internal.createIndex("tab_sol_proceso_pkey", TabSolProceso.TAB_SOL_PROCESO, new OrderField[] { TabSolProceso.TAB_SOL_PROCESO.ID_SOL_PROCESO }, true);
        public static Index TAB_SOL_PRODUCTOR_PKEY = Internal.createIndex("tab_sol_productor_pkey", TabSolProductor.TAB_SOL_PRODUCTOR, new OrderField[] { TabSolProductor.TAB_SOL_PRODUCTOR.ID_SOL_PRODUCTOR }, true);
        public static Index TAB_SOL_SELLO_INSTALADO_PKEY = Internal.createIndex("tab_sol_sello_instalado_pkey", TabSolSelloInstalado.TAB_SOL_SELLO_INSTALADO, new OrderField[] { TabSolSelloInstalado.TAB_SOL_SELLO_INSTALADO.ID_SOL_SELLO_INSTALADO }, true);
        public static Index TAB_SOL_SELLO_LLEGADA_PKEY = Internal.createIndex("tab_sol_sello_llegada_pkey", TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA, new OrderField[] { TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.ID_SOL_SELLO_LLEGADA }, true);
        public static Index TAB_SOL_TRANSPORTISTA_PKEY = Internal.createIndex("tab_sol_transportista_pkey", TabSolTransportista.TAB_SOL_TRANSPORTISTA, new OrderField[] { TabSolTransportista.TAB_SOL_TRANSPORTISTA.ID_SOL_TRANSPORTISTA }, true);
        public static Index TAB_USUARIO_PKEY = Internal.createIndex("tab_usuario_pkey", TabUsuario.TAB_USUARIO, new OrderField[] { TabUsuario.TAB_USUARIO.ID_USUARIO }, true);
    }
}
