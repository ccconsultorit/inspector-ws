package com.inspector.ws.repositories.impl.seg;

import com.inspector.dto.seg.UsuarioDto;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.ws.repositories.seg.IUsuarioDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.inspector.ws.db.schema.tables.TabUsuario.TAB_USUARIO;


@Repository
public class UsuarioDao implements IUsuarioDao {

    @Autowired
    private DSLContext create;

    @Override
    public List<UsuarioDto> getAll() {
        return create.select().from(TAB_USUARIO)
                .where(TAB_USUARIO.ESTADO.eq(EstadoEnum.A.name()))
                .fetchInto(UsuarioDto.class);
    };

    @Override
    public UsuarioDto getUsuarioById(Integer id) {
        var a = TAB_USUARIO.as("a");
        return create.select().from(a)
                .where(a.ESTADO.eq(EstadoEnum.A.name()))
                .and(a.ID_USUARIO.eq(id))
                .fetchOneInto(UsuarioDto.class);
    }

    @Override
    public UsuarioDto getUsuarioByCorreo(String correo, String clave) {
        var a = TAB_USUARIO.as("a");
        return create.select().from(a)
                .where(a.ESTADO.eq(EstadoEnum.A.name()))
                .and(a.CORREO.eq(correo))
                .and(a.CLAVE.eq(clave))
                .fetchOneInto(UsuarioDto.class);
    }

}
