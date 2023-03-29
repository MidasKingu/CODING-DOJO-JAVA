public class Main {
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();
        //La función trimAndConcat() eliminará los espacios de cada uno de los string y los sumara.
        String result = stringManipulator.trimAndConcat("Buenos dias ", "Señorito");
        System.out.println(result);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~++
        //La función getIndexOrNull() pide un string , un caracter y devuelve el indice en que el string contiene
        // el caracter, si el caracter no se encuentra presente devuelve -1
        int result2 = stringManipulator.getIndexOrNull("Saludar", 'n');
        System.out.println(result2);
        //La función getIndexOrNull() pide un string , un caracter y devuelve el indice en que el string contiene
        // el segundo string, si el segundo string no se encuentra presente devuelve -1
        int result3 = stringManipulator.getIndexOrNull("Hola","la");
        System.out.println(result3);
        //Obtener una subcadena utilizando un índice de inicio y un índice de
        // finalización y concatenarlo con la segunda cadena
        String result4 = stringManipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(result4);
    }
}