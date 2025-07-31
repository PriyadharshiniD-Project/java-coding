import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class time {
    public static void main(String args[])
    {
        LocalDateTime current=LocalDateTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-YYYY  hh-mm-ss");
        String formatted =current.format(format);
        System.out.println("The current date and time is: "+formatted);
    }
}
