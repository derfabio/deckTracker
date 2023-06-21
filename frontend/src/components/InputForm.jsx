import { useState } from 'react';

export default function InputForm() {
    const [deckName, setDeckName] = useState('');
    const [format, setFormat] = useState('');
    const handleSubmit = (event) => {
        event.preventDefault();
        fetch('http://localhost:8080/api/decks/newDeck', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({deckName, format}),
        })
        .then(response => response.json()) 
        .then(data => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });
        console.log(deckName);
        console.log(format);
        setDeckName('');
        setFormat('');
    };

    const handleInputChange = (event) => {
        setDeckName(event.target.value);
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Deck name:
                <br />
                <input type="text" name="name" value={deckName} onChange={handleInputChange} />
            </label>
            <input type="submit" value="Submit" />
            <br />
            <select value={format} onChange={(e) => setFormat(e.target.value)} required>
                <option value="">Choose format</option>
                <option value="STANDARD">Standard</option>
                <option value="COMMANDER">Commander</option>
                <option value="PAUPER">Pauper</option>
            </select>
        </form>
    );
}
