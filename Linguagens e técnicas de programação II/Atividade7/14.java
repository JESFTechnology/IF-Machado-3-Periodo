public boolean existe(T elemento) {
    int i = inicio;
    while(i != fim) {
        if (fila[i].equals(elemento)) return true;
        i = (i + 1) % tamanho;
    }
    return false;
}
