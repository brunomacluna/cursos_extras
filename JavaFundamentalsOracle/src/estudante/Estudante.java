package estudante;

public class Estudante {
	
	private String pNome;
	private String sNome;
	private int estuID;
	private boolean estuStatus;
	
	public Estudante(String pNome, String sNome, int estuID, boolean estuStatus) {
		
		this.pNome = pNome;
		this.sNome = sNome;
		this.estuID = estuID;
		this.estuStatus = estuStatus;
	}
	
	

	public String getpNome() {
		return pNome;
	}

	public void setpNome(String pNome) {
		this.pNome = pNome;
	}

	public String getsNome() {
		return sNome;
	}

	public void setsNome(String sNome) {
		this.sNome = sNome;
	}

	public int getEstuID() {
		return estuID;
	}

	public void setEstuID(int estuID) {
		this.estuID = estuID;
	}

	public boolean isEstuStatus() {
		return estuStatus;
	}

	public void setEstuStatus(boolean estuStatus) {
		this.estuStatus = estuStatus;
	}

	

}//class
