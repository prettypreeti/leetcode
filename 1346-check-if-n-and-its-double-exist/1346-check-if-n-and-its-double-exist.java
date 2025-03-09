class Solution {
    public boolean checkIfExist(int[] arr) {
        // Arrays.sort(arr);
        // int i=0;
        // int j=arr.length-1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
            if(i!=j && arr[j]==2*arr[i]){
                return true;
            }}
            
        }
        return false ;
        
        
    }
}