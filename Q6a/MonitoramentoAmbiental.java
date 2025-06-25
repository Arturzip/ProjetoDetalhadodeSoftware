package Q6a;

//>> Considerei esse padrão complexo durante a escrita do codigo, 
//>> então optei por juntar as classes em um único arquivo para facilitar a visualização (e meus testes).

import java.util.List;
import java.util.ArrayList;

interface Observador {
    void atualizar(double temperatura);
}

class SensorTemperatura {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura;

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void setTemperatura(double novaTemperatura) {
        System.out.println("Nova temperatura detectada: " + novaTemperatura + "°C");
        this.temperatura = novaTemperatura;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(temperatura);
        }
    }
}

class Display implements Observador {
    public void atualizar(double temperatura) {
        System.out.println("Display atualizando: Temperatura atual = " + temperatura + "°C");
    }
}

class Alarme implements Observador {
    public void atualizar(double temperatura) {
        if (temperatura > 40) {
            System.out.println("Alarme: Temperatura muito alta");
        }
    }
}

class RegistroLog implements Observador {
    public void atualizar(double temperatura) {
        System.out.println("Registrando temperatura: " + temperatura + "°C no log.");
    }
}

public class MonitoramentoAmbiental {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        Observador display = new Display();
        Observador alarme = new Alarme();
        Observador log = new RegistroLog();

        sensor.adicionarObservador(display);
        sensor.adicionarObservador(alarme);
        sensor.adicionarObservador(log);

        sensor.setTemperatura(25.0);
        sensor.setTemperatura(42.5);
    }
}

