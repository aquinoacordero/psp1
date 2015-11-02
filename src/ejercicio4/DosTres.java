package ejercicio4;

class DosTres extends Thread {

    int suma = 0;

    public DosTres(String dos_tres) {

        super(dos_tres);
    }
    
    @Override
     public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 2 || i % 10 == 3) {
                suma = suma + i;
                System.out.println("Suma 2 y 3: " + suma);
            }
        }
}
}
