package Themes;

public class ClassBox {
    double height;
    double width;
    double length;

    ClassBox(double height, double width, double length){
        this.height = height;
        this.width= width;
        this.length = length;
    }
    //если хотим, чтобы коробка была квадратной
    ClassBox(double size) {
        height = size;
        width= size;
        length = size;
    }
    //можно вызывать объект класса в качестве параметра
    ClassBox(ClassBox box){
        this.height = box.height;
        this.width= box.width;
        this.length = box.length;
    }

    void setDimens(double height, double width, double length){
        this.height = height;
        this.width= width;
        this.length = length;
    }
    double volume() {
        return width * height * length;
    }

    int compare(ClassBox box){
        double thisVolume = volume();
        double boxVolume = box.volume();
        if(thisVolume>boxVolume){
            return 1;
        }
        else if(thisVolume<boxVolume){
            return -1;
        }
        else{
            return 0;
        }
    }

    ClassBox increase(){
        ClassBox box = new ClassBox(2* height, 2* width, 2* length);
        return box;
    }

}
