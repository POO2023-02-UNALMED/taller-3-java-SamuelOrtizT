package taller3.televisores;

public class TV {
	Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV;
    public TV (Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }
    public Marca getMarca () {
        return this.marca;
    }
    public void setMarca (Marca marca) {
        this.marca = marca;
    }
    public int getCanal () {
        return this.canal;
    }
    public void setCanal (int canal) {
        if (canal > 0 && canal < 121) {
            this.canal = canal;
        }
    }
    public int getPrecio () {
        return this.precio;
    }
    public void setPrecio (int precio) {
        this.precio = precio;
    }
    public int getVolumen () {
        return this.volumen;
    }
    public void setVolumen (int volumen) {
        if (volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }
    public Control getControl () {
        return this.control;
    }
    public void setControl (Control control) {
        this.control = control;
        control.enlazar(this);
    }
    public static int getNumTV () {
        return TV.numTV;
    }
    public static void setNumTV (int numTV) {
        TV.numTV = numTV;
    }
    public void turnOn () {
        this.estado = true;
    }
    public void turnOff () {
        this.estado = false;
    }
    public boolean getEstado () {
        return this.estado;
    }
    public void canalUp () {
        if (getEstado() && getCanal() > 0 && getCanal() < 120) {
            this.canal++;
        }
    }
    public void canalDown () {
        if (getEstado() && getCanal() > 1 && getCanal() < 121) {
            this.canal--;
        }
    }
    public void volumenUp () {
        if (getEstado() && getVolumen() >= 0 && getVolumen() < 7) {
            this.volumen++;
        }
    }
    public void volumenDown () {
        if (getEstado() && getVolumen() > 0 && getVolumen() <= 7) {
            this.volumen--;
        }
    }
}