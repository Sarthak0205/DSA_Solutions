package stack;

import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack  = new Stack<>();
        String[] parts = path.split("/");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isEmpty() || parts[i].equals(".")){
                continue;
            }
            else if (parts[i].equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
            else stack.push(parts[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(String folder:stack){
            sb.append("/");
            sb.append(folder);
        }

        return sb.isEmpty() ?"/":sb.toString();
    }

    static void main() {
        String path = "/home//foo/";
        String answer = simplifyPath(path);
        System.out.println(answer);
    }
}
