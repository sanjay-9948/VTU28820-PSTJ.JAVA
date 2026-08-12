class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int total=0;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int m =0;m<month-1;m++){
            total+=days[m];
        }
            if (isLeap(year)&& month>2){
                total++;
            }
        
        total+=day;
        return total;
    }

    public boolean isLeap(int year){
        return (year%400==0)||(year%4==0&&year%100!=0);
    }
}
