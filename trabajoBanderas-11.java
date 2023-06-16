
package banderas;


public class Banderas {


    public static void main(String[] args) {
      int edadJuan = 20;
      int edadPedro = 20;
      boolean bandera1;
      bandera1 = (edadJuan > edadPedro);
        System.out.println(" resultado de bandera:" + bandera1);
        int edadLupe = 35;
        boolean bandera2;
        boolean bandera3;
        bandera2 = (edadLupe < edadPedro);
        bandera3 = (bandera1 && bandera2);
        System.out.println(" resultado de bandera 3:" + bandera3);
    }
    
}
