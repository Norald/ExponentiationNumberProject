import java.math.BigInteger;

/*Так как мы работаем с большими числами, в Java уже есть заранее написанный класс для работы с ними
* BigInteger, BigDecimal, в них уже заложены все методы для работы с большими числами,
* в том числе и возведение в степень по модулю, метод modPow()*/
public class ExponentiationTest {
    public static void main(String[] args) {
        System.out.println(getExponentiationOfValue(BigInteger.valueOf(595), BigInteger.valueOf(703), BigInteger.valueOf(991)));
        System.out.println(getExponentiationOfValue(BigInteger.valueOf(834), BigInteger.valueOf(2345), BigInteger.valueOf(198)));
    }

    public static BigInteger getExponentiationOfValue(BigInteger value, BigInteger degree, BigInteger module){//Передаем значения
        return value.modPow(degree, module);//Находим степень числа по модулю
    }
}
