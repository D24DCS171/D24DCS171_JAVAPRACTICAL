import java.util.ArrayList;

public class prac38 {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            return null;  
        }
        return list.get(list.size() - 1); 
    }

    
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1); 
    }

    public void push(Object o) {
        list.add(o);  
    }

    public static void main(String[] args) {
      prac38 stack = new prac38();

        
        stack.push(10);
        stack.push(20);
        stack.push("Hello");

        
        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop (peek): " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.getSize());
    }
}
