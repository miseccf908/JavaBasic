package sort;

public class SelectSort implements Sorter {
    /*
        //冒泡
        public void bubbleSort(int[] arr){
            int temp=0;
            int len=arr.length;
            if(len>0){
                for(int i=0;i<len;i++){
                    for(int j=i+1;j<len;j++){
                        if(arr[i]>arr[j]){
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
            }

        }*/
    @Override
    public void sort(String[] s) {
        String temp="";
        int len=s.length;
        if(len>0){
            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    if(s[i].compareTo(s[j])> 0){
                        temp=s[i];
                        s[i]=s[j];
                        s[j]=temp;
                    }
                }
            }
        }
    }

    @Override
    public void sort(int[] s) {
        int temp;
        int len=s.length;
        if(len>0){
            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    if(s[i]>s[j]){
                        temp=s[i];
                        s[i]=s[j];
                        s[j]=temp;
                    }
                }
            }
        }
    }


}
