import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function FetchData() {
    const [posts, setposts] = useState([]);
    useEffect(() => {
        axios.get('https://jsonplaceholder.typicode.com/users').then(res => {
            console.log(res.data);
            setposts(res.data);
        }).catch((err) => {
            console.log(err);
        })
    },[])


    return (
        <>
        <div>
        <ul>
       
        {posts.map(post=>(
            <li key={posts.id}>{post.name}</li>
        ))}
        
        </ul>
        </div>
        </>
    )
}
