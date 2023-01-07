class Stack{
    constructor(){
        this.items=[];
    }
    push=(element)=>{
        this.items.push(element);
    }
    pop(){
        if(this.isEmpty()){
            console.log( "Stack is underflow");
        }
        else{
            this.items.pop();
        }
    }
    peek(){
      
        if(this.isEmpty()){
            console.log( "Stack is underflow");
        }
        else{
            console.log("");
            console.log(this.items[this.items.length-1]);
        }
    }
    isEmpty(){
        return this.items.length==0;
    }
    printStack(){
        // let str='';
        console.log("");
        for(let i=0;i<this.items.length;i++){
            // str += this.items[i]+' ';
          process.stdout.write(this.items[i]+" ");
        }
     
    }
}

let mystact=new Stack();
// stact.printStack();
mystact.push(1);
mystact.push(2);
mystact.push(3);
mystact.push(4);
mystact.push(5);
// mystact.printStack();

mystact.peek();
// mystact.printStack();

// mystact.pop();
// mystact.printStack();


