package Default;
public class Main {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>(5);

        s.push("Pune");
        s.push("Mumbai");

        System.out.println(s.peek());
        System.out.println(s.pop());
        
        DynamicStack d= new DynamicStack();
        d.push(10);
        d.push(11);
        d.push(12);
        d.push(13);
        d.push(14);
        
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        
        Palindromestack p=new Palindromestack();
        p.palindrome("aajaa");
        
        
        Queue q=new Queue<String>(4);
        
        q.insert("Rahul");
        q.insert("shubham");
        q.insert("aakash");
        q.insert("Latur");
        System.out.println(q.insert("rohit"));
        
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.insert("aftab"));
        
        DynamicQueue d1=new DynamicQueue();
        
        d1.insert(11);
        d1.insert(12);
        d1.insert(13);
        d1.insert(14);
        d1.insert(15);
        d1.insert(16);
        d1.insert(17);
        d1.insert(18);
        
        System.out.println(d1.delete());
        System.out.println(d1.delete());
        System.out.println(d1.delete());
        System.out.println(d1.delete());
        System.out.println(d1.delete());
        
        
        
    }
}
