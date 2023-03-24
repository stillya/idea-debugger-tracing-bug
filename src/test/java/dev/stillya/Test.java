package dev.stillya;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Test {

  @Mock
  private StubExample stubExample;

  @org.junit.jupiter.api.Test
  void test() {
    var list = new ArrayList<String>();
    var result = stubExample.testEnterd(list);

    Assertions.assertEquals(1, list.size());
    Assertions.assertEquals("Hello world! 3", result);
  }

}
