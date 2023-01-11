function titleCase(sentense) {
    let str=sentense.split(" ");
  
    for (var i = 0; i < str.length; i++) {
      str[i]=str[i][0].toUpperCase()+str[i].substring(1);
  
      
    }
    return str.join().replace(/,/g," ");
  }
  
  console.log(titleCase("I'm a little tea pot"));