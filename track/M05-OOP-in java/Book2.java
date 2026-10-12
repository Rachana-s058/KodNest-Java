
public class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public void getData() {
        return pageNum;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        System.out.println(b.getData());
    }
}
