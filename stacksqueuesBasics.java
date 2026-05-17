class stacksqueuesBasics{
    class stack{
    int top=-1;
    int[] stack = new int[size];

    void  push (int value){
        if(top==size-1;){
            System.out.println("overflow condition");
            return;
        }
        top++;
        arr[top]=value;
    }
    int pop(){
        if(top==-1){
            System.out.println("underflow condition");
            return;
        }
        int value = arr[top];
        top--;

    }
    int top(){
        if(top==-1){
            System.out.println("empty");
        }
        return stack[top];
    }
}

class queues{
    int size=10;
    int q[] = new int[size];
    int start=-1;
    int end=-1;
    int currsize=0;

    void push(int value){
        if(currsize==size){
            System.out.println("qeue is full");
            return;
        }
        if(currsize==0){
            start=0;
            end=0;
        }
        else{
            end = (end+1)%size;
        }
        q[end]=value;
        currsize++;
    }
    int pop(){
        if(currsize==0){
            System.out.println("empty");
            return;
        }
        int value = q[start];
        if(currsize==1){
            start=-1;
            end=-1;
        }
        else{
            start = (start+1)%size;
        }
        
        currsize--;
        return value;
    }
}
    
}