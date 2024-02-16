package objetos;


public class ReservaImpl implements Reserva{
	//ATRIBUTOS 
	private String nombreHotel;	
	private int numPersonaReserva;
	private int mesReserva;
	private int diaInicioReserva;
	private int numDiasReserva;
	private int precioTotalReserva; 
	
//	CONSTRUCTORES
	public ReservaImpl() {
		super();
	}
	
	
	
	public ReservaImpl(String nombreHotel, int numPersonaReserva, int mesReserva, int diaInicioReserva,
			int numDiasReserva, int precioTotalReserva) {
		super();
		this.nombreHotel = nombreHotel;
		this.numPersonaReserva = numPersonaReserva;
		this.mesReserva = mesReserva;
		this.diaInicioReserva = diaInicioReserva;
		this.numDiasReserva = numDiasReserva;
		this.precioTotalReserva = precioTotalReserva; 
	}

// GETTERS AND SETTERS 
	/**
	 * @return the nombreHotel
	 */
	public String getNombreHotel() {
		return nombreHotel;
	}

	/**
	 * @param nombreHotel the nombreHotel to set
	 */
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	/**
	 * @return the mesReserva
	 */
	public int getMesReserva() {
		return mesReserva;
	}

	/**
	 * @param mesReserva the mesReserva to set
	 */
	public void setMesReserva(int mesReserva) {
		this.mesReserva = mesReserva;
	}

	/**
	 * @return the diaInicioReserva
	 */
	public int getDiaInicioReserva() {
		return diaInicioReserva;
	}

	/**
	 * @param diaInicioReserva the diaInicioReserva to set
	 */
	public void setDiaInicioReserva(int diaInicioReserva) {
		this.diaInicioReserva = diaInicioReserva;
	}

	/**
	 * @return the precioTotalReserva
	 */
	public int getPrecioTotalReserva() {
		return precioTotalReserva;
	}

	/**
	 * @param precioTotalReserva the precioTotalReserva to set
	 */
	public void setPrecioTotalReserva(int precioTotalReserva) {
		this.precioTotalReserva = precioTotalReserva;
	}

	/**
	 * @return the numPersonaReserva
	 */
	public int getNumPersonaReserva() {
		return numPersonaReserva;
	}
	/**
	 * @param numPersonaReserva the numPersonaReserva to set
	 */
	public void setNumPersonaReserva(int numPersonaReserva) {
		this.numPersonaReserva = numPersonaReserva;
	}
	/**
	 * @return the numDiasReserva
	 */
	public int getNumDiasReserva() {
		return numDiasReserva;
	}
	/**
	 * @param numDiasReserva the numDiasReserva to set
	 */
	public void setNumDiasReserva(int numDiasReserva) {
		this.numDiasReserva = numDiasReserva;
	}

	
	@Override
	public String toString() {
		
		return "RESUMEN RESERVA:  \r\n - Hotel = " + nombreHotel + "\r\n - Número de personas = " + numPersonaReserva + "\r\n - Mes reserva ="
				+ mesReserva + "\r\n - Dia inicio de reserva = " + diaInicioReserva + "\r\n - Número de días = " + numDiasReserva
				+ "\r\n - Precio Total de la Reserva = " + precioTotalReserva;
	}	
}
