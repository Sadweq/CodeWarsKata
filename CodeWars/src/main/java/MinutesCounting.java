public class MinutesCounting {

    /*
     *	Using the Java language, have the function CountingMinutesI(str) take the str parameter being passed
     *	which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen
     *	and return the total number of minutes between the two times.
     *
     *	The time will be in a 12 hour clock format.
     *
     * 	For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
     *
     * 	Sample:-
     *  		Input = "12:30pm-12:00am"	Output = 690
     *  		Input = "1:23am-1:08am"		Output = 1425
     */
    public static int CountingMinutesI(String str) {
        int minutes=0;                                                                                      //create and initialize variable containing result of program
        String[] InitialHours=str.split("-");                                                         //split sent string into 2 separate hours
        String DayPartOne=InitialHours[0].substring((InitialHours[0].length())-2);                //create variable to contain which part of day is written first
        String DayPartTwo=InitialHours[1].substring((InitialHours[1].length())-2);                //create variable to contain which part of day is written secondly
        String[] FirstTime=InitialHours[0].split(":");                                                //split first time to hours and minutes
        String[] SecondTime=InitialHours[1].split(":");                                               //split second time to hours and minutes

        int FirstTimeInMinutes=(Integer.parseInt(FirstTime[0])*60)+(Integer.parseInt(FirstTime[1].substring(0,2)));        //convert first time to minutes
        int SecondTimeInMinutes=(Integer.parseInt(SecondTime[0])*60)+(Integer.parseInt(SecondTime[1].substring(0,2)));     //convert second time to minutes
        if (!DayPartOne.equals(DayPartTwo)) {                                                          //check if we have same part of day
            minutes = 720;
            minutes = minutes + SecondTimeInMinutes-FirstTimeInMinutes;
        }else if (SecondTimeInMinutes>FirstTimeInMinutes){            //if not check-if second hour is less than 12 hours later
            minutes=minutes+SecondTimeInMinutes-FirstTimeInMinutes;
        }else{                                                                                         //in other case assume that passed between 12 and 24 hours
            minutes=1440+SecondTimeInMinutes-FirstTimeInMinutes;
        }

        System.out.println(minutes);
        return minutes;
    }

}
