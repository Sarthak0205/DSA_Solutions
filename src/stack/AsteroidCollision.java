package stack;

import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Stack;

public class AsteroidCollision {
//    public int[] asteroidCollision(int[] asteroids) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int a : asteroids) {
//            list.add(a);
//        }
//        boolean collision = true;
//        while (collision) {
//            collision = false;
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i) > 0 && list.get(i + 1) < 0) {
//                    int leftEle = Math.abs(list.get(i));
//                    int rightEle = Math.abs(list.get(i + 1));
//                    if (leftEle < rightEle) list.remove(i);
//                    else if (leftEle > rightEle) list.remove(i + 1);
//                    else {
//                        list.remove(i);
//                        list.remove(i);
//                    }
//                    collision = true;
//                    break;
//                }
//            }
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }

    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            boolean alive = true;
            int currAsteroid = asteroids[i];
            while(!stack.isEmpty() && stack.peek()>0 && currAsteroid<0 ){
                int top=stack.peek();
                if (Math.abs(top) > Math.abs(currAsteroid)){
                    alive=false;
                    break;
                } else if (Math.abs(top)<Math.abs(currAsteroid)) {
                    stack.pop();
                    continue;
                }
                else {
                    stack.pop();
                    alive = false;
                    break;
                }
            }
            if(alive) stack.push(currAsteroid);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}