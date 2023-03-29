public class StringManipulator {
    String a = "hola";
    String trimAndConcat(String string1, String string2) {
        //El metodo trim() eliminara los espacios a los extremos de cada cadena.
        return string1.trim()+string2.trim();
    }

    int getIndexOrNull(String str1, char character) {
        return str1.indexOf(character);
    }

    int getIndexOrNull(String str1, String str2){
        return str1.indexOf(str2);
    }

    String concatSubstring(String str1,int n1, int n2, String str2) {
        return str1.substring(n1, n2).concat(str2);
    }
}
