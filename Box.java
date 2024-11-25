public class Box<T> {
    private T item;

    public T getItem() {
        if (this.item == null) throw new IllegalStateException("Коробка пуста.");
        T temp = this.item;
        this.item = null;
        return temp;
    }
    public void setItem(T item) {
        if (this.item != null) throw new IllegalStateException("Коробка уже содержит объект.");
        this.item = item;
    }
    public boolean isEmpty() {
        return this.item == null;
    }


}
