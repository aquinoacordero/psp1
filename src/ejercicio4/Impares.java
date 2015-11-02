package ejercicio4;

class Impares extends Thread {

    int suma = 0;

    public Impares(String num_impar) {
        super(num_impar);
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 1) {
                suma = suma + i;
                System.out.println("Resultado Impares: " + suma);
            }
        }
}
}
