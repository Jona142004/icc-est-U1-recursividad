public class Recursividad {
    public int factorial(int n){
        System.out.println("CALCULANDO EL FACTORIAL DE " + n);
        //caso base:  n sea 0! y 1! son iguales a 1
        if (n == 0 || n ==1 ) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
    
        }
        int resultado =  n * factorial(n - 1);
        System.out.println( " Resultado parcial para " + n +" * factorial("+(n-1)+") = " + resultado);
        return resultado;
    }
    //calcular la suma de los numeros consecutivos
    public int sumaConsecutivos(int n){
        if ( n ==1 ) {
            System.out.println("Caso base alcanzado  " + n + " es 1");
            return 1;
    
        }
        int resultado =  n + sumaConsecutivos(n - 1);
        System.out.println( " Resultado parcial para " + n +" + suma("+(n-1)+") = " + resultado);
        return resultado;

    }
    //Calcular potencia de numero
    public int potencia(int base, int exponente){
        if (exponente == 0) {
            System.out.println("Caso base alcanzado  " + base * exponente + " es 0");
            return 1;
        }
        int resultado = base * potencia(base , exponente -1);
        System.out.println("Resultado parcial para " + base + "^" + exponente + " = " + resultado);

        return resultado;

    }
    //Crear un metodo 
}
