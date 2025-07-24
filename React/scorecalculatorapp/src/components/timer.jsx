const { useState, useEffect } = require("react");

function Timer(){
    const [time,settime]=useState(0);
    const [resume,setResume]=useState(false);

    useEffect(()=>{
        if(resume){
            const interval=setInterval(()=>{
                settime((t)=>t+1);
            },1000);
            return ()=>clearInterval(interval);
        }
    },[resume]);

    useEffect(()=>{
        console.log(time);
    },[time])


    // console.log(time);

    return (
        <>
            <h1>{time} Seconds</h1>
            <button onClick={()=>setResume(true)}>Start</button>
            <button onClick={()=>setResume(false)}>Pause</button>
            <button onClick={()=>settime(0)}>Reset</button>
        </>
    )
}

export default Timer;