package Predeterminadeo;

import java.util.Objects;

public class Persona {
	private String cui;
	private boolean dosis1 = false;
	private boolean dosis2 = false;	
	private String fecha1;
	private String fecha2;
	
	public Persona() {	
	}
	
	public Persona(String cui) {
		this.cui =cui;
	}
	
	public Persona(String cui, boolean dosis1,boolean dosis2, String fecha1, String fecha2) {
		this.cui = cui;
		this.dosis1 = dosis1;
		this.dosis2 = dosis2;
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cui);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cui, other.cui);
	}

	
	
	

	@Override
	public String toString() {
		return "Persona [cui=" + cui + ", dosis1=" + dosis1 + ", dosis2=" + dosis2 + ", fecha1=" + fecha1 + ", fecha2="
				+ fecha2 + "]";
	}

	public String getCui() {
		return cui;
	}
	public boolean getDosis1() {
		return dosis1;
	}

	public String getFecha1() {
		return fecha1;
	}


	
	public void setDosis2(boolean dosis2) {
		this.dosis2 = dosis2;
	}

	public void setFecha2(String fecha2) {
		this.fecha2 = fecha2;
	}

	public boolean getDosis2() {
		return dosis2;
	}

	public String getFecha2() {
		return fecha2;
	}
}