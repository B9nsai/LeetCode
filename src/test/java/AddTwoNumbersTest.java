import org.example.AddTwoNumbers;
import org.example.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setup() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void shouldAddListNodes() {
        // 342 + 465 = 807
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4, node1);
        ListNode node3 = new ListNode(2, node2);

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(6, node1);
        ListNode node6 = new ListNode(5, node2);

        ListNode expected1 = new ListNode(8);
        ListNode expected2 = new ListNode(0, expected1);
        ListNode expected3 = new ListNode(7, expected2);

        ListNode actual = addTwoNumbers.addTwoNumbers(node3, node6);

        Assertions.assertEquals(expected3.getVal(), actual.getVal());
        actual = actual.getNext();
        Assertions.assertEquals(expected2.getVal(), actual.getVal());
        actual = actual.getNext();
        Assertions.assertEquals(expected1.getVal(), actual.getVal());
    }
}
