package headfirst.designpatterns.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Lower Case Input Stream class.
 */
public class LowerCaseInputStream extends FilterInputStream {

  /**
   * Creates a <code>FilterInputStream</code> by assigning the  argument <code>in</code> to the
   * field
   * <code>this.in</code> so as to remember it for later use.
   *
   * @param in the underlying input stream, or <code>null</code> if this instance is to be created
   * without an underlying stream.
   */
  protected LowerCaseInputStream(InputStream in) {
    super(in);
  }

  /**
   * Read the next byte of data from an input stream and modify it to lower case.
   *
   * @return the next byte of data
   */
  public int read() throws IOException {
    int c = super.read();
    return c == -1 ? c : Character.toLowerCase((char) c);
  }

  /**
   * Read up to `byte.length()` bytes of data from an input stream and modify it to lower case.
   *
   * @param b the buffer into which the data is read.
   * @param offset the start offset in the destination array `b`.
   * @param len the maximum number of bytes read.
   * @return the total number of bytes read into buffer
   */
  public int read(byte[] b, int offset, int len) throws IOException {
    int result = super.read(b, offset, len);
    for (int i = offset; i < (offset + result); i++) {
      b[i] = (byte) Character.toLowerCase((char) b[i]);
    }
    return result;
  }
}
