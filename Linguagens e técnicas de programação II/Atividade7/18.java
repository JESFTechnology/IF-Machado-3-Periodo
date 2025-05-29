public void converter(int num, int base) {
    Stack<Integer> pilha = new Stack<>();
    while(num > 0) {
        pilha.push(num % base);
        num /= base;
    }
    while(!pilha.isEmpty()) {
        System.out.print(pilha.pop());
    }
    System.out.println();
}
