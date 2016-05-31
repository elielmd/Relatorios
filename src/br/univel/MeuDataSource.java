package br.univel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class MeuDataSource implements JRDataSource {

	private int contador = 0;

	@Override
	public Object getFieldValue(JRField arg0) throws JRException {
		if (arg0.getName().equals("id")) {
			return String.valueOf(contador);
		}
		return "Mah oeee!";
	}

	@Override
	public boolean next() throws JRException {
		return contador++ < 10;
	}
}
