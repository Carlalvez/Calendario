/**
 *
 * @author (Carlos Alvarez)
 * @version (21/02/2018)
 */
public class FechaYHora
{
    //save the clock
    private ClockDisplay clock;
    // save calendar
    private CalendarioBasico calendar;
    // save the date and time in a text chain
    private String displayString;

   /**
    * Constructor for objects of class FechaYHora
    */
   public FechaYHora()
    {
        calendar = new CalendarioBasico();
        clock =  new ClockDisplay();
        updateDisplay();
    }

   /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString =  calendar.obtenerFecha() + " " + clock.getTime();
    }
    
   /**
    * Return the current time of this display in the format HH:MM.
    */
   public String getFechaYHora()
    {
        return displayString;
    }
    
    
   /**
     * Set the time and the date
     */
    public void fijarFechaYHora(int setMin,int setHour, 
                                int setDay, int setMonth, int setYear)
    {
        clock.setTime(setHour,setMin);
        calendar.fijarFecha (setDay, setMonth,setYear);
    }
    /**
    * 
    */ 
   public void avanzar()
   {
       clock.timeTick();
       if (clock.getHours() == 0){
           calendar.avanzarFecha();
        }
        updateDisplay();
   }
}