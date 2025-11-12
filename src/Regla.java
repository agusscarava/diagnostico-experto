public class Regla {
    private String id;
    private String descripcion;
    private int peso;

    private boolean noArranca;
    private boolean seCalienta;
    private boolean ruidoFrenar;
    private boolean testigoBateria;
    private boolean humoBlanco;
    private boolean olorNafta;
    private boolean pierdePotencia;
    private boolean lucesDebenApagadas;

    public Regla(String id, String descripcion, int peso,
                 boolean noArranca, boolean seCalienta, boolean ruidoFrenar,
                 boolean testigoBateria, boolean humoBlanco, boolean olorNafta,
                 boolean pierdePotencia, boolean lucesDebenApagadas) {
        this.id = id;
        this.descripcion = descripcion;
        this.peso = peso;
        this.noArranca = noArranca;
        this.seCalienta = seCalienta;
        this.ruidoFrenar = ruidoFrenar;
        this.testigoBateria = testigoBateria;
        this.humoBlanco = humoBlanco;
        this.olorNafta = olorNafta;
        this.pierdePotencia = pierdePotencia;
        this.lucesDebenApagadas = lucesDebenApagadas;
    }

    public boolean coincide(Sintoma s) {
        return (!noArranca || s.isNoArranca()) &&
               (!seCalienta || s.isSeCalienta()) &&
               (!ruidoFrenar || s.isRuidoFrenar()) &&
               (!testigoBateria || s.isTestigoBateria()) &&
               (!humoBlanco || s.isHumoBlanco()) &&
               (!olorNafta || s.isOlorNafta()) &&
               (!pierdePotencia || s.isPierdePotencia()) &&
               (!lucesDebenApagadas || s.isLucesDebenApagadas());
    }

    public Diagnostico generarDiagnostico() {
        return new Diagnostico(id, descripcion, peso);
    }
}
