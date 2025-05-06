public class Main {
    public static void main(String[] args) {
        System.out.println("=== numberOfLeapYears Tests ===");
        System.out.println("2000–2020: " + APCalendar.numberOfLeapYears(2000, 2020)); 
        System.out.println("2016–2016: " + APCalendar.numberOfLeapYears(2016, 2016)); 
        System.out.println("2017–2017: " + APCalendar.numberOfLeapYears(2017, 2017)); 
        System.out.println("1900–1904: " + APCalendar.numberOfLeapYears(1900, 1904)); 

        System.out.println("\n=== dayOfWeek Tests ===");
        System.out.println("Jan 5, 2019: " + APCalendar.dayOfWeek(1, 5, 2019)); 
        System.out.println("Jan 10, 2019: " + APCalendar.dayOfWeek(1, 10, 2019)); 

      
        System.out.println("Mar 1, 2017: " + APCalendar.dayOfWeek(3, 1, 2017)); 
        System.out.println("Mar 1, 2016: " + APCalendar.dayOfWeek(3, 1, 2016)); 

    
        System.out.println("Feb 28, 2020: " + APCalendar.dayOfWeek(2, 28, 2020)); 
        System.out.println("Feb 29, 2020: " + APCalendar.dayOfWeek(2, 29, 2020)); 
        System.out.println("Dec 31, 2019: " + APCalendar.dayOfWeek(12, 31, 2019));
    }
}

