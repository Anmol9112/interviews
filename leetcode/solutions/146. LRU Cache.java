class LRUCache {
    final Node head=new Node();
    final Node tail=new Node();
    Map<Integer,Node> node_map;
    int cache_capacity;
    
    public LRUCache(int capacity) {
      node_map= new HashMap(capacity);
        this.cache_capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        int result=-1;
        Node node=node_map.get(key);
        if(node!=null){
            remove(node);
            add(node);
            result=node.val;
        }
        return result;
    }
    
    public void put(int key, int value) {
     Node node=node_map.get(key);
        if(node!=null){
            remove(node);
            node.val=value;
            add(node);
        }else{
            if(node_map.size()==cache_capacity){
                node_map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node=new Node();
            new_node.key=key;
            new_node.val=value;
            node_map.put(key,new_node);
            add(new_node);
        }
