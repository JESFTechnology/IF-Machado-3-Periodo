public boolean estaOrdenada() {
    Node<Integer> atual = inicio;
    while(atual != null && atual.prox != null) {
        if(atual.dado > atual.prox.dado) return false;
        atual = atual.prox;
    }
    return true;
}
