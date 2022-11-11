public Notas(String nombre, int ID, String Materia, Double parcial1, Double parcial2, Double parcial3) {
		
		this.nombre = nombre;
		this.ID = ID;
		this.asignacion = asignacion;
		this.primerparcial= primerparcial;
		this.segundoparcial= segundoparcial;
		this.tercerparcial= tercerparcial;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getasignacion() {
		return asignacion;
	}

	public void setasignacion(String asignacion) {
		asignacion = asignacion;
	}

	public double getprimerParcial() {
		return primerparcial;
	}

	public void setprimerParcial1(double primerparcial) {
		this.primerparcial = primerparcial;
	}

	public double getsegundoParcial() {
		return segundoparcial;
	}

	public void setsegundoParcial(double segundoparcial) {
		this.segundoparcial = segundoparcial;
	}

	public double getTercerParcial() {
		return Tercerparcial;
	}

	public void setTercerParcial(double Tercerparcial) {
		this.Tercerparcial = Tercerparcial;
	}
}