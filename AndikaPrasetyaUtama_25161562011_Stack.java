public class AndikaPrasetyaUtama_25161562011_Stack {

    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;

    // === BAGIAN 2: Operasi Stack ===

    // Method push
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    // Method pop
    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String data = stack[top];
            top--;
            return data;
        }
    }

    // Method peek
    static String peek() {
        if (isEmpty()) {
            return "Stack kosong";
        } else {
            return stack[top];
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    // Bonus: hitung total harga
    static void hitungTotal() {
        int total = 0;
        for (int i = 0; i <= top; i++) {
            String tiket = stack[i];
            String hargaStr = tiket.substring(tiket.indexOf("Rp") + 2).replace(".", "");
            total += Integer.parseInt(hargaStr);
        }
        System.out.println("Total transaksi: Rp" + String.format("%,d", total).replace(",", "."));
    }

    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {

        // Push data
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        // Bonus total
        hitungTotal();

        tampilkanStack();

        // Peek
        System.out.println("Tiket terakhir masuk: " + peek());

        // Pop
        System.out.println("Tiket dibatalkan: " + pop());

        tampilkanStack();
    }
}
