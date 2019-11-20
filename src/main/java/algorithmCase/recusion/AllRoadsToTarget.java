package algorithmCase.recusion;

public class AllRoadsToTarget {

    public static int[] targetNode={5,5};

    public boolean hasHorizontalPath(int[] tempNode,int[] targerNode){
        if(tempNode[1] < targerNode[1])
            return true;
        return false;
    }

    public boolean hasVerticalPath(int[] tempNode,int[] targerNode){
        if(tempNode[0] < targerNode[0])
            return true;
        return false;
    }

    public void stepHorizontal(int[] tempNode){
        tempNode[1] = tempNode[1]+1;
    }

    public void stepVertical(int[] tempNode){
        tempNode[0] = tempNode[0]+1;
    }

    public void steps(int[] targetNode){
        int[] startNode = {0,0};
        if(hasHorizontalPath(startNode,targetNode)){
            stepHorizontal(startNode);
        }


        if(startNode[0] == targetNode[0]){
            return;
        }else{

        }
    }

    public static void main(String[] arg){
        //int
    }
}


