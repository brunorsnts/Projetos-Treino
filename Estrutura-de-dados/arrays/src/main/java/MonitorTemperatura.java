import java.util.Arrays;

public class MonitorTemperatura {

    private Double[] temperaturas = new Double[24];

    public Double[] getTemperaturas() {
        return temperaturas.clone();
    }

    public void registrarTemperatura(int hora, double temperatura) {
        validarHora(hora);
        temperaturas[hora] = temperatura;
    }

    public void exibirTemperatura(int hora) {
        validarHora(hora);
        if (temperaturas[hora] != null) {
            System.out.println("Às " + hora + ":00 horas fez " + temperaturas[hora] + "°C");
        } else {
            System.out.println("Às " + hora + ":00 horas: Sem registro");
        }
    }

    private void validarHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida. Por favor digite um horário entre 0 e 23 horas");
        }
    }

    @Override
    public String toString() {
        return "MonitorTemperatura{" +
                "temperaturas=" + Arrays.toString(temperaturas) +
                '}';
    }
}
