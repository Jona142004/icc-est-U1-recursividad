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
            System.out.println("Caso base alcanzado  " + base * exponente + " es 1");
            return 1;
        }
        int resultado = base * potencia(base , exponente -1);
        System.out.println("Resultado parcial para " + base + "^" + exponente + " = " + resultado);

        return resultado;

    }
    //Crear un metodo que sume los digitos de un numero
    // si =mando 456 sea igual a 15
    // 4+5+6 = 15
    // usar mod
    public int sumanumeros(int n){
        if (n < 10) {
            return n;
            
        }
        int resultado = (n % 10);
        System.out.println(resultado);
        return (n % 10) + sumanumeros(n / 10);
        //serie fibonaci
    }
    public int fibonaci (int n){
        //casos bases
        if (n == 0) return 0;  
        if(n == 1) return 1;            
            return fibonaci(n - 1) + fibonaci(n -2);
        }
    }
    
   


