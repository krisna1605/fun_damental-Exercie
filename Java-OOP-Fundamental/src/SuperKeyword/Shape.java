package SuperKeyword;

class Shape {
    int corner;

    public int getCorner() {
        return corner;
    }

    public void setCorner(int corner) {
        this.corner = corner;
    }
}



class Rectangle extends Shape{
    String name;

    public int getCorner(){
        return 4;
    }
    int getParentCorner() {
        return super.getCorner();
    }
    String namaBentuk(){
        return name;
    }
    int namaBentukParent(){
       return corner;
    }
}
