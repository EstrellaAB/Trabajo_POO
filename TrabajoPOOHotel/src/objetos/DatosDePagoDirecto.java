package objetos;

public class DatosDePagoDirecto extends DatosDePagoImpl{
	
	private int cvv;	
	
	public DatosDePagoDirecto() {
		super();
	}
	
	public DatosDePagoDirecto(String titularTarjeta, int numTarjeta, int mesCaducidad, int anyoCaducidad, int cvv) {
		super(titularTarjeta, numTarjeta, mesCaducidad, anyoCaducidad);
		this.cvv = cvv;
	}

	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}

	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
}
