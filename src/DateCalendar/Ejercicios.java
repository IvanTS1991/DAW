package DateCalendar;

import static java.time.temporal.TemporalAdjusters.next;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.firstDayOfNextMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class Ejercicios {

	public static void main(String[] args) {
		
		//1. Retorna el proximo Domingo
		System.out.println("Ejercicio 1. Retorna el proximo Domingo:");
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.MARCH, 12, 00, 00);
		LocalDateTime dateTime1 = dateTime.with(next(DayOfWeek.SUNDAY)); 
		System.out.println("El proximo domingo sera:\t" + dateTime1.getDayOfMonth()+ " " + dateTime1.getDayOfWeek() + "\n");

		
		//2. Retorna el primer dia del proximo mes (Agosto)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		LocalDate date = LocalDate.of(2020, 8, 1);
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)+5);
		System.out.println("Ejercicio 2. Retorna el primer dia del proximo mes (Agosto):");
		System.out.println("Primer día de Agosto:\t" + calendar.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH) + " " + date.getDayOfWeek() + "\n");
	
		
		//3. Retorna el último día del mes (Julio).
		System.out.println("Ejercicio 3. Retorna el último día del mes (Julio):");
		LocalDate date2 = LocalDate.of(2020, 7, 31);
		Calendar calendar2 = new GregorianCalendar(2020, 7, 1);
		System.out.println("El ultimo dia de Julio es: " + calendar2.getActualMaximum(Calendar.DAY_OF_MONTH) + " " + date2.getDayOfWeek() + "\n");
		
		
		System.out.println("**********************************************************************************");
		
		
		//1. Crear fechas y formatos para : ""dd-MM-yyyy" y ""dd-MM-yyyy HH:mm:ss E"
		System.out.println("Ejercicio 1:");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss E");
		System.out.println("Fecha con formato dd-MM-yyyy" + sdf1.format(new Date()));
		System.out.println("Fecha con formato dd-MM-yyyy HH:mm:ss E" +sdf2.format(new Date()) + "\n");
		
		//2. Utilizando el objeto Calendar configurar la fecha para Mon Dec 31 00:00:00 IST 1990
		System.out.println("Ejercicio 2:");
		Calendar calendario = new GregorianCalendar(1990,11,31,00,00,00); 
		System.out.println(calendario.getTime() + "\n");
		
		/*3. DateFormat es una clase abstracta y SimpleDateFormat es una clase que hereda de la anterior. 
		     Averigua utilizando la última cómo se parsea (o convierte) un String a Formato Fecha de la fecha "02/25/2016". */
		System.out.println("Ejercicio 3: ");
		Date fecha = new Date(116, 1, 25);
		Format formatter = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(formatter.format(fecha) + "\n");
		
		
		/*4. Utilizando el siguiente código:
		final LocalDate now = LocalDate.now();
		final LocalDate birthdate2 = LocalDate.of(2012, 6, 30); 
		final LocalDate birthdate3 = LocalDate.of(2012, 6, 30);
		
		Utilizando isBefore, isAfter, isEqual, equals, etc, calcular:
			Si hoy es antes que birthdate2
			Si hoy es después que birthdate2
			Si es igual birthdate2 y birthdate3
		*/
        System.out.println("Ejercicio 4: ");
		final LocalDate now = LocalDate.now();
		final LocalDate birthdate2 = LocalDate.of(2012, 6, 30); 
		final LocalDate birthdate3 = LocalDate.of(2012, 6, 30);
		LocalDate d1 = LocalDate.now();
		
		System.out.println("¿ hoy es antes que birthdate2 ? " + d1.isBefore(birthdate2));
		System.out.println("¿ hoy es despues que birthdate2 ? " + d1.isAfter(birthdate2));
		System.out.println("¿ hoy es igual que birthdate2 ? " + d1.isEqual(birthdate2) + "\n" + " ¿y que birthdate3? " + d1.isEqual(birthdate3) + "\n");
		
		
		/*6. Averigua todas las zonas temporales disponibles utilizando ZoneId . 
		 * Configura con TimeZone la zona horaria a Canada/Yukon
		 */
		System.out.println("Ejercicio 6: ");
		ZoneId zoneId = ZoneId.of("Canada/Yukon");
		TimeZone gz = TimeZone.getTimeZone("Canada/Yukon");
		TimeZone.setDefault(gz);
		System.out.println("Todas las zonas temporales disponibles" + ZoneId.getAvailableZoneIds());
		System.out.println("Canada/Yukon pertenece a : " + gz.getDisplayName() + "\n");
		
		
		//7. Averigua para averiguar cuántos dias han pasado entre dos fechas LocalDate
		System.out.println("Ejercicio 7: ");
		LocalDate ld1 = LocalDate.of(2017, 5, 1);
		LocalDate ld2 = LocalDate.of(2017, 5, 18);
		long durat = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println("Cuantos dias han pasado: " + durat + "\n");

		
		/*8. Utilizando LocalDate y ChronoUnit.
		Suma un día a la fecha de hoy.
		Suma una hora a la fecha de hoy.
		Averigua los días que hay entre la fecha de hoy y tres días más añadidos. */
		System.out.println("Ejercicio 8: ");	
		
		LocalDate dia1 = LocalDate.now();
		System.out.println("Hoy es:\t" + dia1);
		LocalDate newDay = dia1.plusDays(1);
		LocalDateTime ldt1 =LocalDateTime.now();
		LocalDateTime newHour = ldt1.plusHours(1);
		LocalDate ld = ChronoUnit.DAYS.addTo(dia1,3);
		long comparation =ChronoUnit.DAYS.between(dia1, ld);
		System.out.println("Si añadimos un dia sera:\t" + newDay);
		System.out.println("Si añadimos una hora más sera:\t" + newHour);
		System.out.println("La diferencia es de "+comparation+" dias" + "\n");

		/*9. Teniendo las siguientes declaraciones:
			LocalTime start = LocalTime.of(1, 0, 0); // hora, minuto, segundo
			LocalTime end = LocalTime.of(2, 10, 20); // hora, minuto, segundo
			Calcula las horas, minutos, segundos, milisegundos, microsegundos y nanosegundos transcurridos entre los dos tiempos. */
		System.out.println("Ejercicio 9: ");
		LocalTime start = LocalTime.of(1, 0, 0); // hora, minuto, segundo
		LocalTime end = LocalTime.of(2, 10, 20); // hora, minuto, segundo
		long h =ChronoUnit.HOURS.between(start, end);
		long m =ChronoUnit.MINUTES.between(start, end);
		long s =ChronoUnit.SECONDS.between(start, end);
		long mls =ChronoUnit.MILLIS.between(start, end);
		long mcs =ChronoUnit.MICROS.between(start, end);
		long nns =ChronoUnit.NANOS.between(start, end);
		System.out.println(h + " horas " + m + " minutos " + s + " segundos " + mls + " milisegundos " + mcs + " microsegundos " + nns + " nanosegundos " + "\n");
		
		
		//10. Configura la zona horaria Asia/Kolkata y muestra la hora en esa zona horaria. Utiliza ZoneId y LocalTime.
		System.out.println("Ejercicio 10: ");
		ZoneId zid = ZoneId.of("Asia/Kolkata");
		TimeZone gg = TimeZone.getTimeZone("Asia/Kolkata");
		TimeZone.setDefault(gg);
		LocalTime lt = LocalTime.now(zid);
		System.out.println(gg.getDisplayName() + "\n" + "La hora en : " + gg.toZoneId()  + " es: " + lt + "\n");
		
		//11. Con el ejercicio anterior calcula la diferencia horaria entre tu zona horaria y la calculada anteriormente
		System.out.println("Ejercicio 11: ");
		ZoneId zidesp = ZoneId.of("GMT+1");
		TimeZone gesp = TimeZone.getTimeZone("GMT+1");
		TimeZone.setDefault(gesp);
		LocalTime españita = LocalTime.now(zidesp);
		long hh =ChronoUnit.HOURS.between(españita, lt);
		System.out.println("La diferencia horaria entre zonas es de: " + hh + " horas.");
	}

}
