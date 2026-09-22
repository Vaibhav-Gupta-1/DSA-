class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[] = new int[2];
        for(int stu : students){
            count[stu]++;
        }
        int rem = sandwiches.length;
        for(int sand : sandwiches){
            if(count[sand]==0)  break;
            if(rem==0)  break;
            rem--;
            count[sand]--;
        }
        return rem;
    }
}