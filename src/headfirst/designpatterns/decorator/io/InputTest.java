package headfirst.designpatterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Input Test class (Client Code).
 */
public class InputTest {

  public static void main(String[] args) {
    int c;
    try {
      /*
       * 1. Create a `FileInputStream` by opening a connection to an actual file.
       * 2. Decorate the stream with `BufferedInputStream`.
       * 3. Decorate the stream with `LowerCaseInputStream` declared by me.
       */
      InputStream in =
          new LowerCaseInputStream(
              new BufferedInputStream(
                  new FileInputStream("resources/test.txt")));

      while ((c = in.read()) >= 0) {    // read and convert up to end of the stream.
        System.out.print((char) c);
      }

      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
