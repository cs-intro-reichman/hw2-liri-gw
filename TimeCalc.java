public class TimeCalc {
        // adds integer to a given hour and returns it by the format
    public static void main(String[] args) {
        String str = args[0];
        int minToAdd = Integer.parseInt(args[1]);
        // converts the string to hour and minutes
        int hours = Integer.parseInt(str.substring(0, 2));
        int minutes = Integer.parseInt(str.substring(3));
        // calculates the sum of minutes total
        int totalMin = hours*60 + minutes + minToAdd;
        // convert total minutes to hh:mm
        minutes = totalMin%60;
        hours = (totalMin/60)%24;
        // adds '0' before the hrs or mns if needed
        String str2 = "";
        if(hours<10) {
            str2 += '0'; 
        }
        str2 += hours;
        str2 += ':';
        if(minutes<10) {
            str2 += '0';
        }
        str2 += minutes;
        System.out.println(str2);
    }
}
