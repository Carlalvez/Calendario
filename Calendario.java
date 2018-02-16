
public class Calendario
{
  // Dia.
  private int day;
  // Mes.
  private int month;
  // Año.
  private int year;
  
  /**
     * Constructor for objects of class BasicCalendar.
     */
    public Calendario()
    {
        day = 01;
        month = 01;
        year = 01; //primer año
    }

  /**
     * (dd-mm-yy) 8 caracteres. 
     */
    public String getdate ()
    {
        String date = (day+100) + "-" + (month+100) + "-" + (year+100); 
        date = date.substring(1,4) 
               + date.substring(5,8) 
               + date.substring(9,11);
        return date;
  }
  
  /**
  ** Introduccion de datos por parte del usuario.
  */
  public void setDate (int setDay, int setMonth, int setYear)
  {
      day = setDay;
      month = setMonth;
      // How we only want to store two numbers
      // and the value is between 2000 - 2099
      year = setYear - 2000;
  }
  
  /**
   * * Set a specific date.
   */
  public void addOneDay ()
  {
        if (day == 30)
        {
          day = 01;
            if (month == 12) 
            {
                month = 01;
                year += 1;                
            }
            else 
            {
                month += 1;
            }
        }// Check if adding a day changes the month or year.
        else 
        {
            day += 1;
        }
    } 
}