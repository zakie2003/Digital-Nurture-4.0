import React, { useEffect, useState } from "react";

function Timer(){
    const [seconds,setSeconds]=useState(0);
    const [minutes,setMinutes]=useState(0);
    const [resume,setResume]=useState(false);
    const [flag,setFlag]=useState(false);
    useEffect(()=>{
        if(resume){
            let interval=setInterval(()=>{
                setSeconds((t)=>(t+1)%60);
            },1000);
            return ()=> clearInterval(interval);
        }
    },[resume]);


    useEffect(()=>{
        if(seconds==59){
            setFlag(true);
        }
        if(flag==true && seconds==0){
            setMinutes((m)=>m+1);
            setSeconds(0);
        }
    },[seconds])

    return(
        <>
            <h1>{minutes}:{seconds}</h1>
            <button onClick={()=>{setResume(true)}}>Start</button>
            <button onClick={()=>setResume(false)}>Pause</button>
            <button onClick={()=>{setMinutes(0);setSeconds(0);}}>Reset</button>
        </>
    )
}

export default Timer;