class Queue {
    constructor() {
        this.items = [];
    }
    push(element) {
        this.items.push(element);
    }
    isEmpty() {
        return this.items.length == 0;
    }
    pop() {
        if (this.isEmpty) {
            console.log("Queue is Underflow");
        }
        else {
            this.items.shift();
        }
    }
    peek() {
        console.log(this.items[this.items.length - 1]);
    }
    printQueue() {
        console.log(' ');
        for (let i = 0; i < this.items.length; i++) {
            process.stdout.write(this.items[i] + ' ');
        }
    }
}
let queue_stack=new Queue();
queue_stack.printQueue();
queue_stack.push(10);
queue_stack.push(20);
queue_stack.push(30);
queue_stack.push(40);
queue_stack.printQueue();

queue_stack.peek();

