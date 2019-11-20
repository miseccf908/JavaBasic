package algorithmCase;

public class NineNine {
    public static void main(String[] args) {
        NineNine nineNine = new NineNine();
        //nineNine.m1(9);
        nineNine.m2(3);
    }

    private void m1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+ i*j+"  ");
            }
            System.out.println("");
        }
    }

/*http://blog.csdn.net/xmc281141947/article/details/70314339
    递归的三个条件：
    边界条件
    递归前进段
    递归返回段
    当边界条件不满足时，递归前进；当边界条件满足时，递归返回。*/
    private void m2(int i) {
        if(i==1){
            System.out.println("1*1=1");
        }else{
            m2(i-1);
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"  ");
            }
            System.out.println("");

        }
    }

}
