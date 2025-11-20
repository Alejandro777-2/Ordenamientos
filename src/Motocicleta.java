public class Motocicleta {
    private int codigo;
    private String marca;
    private  int cilindraje ;
    private int anio ;
    private float precio;

    public Motocicleta(int codigo, String marca, int cilindraje, int anio, float precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.anio = anio;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Motocicleta " +
                "codigo: " + codigo +
                ", marca: " + marca +
                ", cilindraje: " + cilindraje +"cc"+
                ", año: " + anio +
                ", precio: " + precio  ;
    }
}
