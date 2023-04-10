//GENERIC - when creating instance of class
// we can show what type of object will be used in this class
// for this will use <T> and write this type in between symbols
//then we will put the data type to T (linked data type)

import javax.tools.FileObject;

public class Box<T,I,F>{
    private T object;
    private I object2;
    private F object3;

    public I getObject2() {
        return object2;
    }

    public void setObject2(I object2) {
        this.object2 = object2;
    }

    public F getObject3() {
        return object3;
    }

    public void setObject3(F object3) {
        this.object3 = object3;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }


    public Box(T object,I object2, F object3) {
        this.object = object;
        this.object2 = object2;
        this.object3 = object3;
    }
}
//Стирание типа - information of type-parameter access
// only in stage of compiling and no available in the execution