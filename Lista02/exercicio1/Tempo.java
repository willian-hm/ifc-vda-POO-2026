public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor 1: sem parâmetros (00:00:00)
    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Construtor 2: apenas hora
    public Tempo(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    // Construtor 3: hora e minuto
    public Tempo(int hora, int minuto) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    // Construtor 4: hora, minuto e segundo
    public Tempo(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    // Métodos para alterar hora, minuto ou segundo (retornam true se alterado com sucesso)
    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    // Retorna o tempo em segundos
    public long tempoEmSegundos() {
        long total = (this.hora * 3600L) + (this.minuto * 60L) + this.segundo;
        return total;
    }

    // Retorna a diferença em segundos entre este objeto e outro objeto Tempo
    public long diferencaTempo(Tempo outro) {
        long diferenca = this.tempoEmSegundos() - outro.tempoEmSegundos();
        if (diferenca < 0) {
            diferenca = diferenca * -1;
        }
        return diferenca;
    }

    // Retorna o tempo formatado como HH:MM:SS
    public String toString() {
        String h = (this.hora < 10) ? "0" + this.hora : "" + this.hora;
        String m = (this.minuto < 10) ? "0" + this.minuto : "" + this.minuto;
        String s = (this.segundo < 10) ? "0" + this.segundo : "" + this.segundo;
        return h + ":" + m + ":" + s;
    }
}
