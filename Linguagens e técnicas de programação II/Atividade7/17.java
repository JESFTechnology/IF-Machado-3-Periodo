public int quantidade() {
    int cont = 0;
    Node<T> atual = inicio;
    while(atual != null) {
        cont++;
        atual = atual.prox;
    }
    return cont;
}
