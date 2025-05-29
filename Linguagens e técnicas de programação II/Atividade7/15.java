public int posicaoElemento(T valor) {
    Node<T> atual = inicio;
    int pos = 0;
    while(atual != null) {
        if(atual.dado.equals(valor)) return pos;
        atual = atual.prox;
        pos++;
    }
    return -1;
}
