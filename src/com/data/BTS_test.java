package com.data;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BTS_test {
    public static void main(String[] args) {
        HashMap<Character, LinkedList<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> dist = new HashMap<>();

        // s顶点的邻接表

        LinkedList<Character> list_s = new LinkedList<Character>();

        list_s.add('A');

        list_s.add('B');

        LinkedList<Character> list_a = new LinkedList<Character>();

        list_a.add('C');

        list_a.add('D');

        LinkedList<Character> list_b = new LinkedList<Character>();

        list_b.add('D');

        list_b.add('E');

        LinkedList<Character> list_c = new LinkedList<Character>();

        list_c.add('E');

        LinkedList<Character> list_d = new LinkedList<Character>();

        list_c.add('E');


        //构造图

        graph.put('S', list_s);

        graph.put('A', list_a);

        graph.put('B', list_b);

        graph.put('C', list_c);

        graph.put('D', list_d);

        graph.put('E', new LinkedList<Character>());


        //调用

        BFS.bfs(graph, dist, 'S');

    }

}
class BFS {
    //存放节点关系的hashtable
    public static void bfs(HashMap<Character, LinkedList<Character>> graph, HashMap<Character, Integer> dist, Character s) {
        //建立队列
        Queue<Character> q = new LinkedList<>();
        //给定起始节点
        Character start = s;
        //起始节点放到距离表中
        dist.put(start, 0);
        ((LinkedList<Character>) q).add(start);
        //遍历,一定要取出栈顶节点再加入
        while (q != null) {
            //取出栈顶节点和栈顶节点到起始节点的距离
            Character poll = q.poll();
            if(poll == null){
                break;
            }
            Integer distance = dist.get(poll);
            System.out.println("节点" + poll + "到起始节点" + start + "的距离为" + distance);
            distance++;
            //将邻接节点加入
            for (Character c : graph.get(poll)) {
                //如果没遍历过这个节点,加入到队列和距离表中
                if (!dist.containsKey(c)) {
                    dist.put(c, distance);
                    q.offer(c);
                }
            }
        }

    }
}
