/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtabel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  public void test(){

    HashTable<String, Integer> grades = new HashTable<String, Integer>();

    assertTrue(grades.isEmpty());

    grades.add("Hatem",100);
    assertEquals(1,grades.getSize());

    grades.add("Tareq", 30);
    assertEquals(2,grades.getSize());
    assertFalse(grades.isEmpty());

    grades.remove("Tareq");
    assertEquals(1,grades.getSize());

    assertTrue(grades.contains("Hatem"));
    assertFalse(grades.contains("Doaa"));

    grades.remove("Hatem");
    assertTrue(grades.isEmpty());


  }
}