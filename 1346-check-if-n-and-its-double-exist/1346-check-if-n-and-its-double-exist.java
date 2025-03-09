class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int c=0;
        for(int i=0; i<arr.length; i++){
            m.put(arr[i],i);
            if(arr[i]==0)c++;
        }
        if(c>1)return true;

        for(int i=0; i<arr.length; i++){
            if(m.containsKey(2*arr[i])&& arr[i]!=0)return true;
        }
        return false;
        
    }
}