public class Node {
    private Integer value;
    private Node parent, left, right;

    public Node(){
      this.value = null;
      this.parent = null;
      this.left = null;
      this.right = null;
    }
    
    public void add(int x){
        if (this.value == null){
            this.value = x;
        }

        else if (x > this.value){
            if (this.right == null){
                this.right = new Node();
                this.right.parent = this;
            }
            this.right.add(x);
        }

        else {
            if (this.left == null){
                this.left = new Node();
                this.left.parent = this;
            }
            this.left.add(x);
        }
    }

    public boolean del(int x){
        if (this.value == null){
            return false;
        }

        if (this.value == x){
            if (this.left == null && this.right == null){
                replaceNode(null);
            }
            else if (this.left != null && this.right == null){
                replaceNode(this.left);
            }
            else if (this.left == null && this.right != null){
                replaceNode(this.right);
            }
            else {
                Node minNode = findMin(this.right);
                this.value = minNode.value;
                this.right.del(minNode.value);
            }
            return true;
        }
        else if (x < this.value && this.left != null){
            return this.left.del(x);
        }
        else if (x > this.value && this.right != null){
            return this.right.del(x);
        }
        return false;
    }

    private void replaceNode(Node node){
        if (this.parent != null){
            if (this == this.parent.left){
                this.parent.left = node;
            }
            else {
                this.parent.right = node;
            }

            if (node != null){
                node.parent = this.parent;
            }
        }
        else {
            if (node != null){
                this.value = node.value;
                this.left = node.left;
                this.right = node.right;
                if (this.left != null) this.left.parent = this;
                if (this.right != null) this.right.parent = this;
            }
            else {
                this.value = null;
                this.left = null;
                this.right = null;
            }
        }

    }

    private Node findMin(Node node){
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    public boolean has(int x){
        if (this.value == null) return false;
        if (this.value == x) return true;
        else if (x < this.value && this.left != null) return this.left.has(x);
        else if (x > this.value && this.right != null) return this.right.has(x);
        return false;
    }

    public String toString(){
        String leftStr = this.left == null ? "" : this.left.toString();
        String rightStr = this.right == null ? "" : this.right.toString();
        return leftStr + " " + this.value + " " + rightStr;
    }
}
