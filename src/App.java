public class App {
    public static void main(String[] args) throws Exception {
        Recursividad recur = new Recursividad();
        int resultado = recur.factorial(5);
        System.out.println(resultado);
        int re1 = recur.sumaConsecutivos(5);
        System.out.println(re1);
        int ex = recur.potencia(2, 4);
        System.out.println(ex);
        int sum = recur.sumanumeros(456);
        System.err.println(sum);
    }
}
