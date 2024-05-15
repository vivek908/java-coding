class FrequencyofDuplicate{
    public static void main(String[] args) {
        String s="abb a b c d";
        int count;
        int n=s.length();
       char string[]=s.toCharArray();
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(string[i]==string[j] && string[i]!=' '){
                    count++;
                    string[j]='0';
                }
            }
            if(count>1 && string[i]!='0'){
                System.out.println(string[i]+ " count value is :"+ count);
            }
        }
     
        

    }
}