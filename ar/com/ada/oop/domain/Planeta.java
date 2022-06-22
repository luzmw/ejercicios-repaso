package domain;


public class Planeta {
    /*
● Cantidad de satélites de tipo int con valor inicial de cero.
● Masa en kilogramos de tipo double con valor inicial de cero.
● Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
● Diámetro en kilómetros de tipo int con valor inicial de cero.
● Distancia media al Sol en millones de kilómetros, de tipo int con valor inicial de cero.
● Tipo de planeta de acuerdo con su tamaño, String con los siguientes valores
posibles: GASEOSO, TERRESTRE y ENANO.
● Observable a simple vista, de tipo boolean con valor inicial false.
     */
    private String nombre;
    private int canitdadSatelites;
    public double masa;
    private double volumen;
    private   double diametro;
    private   int distanciaMedia;
    private   String tipoPlaneta;
    private   boolean observable;



    public Planeta() {
    }

    public Planeta(String nombre, int canitdadSatelites, double masa,
                   double volumen, double diametro, int distanciaMedia, String tipoPlaneta, boolean observable) {
        this.nombre = nombre;
        this.canitdadSatelites = canitdadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMedia = distanciaMedia;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanitdadSatelites() {
        return canitdadSatelites;
    }

    public void setCanitdadSatelites(int canitdadSatelites) {
        this.canitdadSatelites = canitdadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(int distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public String getTipoPlaneta() {
        return tipoPlaneta;
    }

    public void setTipoPlaneta(String tipoPlaneta) {
        this.tipoPlaneta = tipoPlaneta;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }
    //● Definir un método que imprima en pantalla los valores de los atributos de un planeta.

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", canitdadSatelites=" + canitdadSatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaMedia=" + distanciaMedia +
                ", tipoPlaneta='" + tipoPlaneta + '\'' +
                ", observable=" + observable +
                '}';
    }

    //● Calcular la densidad un planeta, como el cociente entre su masa y su volumen.
    public Double calcularDensidad( double volumen,int masa){
       Double densidad= masa/volumen;
        return  densidad;
    }

    /*
    ● Determinar si un planeta del sistema solar se considera exterior. Un planeta exterior
está situado más allá del cinturón de asteroides. El cinturón de asteroides se
encuentra entre 2.1 y 3.4 UA. Una unidad astronómica (UA) es la distancia entre la
Tierra y el Sol = 149597870 Km.

     */
    public  Boolean esExterior(){
        // if e imprimir
        return null;
    }
}
