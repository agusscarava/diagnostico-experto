public class Sintoma {
    private boolean noArranca;
    private boolean seCalienta;
    private boolean ruidoFrenar;
    private boolean testigoBateria;
    private boolean humoBlanco;
    private boolean olorNafta;
    private boolean pierdePotencia;
    private boolean lucesDebenApagadas;

    public Sintoma(boolean noArranca, boolean seCalienta,
                   boolean ruidoFrenar, boolean testigoBateria,
                   boolean humoBlanco, boolean olorNafta,
                   boolean pierdePotencia, boolean lucesDebenApagadas) {
        this.noArranca = noArranca;
        this.seCalienta = seCalienta;
        this.ruidoFrenar = ruidoFrenar;
        this.testigoBateria = testigoBateria;
        this.humoBlanco = humoBlanco;
        this.olorNafta = olorNafta;
        this.pierdePotencia = pierdePotencia;
        this.lucesDebenApagadas = lucesDebenApagadas;
    }

    public boolean isNoArranca() { return noArranca; }
    public boolean isSeCalienta() { return seCalienta; }
    public boolean isRuidoFrenar() { return ruidoFrenar; }
    public boolean isTestigoBateria() { return testigoBateria; }
    public boolean isHumoBlanco() { return humoBlanco; }
    public boolean isOlorNafta() { return olorNafta; }
    public boolean isPierdePotencia() { return pierdePotencia; }
    public boolean isLucesDebenApagadas() { return lucesDebenApagadas; }
}
