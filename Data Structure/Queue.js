class Queue{
    constructor(){
        this.items=[];
    }
    enQueue(element){
        this.items.push(element);
    }
    deQueue()
    {
        if(this.isEmpty())
        {
            console.log( 'Under flow');
        }
        else{
            this.items.shift();
        }
    }
    isEmpty=()=>{
        if(this.items.length==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    front(){
        if(this.isEmpty())
        {
            return 'Under flow'
        }
        else{
                console.log(this.items[0]);
        }
     
    }
    printQueue()
    {
        let str='';
        for(let i=0;i<this.items.length;i++)
        {
            process.stdout.write(this.items[i]+" ");
        }
    }
   
  

}


    let  queue=new Queue();
    queue.front();
    queue.enQueue(10);
      queue.enQueue(20);
      queue.enQueue(30);
      queue.enQueue(40);
      queue.enQueue(50);

      queue.front();
        
    queue.printQueue();
queue.deQueue();
console.log(" ");
        
    queue.printQueue();


