package tree;

public abstract class Trie {

    public Trie() {

    }

    public void insert(String word) {

    }

    abstract boolean search(String word);

    abstract boolean startsWith(String prefix);
}
