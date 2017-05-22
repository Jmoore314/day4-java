class FDemo {
  int x;

  FDemo(int i) {
    x = i;
  }

  //called when the object is recycled
  protected void finalize() {
    System.out.println("Finalizing " + x);
  }

  //generates an object that is immediately destroyed
  void generator(int i) {
    FDemo o = new FDemo(i);
  }
}


class Finalize {

  public static void main(String[] args){
    int count;

    FDemo ob = new FDemo(0);
    /* now generate a large number of objects. At some point, garbage collection will occur. Note: you might need to increase the number of objects created in order to force garbage collection.*/

    for (count = 1; count < 650_000; count++) {
      ob.generator(count);
    }
  }  
}