public class FizzBuzz {
    public String fizzBuzz(Integer numero) {
        if( numero % 3 == 0 && numero % 5 == 0 ) {
            return "FizzBuzz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else {
            return numero.toString();
        }
    }
}
