import java.time.LocalDate;

public class Contact{
    
    public String surname;
    public String firstName;
    public String patronymicName;
    public LocalDate birthday;
    public Long phoneNumber;
    public char sex;
    
    public Contact() {
    }

    public Contact(String surname, String firstName, String patronymicName, LocalDate birthday, Long phoneNumber,
            char sex) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getSex() {
        return sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Контакт [Фамилия=%s, Имя=%s, Отчество=%s, Дата рождения=%d.%d.%d, Телефон=%d, Пол=%s]", 
        surname, firstName, patronymicName, birthday.getDayOfMonth(), birthday.getMonthValue(), birthday.getYear(), phoneNumber, sex);
    }

    
}
