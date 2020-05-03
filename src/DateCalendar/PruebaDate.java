package DateCalendar;

import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import static java.time.temporal.TemporalAdjusters.next;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import static java.time.temporal.TemporalAdjusters.firstDayOfNextMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class PruebaDate {

	public static void main(String[] args) {
		
		System.out.println("fecha de tipo Date");// ¿?
		Date fecha = new Date(00201, 2, 13);
		System.out.println(fecha);

		System.out.println("----------------------------------\t");
		System.out.println();
		System.out.println("fecha de tipo Calendar");
		Calendar calendario = new GregorianCalendar(2020,2,13); // 13/3/2020
		System.out.println(calendario.getTime());

		System.out.println("------------------------------------\t");
		System.out.println();
		System.out.println("fecha de tipo LocalDate");
		LocalDate date = LocalDate.of(2020, 3, 13);
		System.out.println("la fecha de hoy es\t" + date);
		System.out.println("año " + date.getYear());
		System.out.println("nombre del mes\t" + date.getMonth());
		System.out.println("dia del mes\t" + date.getDayOfMonth());

		// otra forma de declarar la misma fecha que la anterior
		LocalDate date2 = LocalDate.of(2020, Month.MARCH, 13);
		LocalDate date3 = LocalDate.now();
		//otra forma mas de declarar el dia de hoy sin necesidad de parametros
		System.out.println("Aqui llamamos a la fecha actual con LocalDate.now()\t" + date3);

		System.out.println("----------------------------------------------");
		System.out.println();

		System.out.println("fecha de tipo LocalDateTime");
		LocalDateTime dateTime = LocalDateTime.of(2020, 3, 13, 13, 01, 20);// 2020/03/13 13:01:20
		System.out.println("la fecha de hoy con horas minutos y segundos\t" + dateTime);
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime2 = LocalDateTime.of(date3, time);
		System.out.println("Mostramos el objeto dateTIme2\t" + dateTime2);
		
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("Aqui llamamos a la clase Instant");
		Instant instante1 = Instant.ofEpochSecond(2500);// segundos a partir del 1/1/1970
		Instant instante2 = Instant.now();// otra forma de llamar a la fecha actual
		System.out.println("Imprimimos la clase Instant\t" + instante1);
		System.out.println("Lammamos a la fecha actual mediante .now()\t" + instante2);
		
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("Operaciones con el objeto Duration");
		LocalTime localTime1 = LocalTime.of(12, 25);
		LocalTime localTime2 = LocalTime.of(17, 35);
		Duration duration = Duration.between(localTime1, localTime2);
		System.out.println("mostramos la comparacion de los objetos localTime1/localTime2\t" + duration);
		
		//Otra opción de calcular la duración entre dos objetos es usando dos objetos LocalDateTime:

		LocalDateTime localDateTime1 = LocalDateTime.of(2016, Month.JULY, 18, 14, 13);
		LocalDateTime localDateTime2 = LocalDateTime.of(2016, Month.JULY, 20, 12, 25);
		Duration durat = Duration.between(localDateTime1, localDateTime2);
		System.out.println("mostramos la comparacion con objetos localDateTime\t" + durat);
		
		Duration oneDayDuration = Duration.of(2, ChronoUnit.DAYS);
		System.out.println("Creamos duracion de dias\t" + oneDayDuration);
		Duration twoDayDuration = Duration.ofDays(2);
		System.out.println("Otro metodo , mismo resultado\t" + twoDayDuration);
		
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("Probando la clase TemporalAdjusters");
		LocalDateTime fech1 = LocalDateTime.of(2016, Month.JULY, 25, 22, 11, 30);
		LocalDateTime fech2 = dateTime.with(next(DayOfWeek.SUNDAY)); //(1)
		LocalDateTime fech3 = dateTime.with(firstDayOfNextMonth()); //(2)
		LocalDateTime fech4 = dateTime.with(lastDayOfMonth()); //(3)
		System.out.println(fech1);
		System.out.println(fech2);
		System.out.println(fech3);
		System.out.println(fech4);
		
		
		//1. Retorna el proximo Domingo
		System.out.println("Ejercicio 1:");
		LocalDateTime dateTime21 = LocalDateTime.of(2020, Month.MARCH, 12, 00, 00);
		LocalDateTime dateTime1 = dateTime21.with(next(DayOfWeek.SUNDAY)); 
		System.out.println("El proximo domingo sera:\t" + dateTime1.getDayOfMonth()+ " " + dateTime1.getDayOfWeek() + "\n");

		
		//2. Retorna el primer dia del proximo mes (Agosto)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		LocalDate date21 = LocalDate.of(2020, 8, 1);
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)+5);
		System.out.println("Ejercicio 2:");
		System.out.println("Primer día de Agosto:\t" + calendar.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH) + " " + date21.getDayOfWeek() + "\n");

		
//		//3. Retorna el último día del mes (Julio).
		System.out.println("Ejercicio 3:");
		LocalDate day2 = LocalDate.of(2020, 7, 31);
		Calendar calendar2 = new GregorianCalendar(2020, 7, 1);
		System.out.println("El ultimo dia de Julio es: " + calendar2.getActualMaximum(Calendar.DAY_OF_MONTH) + " " + day2.getDayOfWeek() + "\n");
		
		
		//----------------------------------------------------------------------------------------------------//
		
	}
	

}
