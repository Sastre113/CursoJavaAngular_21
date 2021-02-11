/**
 * 
 */
package Main;

/**
 * @author Miguel A. Sastre
 *
 */
class Pair<K, V> {

    private final K izquierda;
    private final V right;

    public Pair(K izquierda, V right) {
        this.izquierda = izquierda;
        this.right = right;
    }

    public K getLeft() {
        return izquierda;
    }

    public V getRight() {
        return right;
    }

}