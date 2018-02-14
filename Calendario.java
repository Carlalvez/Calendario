
public class Calendario
{
  // Dia.
  private int day;
  // Mes.
  private int month;
  // Año.
  private int year;
  
  /**
     * Constructor for objects of class Calendario
     */
    public Calendario()
    {
        day = 1;
        month = 1;
        year = 2001; //primer año
    }

    /**
     * (dd-mm-yy) 8 caracteres. 
     */
    public String obtenerFecha ()
    {
        String noNumDay = String.valueOf(day);
        String noNumMonth = String.valueOf(month);
        String noNumYear = String.valueOf(year);
        // If the day has only one character, put a zero before day.
        if (noNumDay.length() < 2)
        {
            noNumDay = "0" + String.valueOf(day);
        }
        // If the month has only one character, put a zero before day.
        if (noNumMonth.length() < 2)
        {
            noNumMonth = "0" + String.valueOf(month);
        }
        return noNumDay + "-" + noNumMonth + "-" + noNumYear.substring(2,4);
  }
  
  /**
  * Introduccion de datos por parte del usuario.
  */
  public void fijarFecha (int setDay, int setMonth, int setYear) 
  {
       day = setDay;
       month = setMonth;
       year = setYear;
  }
}