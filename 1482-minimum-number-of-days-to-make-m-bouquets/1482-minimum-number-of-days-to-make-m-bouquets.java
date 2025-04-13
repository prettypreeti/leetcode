class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int lo=0,hi=(int)1e9,ans=-1;
        while(lo<=hi){
           int mid=(lo+hi)/2;
            if(isPossible(mid,bloomDay,m,k)){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
            return ans;
        }
        boolean isPossible(int mid,int[] bloomDay,int m,int k){
            int adj=0;
            int b=0;
            for(int i=0; i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    adj++;
                    if(adj==k){
                        b++;
                        adj=0;
                    }

                }
                else adj=0;
            }
            return b>=m;
        
        
    }
}