package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarProgram {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4); // Adicionar 4 horas a data atual
        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE); // obter a quantidade de minutos da data
        int month = 1 + cal.get(Calendar.MONTH); // Obter a quantidade de meses da data (janeiro inicia em 0 por isso se acrescenta + 1)

        System.out.println(sdf.format(d));
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}
