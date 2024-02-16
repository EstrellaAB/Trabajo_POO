package objetos;

public class DatosDePagoImpl implements DatosDePago{
	private String titularTarjeta;
	private int numTarjeta;
	private int mesCaducidad;
	private int anyoCaducidad;
		
	
	public DatosDePagoImpl() {
		super();
	}

	public DatosDePagoImpl(String titularTarjeta, int numTarjeta, int mesCaducidad, int anyoCaducidad) {
		super();
		this.titularTarjeta = titularTarjeta;
		this.numTarjeta = numTarjeta;
		this.mesCaducidad = mesCaducidad;
		this.anyoCaducidad = anyoCaducidad;
	}

	/**
	 * @return the titularTarjeta
	 */
	public String getTitularTarjeta() {
		return titularTarjeta;
	}

	/**
	 * @param titularTarjeta the titularTarjeta to set
	 */
	public void setTitularTarjeta(String titularTarjeta) {
		this.titularTarjeta = titularTarjeta;
	}

	/**
	 * @return the numTarjeta
	 */
	public int getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * @param numTarjeta the numTarjeta to set
	 */
	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * @return the mesCaducidad
	 */
	public int getMesCaducidad() {
		return mesCaducidad;
	}

	/**
	 * @param mesCaducidad the mesCaducidad to set
	 */
	public void setMesCaducidad(int mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}

	/**
	 * @return the anyoCaducidad
	 */
	public int getAnyoCaducidad() {
		return anyoCaducidad;
	}

	/**
	 * @param anyoCaducidad the anyoCaducidad to set
	 */
	public void setAnyoCaducidad(int anyoCaducidad) {
		this.anyoCaducidad = anyoCaducidad;
	}

	@Override
	public String toString() {
		return "DATOS DE PAGO: \r\n - Titular Tarjeta =" + titularTarjeta + "\r\n - Número Tarjeta =" + numTarjeta + "\r\n - Mes de Caducidad="
				+ mesCaducidad + "\r\n - Año de caducidad =" + anyoCaducidad ;
	}
	
	
	
}
