import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function FetchData() {
    const [post, setpost] = useState([]);
    const [id, setid] = useState(1);
    useEffect(() => {
        axios.get(`https://jsonplaceholder.typicode.com/users/${id}`)
            .then(res => {
                console.log(res.data);
                setpost(res.data);
            }).catch((err) => {
                console.log(err);
            })
    }, [id])


    return (
        <>
            <div>
                <input type="text" placeholder='Id' value={id} onChange={e => setid(e.target.value)} name="" id="" />
                <div>{post.name}</div>
            </div>
        </>


    );
}
