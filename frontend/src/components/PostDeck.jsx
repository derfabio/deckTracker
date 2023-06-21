import { useState, useEffect } from 'react';

export default function PostComponent() {
    // Declare a new state variable to store the server response
    const [response, setResponse] = useState('');

    useEffect(() => {
        // Define the fetch function
        const postData = () => {
            // The data you want to send in the POST request
            const data = { key: "value" };

            // The fetch API is used to make the HTTP request
            fetch("http://localhost:8080/api/decks/newDeck", {
                method: "POST", 
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(data),
            })
            .then(response => response.json()) // parsing the response data as JSON
            .then(data => {
                // Updating the state with the server response
                setResponse(data);
            })
            .catch((error) => {
                console.error('Error:', error);
            });
        };

        // Call the function to make the request
        postData();
    }, []); // Empty array ensures the effect only runs once on mount and not on updates

    // Display the server's response
    return (
        <div>
            <h1>Deck saved:</h1>
            <p>{JSON.stringify(response)}</p>
        </div>
    );
}
