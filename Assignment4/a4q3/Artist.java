package q3;
class Artist {
    public static void main(String[] args){
        Rectangle rec = new Rectangle(3,4);
        drawObject(rec);
    }

    public static void drawObject(Drawable x){
        x.draw();
    }
}