import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void writeDataToFile(Contact contact) {
        String fileName = contact.getSurname() +".json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(String.format("<%s>, <%s>, <%s>, <%d.%d.%d>, <%d>, <%s>\n", 
            contact.getSurname(), contact.getFirstName(), contact.getPatronymicName(), 
            contact.getBirthday().getDayOfMonth(), contact.getBirthday().getMonthValue(), 
            contact.getBirthday().getYear(), contact.getPhoneNumber(), contact.getSex()));
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
    }
}
}