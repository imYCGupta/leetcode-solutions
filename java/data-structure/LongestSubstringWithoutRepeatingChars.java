class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        List<Character>  listOfCHars = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;
        int currPos = 0;
        for(int i=currPos;i<chars.length;){
            if(listOfCHars.contains(chars[i])){
                if(maxLength < listOfCHars.size()){
                    maxLength = listOfCHars.size();
                }
                listOfCHars = new ArrayList<>();                
                i = currPos+1;
                currPos++;
            }                
            else{
                listOfCHars.add(chars[i]);
                i+=1;
            }
        }
        

        return maxLength < listOfCHars.size() ? listOfCHars.size() : maxLength;
    }
}