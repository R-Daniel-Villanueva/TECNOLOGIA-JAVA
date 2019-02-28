package com.axity.example;


        import com.axity.example.observer.PesoARGObservador;
        import com.axity.example.observer.PesoMXObservador;
        import com.axity.example.observer.SolObservador;
        import com.axity.example.observer.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 50 dólares obtendrá : ");
        subject.setEstado(50);
        System.out.println("-----------------");
    }
}