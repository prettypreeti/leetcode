class Solution {
    public int numUniqueEmails(String[] emails) {
       HashSet<String> set=new HashSet();
       for(String email:emails) {
        int atpos=email.indexOf('@');
        String localname=email.substring(0,atpos);
        String domainname=email.substring(atpos);
        
       localname=localname.replaceAll("\\.","");

       if(localname.contains("+")){
          int plusPos=localname.indexOf('+');
          localname=localname.substring(0,plusPos);
       }
    email = localname+domainname;
       set.add(email);
       }
       return set.size();
    }
}

    
