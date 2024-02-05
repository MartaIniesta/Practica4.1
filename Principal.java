import java.time.LocalDateTime;

public class Principal{
    public static void main(String[] args){
        System.out.println("Hola mundo");
    }

    public static void fechaYhora(){
        LocalDateTime actual = LocalDateTime.now();

        String a = "Fecha: " + actual.getDayOfMonth() + "/" + actual.getMonth() + "/" + actual.getYear() + "\nHora: " + actual.getHour() + ":" + actual.Minute() + ":" + actual.Second();
    }
}
