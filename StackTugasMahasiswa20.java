public class StackTugasMahasiswa20 {
    Mahasiswa20[] stack;
    int top;
    int size;
    
    public StackTugasMahasiswa20(int size){
        this.size = size;
        stack = new Mahasiswa20[size];
        top =-1;
    }

    public boolean isFull(){
        if (top==size-1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (top== -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa20 mhs){
        if (!isFull()) {
            top++;
            stack[top]=mhs;
        }else{
            System.out.println("Stack penuh! Tidak dapat menambahkan tugas lagi.");
        }
    }

    public Mahasiswa20 pop(){
        if (!isEmpty()) {
            Mahasiswa20 m = stack[top];
            top--;
            return m;
        } else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa20 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa20 peekFirst(){
        if (!isEmpty()) {
            return stack[0];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int peekTop(){
        if (!isEmpty()) {
            return top+1;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return 0;
        }
    }

    public void print(){
        for(int i= top; i>=0; i--){
            System.out.println(stack[i].nama+"\t"+stack[i].nim+"\t"+stack[i].kelas);
        }
        System.out.println("");
    }

    public String konversiDesimalBiner(int nilai){
        StackKonversi20 stack = new StackKonversi20();
        while (nilai>0) {
            int sisa = nilai%2;
            stack.push(sisa);
            nilai = nilai/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
