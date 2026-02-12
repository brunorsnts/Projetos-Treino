public class Main {
    public static void main(String[] args) {
        MonitorTemperatura monitor = new MonitorTemperatura();

        monitor.registrarTemperatura(15, 25);
        monitor.registrarTemperatura(12, 35);

        Double[] temperaturas = monitor.getTemperaturas();

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != null) {
                monitor.exibirTemperatura(i);
            }
        }
    }
}
