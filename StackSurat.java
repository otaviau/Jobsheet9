public class StackSurat {
    Surat20[] stack;
    int top;

    public StackSurat(int size){
        stack = new Surat20[size];
        top =-1;
    }

    public void push (Surat20 surat){
        if (top < stack.length-1) {
            stack[++top] = surat;
        }else{
            System.out.println("Stack penuh!");
        }
    }

    public Surat20 pop (){
        if (top>=0) {
            return stack[top--];
        }else{
            System.out.println("Stack kososng!");
            return null;
        }
    }

    public Surat20 peek(){
        if (top>=0) return stack[top];
        return null;
    }

    public void cariSurat(String nama){
        boolean ketemu = false;
        for(int i=0; i<=top; i++){
            if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: "+ stack[i].idSurat+" dari "+nama);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat dari "+nama+" tidak ditemukan");
        }
    }

}
