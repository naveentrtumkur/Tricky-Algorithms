//Given a list of Intervals consisting of start time and end time, find whether a person can attend all the meetings or not.

public boolean canAttendMeetings(Interval[] intervals) {
    Arrays.sort(intervals, new Comparator<Interval>(){
        public int compare(Interval a, Interval b){
            return a.start-b.start;
        }
    });
 
    for(int i=0; i<intervals.length-1; i++){
        if(intervals[i].end>intervals[i+1].start){
            return false;
        }
    }
 
    return true;
} 
