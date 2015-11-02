
package ejercicio4;

class Pares extends Thread{
int suma=0;
    public Pares(String num_par) {
       super(num_par);
    }
    
@Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
                System.out.println("Resultado Pares: " + suma);
            }
        }
    
}
}
