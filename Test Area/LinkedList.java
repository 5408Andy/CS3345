public class LinkedList <gList> {

    Node<gList> headNode;

    private class Node <gNode>  {

        private gNode genericData;
        private Node<gNode> nextNode;

        Node() {

            genericData = null;
            nextNode = null;

        }

        Node(gNode receivedData) {

            genericData = receivedData;
            nextNode = null;

        }

        // Getter Methods
        public gNode getGenericData() { return genericData; }
        public Node<gNode> getNextNode() { return nextNode; }

        // Setter Methods
        public void setGenericData(gNode receivedData) { genericData = receivedData; }
        public void setNextNode(Node<gNode> receivedNode) { nextNode = receivedNode; }

    }

    // append data received to link list
    public void appendData(gList receivedData) {

        if (headNode == null) { // there is no head node

            headNode = new Node<gList>(receivedData);

        }
        else { // there is a head node

            Node<gList> currentNode = headNode;
            while (currentNode.getNextNode() != null) {

                currentNode = currentNode.getNextNode();

            }

            currentNode.setNextNode(new Node<gList>(receivedData));

        }

    }

    public void deleteEndData() {

        if (headNode == null) {

            

        }

        Node<gList> currentNode = headNode;
        Node<gList> previousNode = null;
        while (currentNode != null) {

            previousNode = currentNode;
            currentNode = currentNode.getNextNode();

        }

        previousNode.setNextNode(null);

    }

    // print out the data of the linked list
    public void printList() {

        if (headNode == null) {

            System.out.println("List is empty!");
            return;

        }
        else {

            Node<gList> currentNode = headNode;
            while (currentNode != null) {

                System.out.println(currentNode.getGenericData());
                currentNode = currentNode.getNextNode();

            }

        }

    }


}