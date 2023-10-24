import java.time.LocalDate;

public class Contact{
    
    public String firstName;
    public String secondName;
    public String patronymicName;
    public LocalDate birthday;
    public Long phoneNumber;
    public char sex;
    
    public Contact() {
    }

    public Contact(String firstName, String secondName, String patronymicName, LocalDate birthday, Long phoneNumber,
            char sex) {
        this.firstName = firstName;
        this.secondName = secondName;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
        return String.format("Контакт [Имя=%s, Фамилия=%s, Отчество=%s, Дата рождения=%d.%d.%d, Телефон=%d, Пол=%s]", 
        firstName, secondName, patronymicName, birthday.getDayOfMonth(), birthday.getMonthValue(), birthday.getYear(), phoneNumber, sex);
    }

    
}
