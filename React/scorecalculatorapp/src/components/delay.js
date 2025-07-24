// function delay(seconds){
//     return new Promise((resolve)=>setTimeout(resolve,seconds*1000));
// }


// async function f1(param) {
//     await delay(param);
// }
// 8
// async function hello(){
//     for(let i=0;i<5;i++){
//         console.log(i);
//         await f1(1);
//     }
// }
// hello();


// {
//   "sima patil": [
//     { name: "bakery", quantity: 10, price: 100 }
//   ],
//   "ram Syam": [
//     { name: "bicscuit", quantity: 10, price: 10 }
//   ]
// }

// let str = `  
// sima patil bakery 10 100  
// ram Syam bicscuit 10 10  
// `;

// arr=str.trim().split(/\s+/)
// console.log(arr);

// res=[]
// k=0
// for(let i=0;i<arr.length-1;i+=5){
//     respObj={}
//     first_key=arr[i]+" "+arr[i+1]
//     obj={
//         name:arr[i+2],
//         quantity: parseInt(arr[i+3]),
//         price:parseInt(arr[i+4])
//     }
//     if(!respObj[first_key]){
//         respObj[first_key]=[]
//     }
//     respObj[first_key].push(obj);
//     res.push(respObj);
// }

// console.log(res);


