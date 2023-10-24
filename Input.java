import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {

    public static String inputData() {
        try (Scanner scan = new Scanner(System.in, "UTF-8")) {
            System.out.println("Добро пожаловать! Вам просили передать, чтобы Вы ввели свои данные, это очень важно!");
            System.out.println("Образец заполнения:\nIvanov Ivan Ivanovich 13.12.1990 88005553535 m\nVasilyeva Vasilisa Vasilievna 12.10.1977 89265553555 f\n");
            System.out.println("Введите свои данные через пробелы, следуя образцу выше:");
            String dataFromUser = scan.nextLine();
            return dataFromUser;
        } catch (Exception e) {
            throw new RuntimeException ("Ошибка ввода. Попробуйте еще раз!");
        }
    }

    public static String[] splitData(String dataToSplit) throws InputDataLengthException {
        String[] dividedUserData = dataToSplit.split(" ");
        if (dividedUserData.length != 6)
            throw new InputDataLengthException("Ошибка в количестве введённых параметров.");
        else return dividedUserData;
    }

    public static Contact checkData (String stringToCheck){
        String[] dataToCheck = splitData(stringToCheck);
        Contact contact = new Contact();
        contact.setSurname(checkString(dataToCheck[0]));
        contact.setFirstName(checkString(dataToCheck[1]));
        contact.setPatronymicName(checkString(dataToCheck[2]));
        contact.setBirthday(checkDate(dataToCheck[3]));
        contact.setPhoneNumber(checkPhone(dataToCheck[4]));
        contact.setSex(checkSex(dataToCheck[5]));
        return contact;
    }

    public static String checkString(String stringToCheck) throws NullStringException{
        if (stringToCheck == null) {
            throw new NullStringException("Нулевое значение в обязательном поле недопустимо");
        }
        return stringToCheck;
    }

    public static LocalDate checkDate(String stringToCheck) throws DateLengthException, DateWrongSymbolsException{
        char[] charsToCheck = stringToCheck.toCharArray();
        for (char c : charsToCheck) {
            if(Character.isLetter(c)) {
                throw new DateWrongSymbolsException("Некорректные символы в дате!");
            }
        }
        if (stringToCheck.length() < 10 || stringToCheck.length() > 10) {
            throw new DateLengthException("Невозможная длина даты");
        }
        String stringToCheckNew = stringToCheck.substring(0, 2) 
        + '-' + stringToCheck.substring(3, 5) 
        + '-' + stringToCheck.substring(6, 10);
        LocalDate date = LocalDate.parse(stringToCheckNew, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return date;
    }

    public static Long checkPhone(String stringToCheck) throws PhoneNumberLengthException, PhoneSymbolException{
        char[] charsToCheck = stringToCheck.toCharArray();
        for (char c : charsToCheck) {
            if(Character.isLetter(c)) {
                throw new PhoneSymbolException("Некорректные символы в набранном телефонном номере!");
            }
        }
        if (stringToCheck.length() < 11) {
            throw new PhoneNumberLengthException("Некорректная длина телефонного номера");
        }
        try {
            Long phoneNumber = Long.parseLong(stringToCheck);
            return phoneNumber;
        } catch (Exception e) {
            throw new PhoneSymbolException("Ошибка чтения телефона");
        }
    }

    public static char checkSex(String stringToCheck) throws SexIdentificationException{
        char sex = stringToCheck.charAt(0);
        if (sex != 'm' && sex != 'f'){
            throw new SexIdentificationException("Некорректно указан пол");
        }
        return sex;
    }

}
