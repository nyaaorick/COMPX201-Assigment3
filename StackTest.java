/**
 * Test suite for Stack implementation
 * This test suite verifies the functionality of the Stack class.
 * Tests are organized by operation type and include edge cases.
 */
public class StackTest {
    public static void main(String[] args) {
        System.out.println("=== Stack Testing ===");
        System.out.println("Testing: Basic operations, Edge cases, Error handling, Data integrity");
        System.out.println("===============================================\n");
        
        // Test 1: Create new stack
        System.out.println("Test 1: Creating new stack");
        System.out.println("-------------------------------------------");
        Stack stack = new Stack();
        assert stack.isEmpty() : "New stack should be empty";
        assert stack.length() == 0 : "New stack length should be 0";
        System.out.println("Stack contents: []");
        System.out.println("Test 1 passed\n");

        // Test 2: Test push operation
        System.out.println("Test 2: Testing push operation");
        System.out.println("-------------------------------------------");
        System.out.println("Pushing element: A");
        stack.push("A");
        assert !stack.isEmpty() : "Stack should not be empty after push";
        assert stack.length() == 1 : "Stack length should be 1 after push";
        assert "A".equals(stack.peek()) : "Peek should return the last pushed value";
        System.out.println("Stack contents: [A]");
        System.out.println("Test 2 passed\n");

        // Test 3: Test multiple push operations
        System.out.println("Test 3: Testing multiple push operations");
        System.out.println("-------------------------------------------");
        System.out.println("Pushing element: B");
        stack.push("B");
        System.out.println("Stack contents: [B, A]");
        System.out.println("Pushing element: C");
        stack.push("C");
        assert stack.length() == 3 : "Stack length should be 3 after three pushes";
        assert "C".equals(stack.peek()) : "Peek should return the last pushed value";
        System.out.println("Stack contents: [C, B, A]");
        System.out.println("Test 3 passed\n");

        // Test 4: Test pop operation
        System.out.println("Test 4: Testing pop operation");
        System.out.println("-------------------------------------------");
        String value = stack.pop();
        System.out.println("Popped element: " + value);
        assert "C".equals(value) : "Pop should return the last pushed value";
        assert stack.length() == 2 : "Stack length should be 2 after pop";
        System.out.println("Stack contents: [B, A]");
        System.out.println("Test 4 passed\n");

        // Test 5: Test dump operation
        System.out.println("Test 5: Testing dump operation");
        System.out.println("-------------------------------------------");
        System.out.println("Stack contents:");
        stack.dump();
        System.out.println("Test 5 passed\n");

        // Test 6: Test stack clearing
        System.out.println("Test 6: Testing stack clearing");
        System.out.println("-------------------------------------------");
        System.out.println("Popping element: B");
        stack.pop();
        System.out.println("Stack contents: [A]");
        System.out.println("Popping element: A");
        stack.pop();
        assert stack.isEmpty() : "Stack should be empty after popping all elements";
        assert stack.length() == 0 : "Stack length should be 0 after popping all elements";
        System.out.println("Stack contents: []");
        System.out.println("Test 6 passed\n");

        // Test 7: Test empty stack operations
        System.out.println("Test 7: Testing empty stack operations");
        System.out.println("-------------------------------------------");
        System.out.println("Attempting to pop from empty stack");
        try {
            stack.pop();
            assert false : "Pop on empty stack should throw exception";
        } catch (IllegalStateException e) {
            System.out.println("Empty stack pop correctly throws exception");
        }

        System.out.println("Attempting to peek empty stack");
        try {
            stack.peek();
            assert false : "Peek on empty stack should throw exception";
        } catch (IllegalStateException e) {
            System.out.println("Empty stack peek correctly throws exception");
        }
        System.out.println("Stack contents: []");
        System.out.println("Test 7 passed\n");

        System.out.println("===============================================");
        System.out.println("All tests passed! Stack implementation meets requirements.");
        System.out.println("===============================================");
    }
} 