package com.paivasoft.sysproduction.dao.espec;

import com.paivasoft.sysproduction.domain.UsuarioBean;

public interface CrudUsuarioEspec extends CrudEspec<UsuarioBean>{
	public UsuarioBean validar(String usuario, String clave);

}


